# Deploy de devs-a04 en el server PUE (172.16.248.200)

Objetivo: que `devs-a04` corra igual que `devs-a02`: dos contenedores (`a04-backend`, `a04-frontend`)
levantados desde `pue-platform/qa.yml` dentro de la red `app0-network`, publicados por el
`api-gateway` (nginx) bajo `https://ingarue.santafe-conicet.gov.ar/a04/` (UI) y `/b04/` (API).

---

## 1. Análisis

### 1.1 Cómo funciona hoy devs-a02

| Pieza | devs-a02 |
|---|---|
| Imágenes | `a02-backend`, `a02-frontend`. Se construyen en el server con `docker compose build` dentro de `devs-a02/` (no hay registry) |
| Backend | Spring Boot, `server.port=${SERVER_PORT}` (8092), `server.servlet.context-path=${SERVER_PATH}` (`/b02`) |
| Frontend | Webpack con `publicPath: '/a02/'`; nginx interno sirve en `location /a02` con `alias`; llama a la API con `BASE_URL = '/b02'` (ruta relativa al mismo dominio) |
| Ejecución en QA | `pue-platform/qa.yml` declara `a02-backend` y `a02-frontend` con `image:` (sin `build:`), puertos `8092:8092` y `3002:80`, variables `A02_*` en `.env_qa` |
| Gateway | `pue-platform/docker/api-gateway-qa/conf.d/nginx.conf`: upstreams `a02-api → a02-backend:8092`, `a02-ui → a02-frontend`; locations `/b02/` y `/a02/` |
| Local | `devs-a02/qa.yml` agrega un nginx propio (`nginx-local/conf.d`) que imita al gateway para probar en la PC |

El navegador sólo ve el gateway: `/a02/...` va al contenedor del frontend y `/b02/...` al backend.
Como todo sale del mismo dominio, no hay CORS.

### 1.2 Cómo viene devs-a04 (lo que pasó el junior)

| Pieza | devs-a04 actual | Problema para el gateway |
|---|---|---|
| `qa.yaml` | servicios `backend`/`frontend`, contexts `./Mapper_DEVS` y `./DevsLangWebEditor` | Las carpetas ya no existen (se renombraron a `devs-backend`/`devs-web-app`); nombres genéricos que chocarían en `app0-network`; publica el puerto **80**, que en el server ya ocupa el api-gateway |
| Backend `application.properties` | sólo `spring.application.name`; puerto 8080 por defecto, sin context-path | 8080 sin prefijo: hay que darle puerto y path propios (`8094`, `/b04`) |
| Controller | `@RequestMapping("/api/devs")` + `@CrossOrigin("http://localhost:3000")` | Funciona, pero con context-path queda en `/b04/api/devs/map`. El `@CrossOrigin` no hace falta detrás del gateway (mismo origen) |
| Frontend `MapperDevsApi.ts` | `fetch('/api/devs/map')` | `/api/` en el gateway no existe (o choca con `/api/app6/`...). Hay que pasar a `/b04/api/devs/map` |
| `webpack.config.js` | sin `publicPath` (bundle referenciado desde `/`) | Bajo `/a04/` el `index.html` pediría `/bundle.xxx.js` en la raíz del dominio → 404. Necesita `publicPath: '/a04/'` |
| `devs-web-app/nginx.conf` | sirve en `/` y proxyea `/api/` a `backend:8080` | Tiene que servir en `/a04` (como a02) y **no** hacer proxy: eso lo hace el gateway |
| Workers de Monaco | `getWorkerUrl` devuelve `./devsLangWorker.js` / `./editor.worker.js` (relativo) | OK siempre que se entre por `/a04/` (con barra final). Agregamos redirect `/a04 → /a04/` |
| Dockerfiles | backend multi-stage (maven → temurin-jre, `app.jar`); front multi-stage (node 18 → nginx) copiando `/app/build` | Sirven tal cual. Sólo cambia `EXPOSE` del backend y conviene copiar `package-lock.json` |
| `.env` | no existe | Crear `.env.example` / `.env` con variables `A04_*` |

### 1.3 Nombres, puertos y rutas elegidos

Siguiendo la convención aNN/bNN y verificando que no choquen con lo que ya está en el server
(8091, 8092, 3001, 3002, 3003, 8001–8003, 8081–8083, 8026–8029, 8086–8089, 5433, 3307...):

| | Nombre contenedor/servicio | Puerto interno | Puerto host | Ruta en gateway |
|---|---|---|---|---|
| Backend | `a04-backend` | 8094 | 8094 | `/b04/` |
| Frontend | `a04-frontend` | 80 | 3004 | `/a04/` |

Variables (prefijo `A04_` para convivir en `.env_qa` de pue-platform):

```
A04_SERVER_PORT=8094
A04_SERVER_PATH=/b04
```

(a04 no usa JWT ni base de datos, así que no hacen falta más variables.)

---

## 2. Cambios en devs-a04

### 2.1 Backend — `devs-backend/src/main/resources/application.properties`

```properties
spring.application.name=Mapper_DEVS
server.port=${SERVER_PORT:8094}
server.servlet.context-path=${SERVER_PATH:/b04}
```

El endpoint queda en `http://a04-backend:8094/b04/api/devs/map`.

### 2.2 Backend — `DevsMappingController.java`

Quitar `@CrossOrigin(origins = "http://localhost:3000")` (y su import). Detrás del gateway el
front y la API comparten origen. Si se quiere seguir usando `npm start` local contra el backend,
alternativa: dejarlo con `origins = {"http://localhost:3000", "http://localhost:3004"}`.

### 2.3 Backend — `devs-backend/Dockerfile`

```dockerfile
EXPOSE 8094
```

(el resto queda igual; el puerto real lo define `SERVER_PORT`).

### 2.4 Frontend — `devs-web-app/src/api/MapperDevsApi.ts`

```ts
const BASE_URL = '/b04';

export async function mapDevs(source: string): Promise<DevsMappingResponse> {
  const response = await fetch(`${BASE_URL}/api/devs/map`, {
```

Opcional: actualizar el texto `Respuesta de POST /api/devs/map` en `components/Editor/Editor.tsx:136`.

### 2.5 Frontend — `devs-web-app/webpack.config.js`

```js
  output: {
    publicPath: '/a04/',
    globalObject: 'self',
    ...
  },
  devServer: {
    port: 3000,
    hot: true,
    publicPath: '/a04/',
    historyApiFallback: { index: '/a04/' },
    openPage: 'a04/',
    proxy: { '/b04': 'http://localhost:8094' }   // para npm start contra el backend local
  }
```

Opcional: `"homepage": "/a04"` en `package.json` (como a02).

### 2.6 Frontend — `devs-web-app/nginx.conf` (mismo esquema que a02)

```nginx
server {
  listen 80 default_server;
  listen [::]:80 default_server;
  server_name localhost 127.0.0.1;

  error_page 500 502 503 504 /50x.html;
  location = /50x.html {
    root /usr/share/nginx/html;
  }

  location = /a04 {
    return 301 /a04/;
  }

  location /a04/ {
    alias /usr/share/nginx/html/;
    try_files $uri $uri/ /a04/index.html;
  }

  location / {
    return 404;
  }
}
```

Se elimina el bloque `location /api/` que hacía proxy a `backend:8080`.

### 2.7 Frontend — `devs-web-app/Dockerfile`

Cambiar `COPY package.json ./` por `COPY package*.json ./` (builds reproducibles con el lock).
El resto (salida en `/app/build`) queda igual.

### 2.8 Raíz de devs-a04 — compose y env (espejo de devs-a02)

**Borrar** `qa.yaml` (roto) y crear:

`docker-compose.yaml` — para construir las imágenes en el server:

```yaml
services:
  a04-backend:
    container_name: a04-backend
    build:
      context: ./devs-backend
      dockerfile: Dockerfile
    image: a04-backend
    restart: always
    ports:
      - 8094:8094
    environment:
      - SERVER_PORT=${A04_SERVER_PORT}
      - SERVER_PATH=${A04_SERVER_PATH}

  a04-frontend:
    container_name: a04-frontend
    build:
      context: ./devs-web-app
      dockerfile: Dockerfile
    image: a04-frontend
    restart: always
    ports:
      - 3004:80
    depends_on:
      - a04-backend
```

`qa.yml` — igual al anterior + nginx local que imita al gateway (para probar en la PC):

```yaml
  # ...a04-backend y a04-frontend como arriba...
  nginx:
    image: nginx:stable
    volumes:
      - ./nginx-local/conf.d:/etc/nginx/conf.d
    ports:
      - 80:80
    depends_on:
      - a04-backend
      - a04-frontend

networks:
  default:
    name: devs-a04-network
```

`nginx-local/conf.d/nginx.conf` — copia del de a02 cambiando `a02→a04`, `b02→b04`, `8092→8094`.

`.env.example` y `.env`:

```
A04_SERVER_PORT=8094
A04_SERVER_PATH=/b04
```

Agregar `.env` al `.gitignore`. Actualizar el `README.md` (sacar lo de submódulos, que ya no aplica,
y documentar los comandos de arriba).

### 2.9 Prueba local antes de subir

```bash
cd devs-a04
docker compose -f qa.yml up --build
# http://localhost/a04/           → editor
# curl -X POST http://localhost/b04/api/devs/map -H 'Content-Type: application/json' \
#      -d '{"source":"..."}'      → JSON con stage/success
```

Verificar en DevTools que `bundle.*.js`, `editor.worker.js` y `devsLangWorker.js` cargan desde
`/a04/` y que el POST va a `/b04/api/devs/map`. Luego commit + push.

---

## 3. Cambios en pue-platform

### 3.1 `qa.yml` — agregar debajo de `# app devs 02`

```yaml
  # app devs 04
  a04-backend:
    container_name: a04-backend
    image: a04-backend
    restart: always
    ports:
      - 8094:8094
    environment:
      - SERVER_PORT=${A04_SERVER_PORT}
      - SERVER_PATH=${A04_SERVER_PATH}

  a04-frontend:
    container_name: a04-frontend
    image: a04-frontend
    restart: always
    ports:
      - 3004:80
    depends_on:
      - a04-backend
```

Quedan en la red `app0-network` (default de este compose), la misma del gateway.

### 3.2 `.env_qa` (y el `.env` real del server) — agregar

```
#App04
A04_SERVER_PORT=8094
A04_SERVER_PATH=/b04
```

### 3.3 `docker/api-gateway-qa/conf.d/nginx.conf`

Upstreams (junto a los de a02):

```nginx
upstream a04-api {
  server a04-backend:8094;
}
upstream a04-ui {
  server a04-frontend;
}
```

Locations dentro del `server` 443, después de `# devs a02`:

```nginx
  # devs a04
  location /b04/ {
    proxy_pass  http://a04-api/b04/;
    proxy_set_header    Host                localhost;
    proxy_set_header    X-Real-IP           $remote_addr;
    proxy_set_header    X-Forwarded-Host    $host;
    proxy_set_header    X-Forwarded-Server  $host;
    proxy_set_header    X-Forwarded-Proto   $scheme;
    proxy_set_header    X-Forwarded-For     $remote_addr;
    proxy_redirect off;
    proxy_connect_timeout 90s;
    proxy_read_timeout 90s;
    proxy_send_timeout 90s;
  }
  location = /a04 {
    return 301 /a04/;
  }
  location /a04/ {
    proxy_pass  http://a04-ui/a04/;
    proxy_set_header    Host                localhost;
    proxy_set_header    X-Real-IP           $remote_addr;
    proxy_set_header    X-Forwarded-Host    $host;
    proxy_set_header    X-Forwarded-Server  $host;
    proxy_set_header    X-Forwarded-Proto   $scheme;
    proxy_set_header    X-Forwarded-For     $remote_addr;
    proxy_redirect off;
    proxy_connect_timeout 90s;
    proxy_read_timeout 90s;
    proxy_send_timeout 90s;
  }
```

Notas:
- `proxy_read_timeout 90s`: la transformación ATL + validación OCL puede tardar con modelos grandes;
  si aparecen 504, subirlo sólo en `/b04/`.
- **Importante:** nginx resuelve los upstreams al arrancar/recargar. Si el gateway recarga
  (lo hace solo cada 6 h) con este config y `a04-backend`/`a04-frontend` no existen, falla con
  `host not found in upstream`. Por eso los contenedores a04 se levantan **antes** de recargar el gateway.

Commit + push de pue-platform.

---

## 4. Deploy en el server (172.16.248.200)

> Repos en el server: `~/dev/pue-platform`, `~/dev/devs-a02`, `~/dev/devs-a04` (usuario `fede`).
> `pue-platform/.env_qa` es réplica del `.env` que corre en el server.

```bash
ssh fede@172.16.248.200

# 1) Código de devs-a04
cd ~/dev
git clone <URL-devs-a04> devs-a04      # o: cd ~/dev/devs-a04 && git pull
cd ~/dev/devs-a04
cp .env.example .env                   # A04_SERVER_PORT=8094, A04_SERVER_PATH=/b04

# 2) Construir imágenes (a04-backend, a04-frontend) en el docker local del server
docker compose build
docker images | grep a04

# 3) Actualizar pue-platform
cd ~/dev/pue-platform
git pull
# agregar el bloque #App04 de .env_qa al .env del server (es réplica, no se versiona)

# 4) Levantar sólo los servicios nuevos (no reinicia el resto)
docker compose -f qa.yml up -d a04-backend a04-frontend
docker compose -f qa.yml ps a04-backend a04-frontend
docker logs -f a04-backend             # esperar "Tomcat started on port 8094 ... context path '/b04'"

# 5) Validar y recargar el gateway (sin cortar las otras apps)
docker compose -f qa.yml exec api-gateway nginx -t
docker compose -f qa.yml exec api-gateway nginx -s reload
#   (alternativa del README: docker compose -f qa.yml restart api-gateway)
```

**Ojo:** no usar `docker compose up` del `docker-compose.yaml` de devs-a04 en el server para correr
los contenedores (sólo para `build`): crearía otra red y otro proyecto con los mismos
`container_name`. Quien los corre es `pue-platform/qa.yml`. Nunca usar `qa.yml` de devs-a04 en el
server (su nginx quiere el puerto 80 del gateway).

### 4.1 Verificación

Desde el server:

```bash
curl -s -o /dev/null -w '%{http_code}\n' http://localhost:3004/a04/          # 200 (front directo)
curl -s -X POST http://localhost:8094/b04/api/devs/map \
     -H 'Content-Type: application/json' -d '{"source":""}'                   # 400 + JSON "vacía"
docker compose -f qa.yml exec api-gateway curl -s http://a04-frontend/a04/ | head -5
```

Desde un navegador:

- `https://ingarue.santafe-conicet.gov.ar/a04/` → carga el editor, sin 404 en la consola.
- Procesar un ejemplo (`devs-backend/src/main/resources/examples/*.txt`) → el POST a `/b04/api/devs/map`
  devuelve `COMPLETED`.

`ingarue.santafe-conicet.gov.ar` es el nombre de este server, así que se prueba directo por https.

### 4.2 Actualizaciones futuras

```bash
cd ~/dev/devs-a04 && git pull && docker compose build
cd ~/dev/pue-platform && docker compose -f qa.yml up -d a04-backend a04-frontend
```

(`up -d` recrea los contenedores si la imagen cambió.) Sin cambios de gateway no hace falta recargarlo.

### 4.3 Rollback

```bash
cd ~/dev/pue-platform
docker compose -f qa.yml stop a04-backend a04-frontend
# revertir el bloque a04 del nginx.conf del gateway ANTES del próximo reload, luego:
docker compose -f qa.yml exec api-gateway nginx -t && docker compose -f qa.yml exec api-gateway nginx -s reload
```

---

## 5. Estado de avance

> Se actualiza a medida que se avanza. Si se interrumpe, retomar desde el primer ítem sin tildar.

### devs-a04 (local, en /home/fede/dev/lab/devs-a04)

- [x] `application.properties` con `SERVER_PORT` / `SERVER_PATH` (defaults 8094 y /b04)
- [x] quitar `@CrossOrigin` localhost:3000 del controller
- [x] `EXPOSE 8094` en Dockerfile backend
- [x] `fetch(`${BASE_URL}/api/devs/map`)` con `BASE_URL = '/b04'` (+ texto en Editor.tsx)
- [x] `publicPath: '/a04/'` y devServer (proxy `/b04`) en webpack; `"homepage": "/a04"` en package.json
- [x] `nginx.conf` del front sirviendo `/a04/` (redirect `/a04` → `/a04/`), sin proxy `/api/`
- [x] `COPY package*.json` en Dockerfile front
- [x] borrar `qa.yaml`; crear `docker-compose.yaml`, `qa.yml`, `nginx-local/conf.d/nginx.conf`, `.env.example`, `.env`; `.env` en `.gitignore`
- [x] README reescrito (sin submódulos, rutas/puertos nuevos)
- [x] build local de imágenes OK (`a04-backend` 373MB, `a04-frontend` 52MB; el backend tarda ~10 min la primera vez)
- [x] prueba local OK (2026-10-30): `/a04` → 301 `/a04/`; `index.html`, bundle y workers cargan desde `/a04/`;
      backend loguea `Tomcat started on port 8094 ... context path '/b04'`; `POST /b04/api/devs/map` responde JSON
- [ ] **Observación (no es del deploy):** de los 44 ejemplos en `devs-backend/src/main/resources/examples`,
      sólo `AM_HummingbirdFeeder_Test01_MJB` llega a `COMPLETED`; 2 fallan en `COMPUTATIONAL_VALIDATION` y 41 en `PARSING`.
      Los cambios al backend fueron sólo de configuración, así que parecen ejemplos desactualizados respecto de la gramática → consultar al junior.
- [x] commit + push de devs-a04 (`main` en github.com/fhernand23/devs-a04)

### pue-platform (local, en /home/fede/dev/lab/pue-platform)

- [x] servicios `a04-backend` / `a04-frontend` en `qa.yml` (antes de `# app simmer 03`)
- [x] bloque `#App04` en `.env_qa` (archivo ignorado por git: **no viaja con el push**)
- [x] upstreams `a04-api` / `a04-ui` + locations `/b04/`, `= /a04`, `/a04/` en `docker/api-gateway-qa/conf.d/nginx.conf`
- [x] commit + push de pue-platform (`main`), sólo `qa.yml` y el nginx del gateway. Quedan sin commitear cambios ajenos previos (`README.md`, `local.yml` borrado)

### Server (fede@172.16.248.200)

- [ ] `~/dev/devs-a04`: clone/pull + `cp .env.example .env`
- [ ] `~/dev/devs-a04`: `docker compose build`
- [ ] `~/dev/pue-platform`: `git pull`
- [ ] `~/dev/pue-platform/.env`: agregar `A04_SERVER_PORT=8094` y `A04_SERVER_PATH=/b04`
- [ ] `docker compose -f qa.yml up -d a04-backend a04-frontend` + revisar logs
- [ ] `docker compose -f qa.yml exec api-gateway nginx -t` → `nginx -s reload`
- [ ] verificar https://ingarue.santafe-conicet.gov.ar/a04/ y un mapeo de ejemplo

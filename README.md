# devs-a04 - DEVS Mapper

Entorno DEVS integrado por dos componentes:

- **devs-backend** (Mapper_DEVS): procesa especificaciones textuales DEVS, genera el modelo intermedio, ejecuta validaciones EMF/OCL y transforma el modelo mediante ATL hacia el modelo computacional.
- **devs-web-app** (DevsLangWebEditor): editor web para la creación, edición y procesamiento de especificaciones DEVS.

Se despliega igual que `devs-a02`: las imágenes se construyen con este repo y los contenedores
corren desde `pue-platform/qa.yml`, publicados por el `api-gateway`.

## Arquitectura

```text
Usuario
  |
  v
api-gateway (pue-platform)
  |-- /a04/*  --> a04-frontend:80    (nginx, archivos estáticos)
  |-- /b04/*  --> a04-backend:8094   (Spring Boot, context-path /b04)
```

El frontend llama a la API con la ruta relativa `/b04/api/devs/map`.

| Servicio | Puerto interno | Puerto host | Ruta |
|---|---|---|---|
| a04-backend | 8094 | 8094 | `/b04/` |
| a04-frontend | 80 | 3004 | `/a04/` |

## Variables de entorno

Copiar `.env.example` a `.env`:

```
A04_SERVER_PORT=8094
A04_SERVER_PATH=/b04
```

## Uso local

`qa.yml` agrega un nginx que imita al api-gateway:

```bash
docker compose -f qa.yml up --build
```

- Editor: http://localhost/a04/
- API: `POST http://localhost/b04/api/devs/map` con `{"source": "..."}`

Sólo backend:

```bash
docker compose up a04-backend
```

Frontend en modo desarrollo (proxy de `/b04` a `localhost:8094`):

```bash
cd devs-web-app
npm install
npm start      # http://localhost:3000/a04/
```

## Deploy en el server

Ver [deploy-ingar.md](deploy-ingar.md).

```bash
cd ~/dev/devs-a04 && git pull && docker compose build
cd ~/dev/pue-platform && docker compose -f qa.yml up -d a04-backend a04-frontend
```

## Backend

Pipeline implementado:

```text
Especificación textual DEVS
   -> ANTLR
   -> devsModel
   -> Validación EMF / OCL
   -> Transformación ATL
   -> devsComputationalModel
   -> Validación EMF / OCL
```

Endpoint: `POST /b04/api/devs/map`.

## Tecnologías

- Backend: Java 21, Spring Boot, ANTLR, EMF, Eclipse OCL, ATL
- Frontend: React, TypeScript, Monaco Editor, Webpack, Nginx
- Despliegue: Docker, Docker Compose

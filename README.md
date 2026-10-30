# devs-a04 - DEVS-Deploy

Repositorio de despliegue e integración del entorno DEVS.

Este proyecto centraliza la configuración necesaria para ejecutar de forma integrada los componentes principales del entorno:

- **Mapper_DEVS**: backend encargado de procesar especificaciones textuales DEVS, generar el modelo intermedio, ejecutar validaciones EMF/OCL y transformar el modelo mediante ATL hacia el modelo computacional.
- **DevsLangWebEditor**: editor web para la creación, edición y procesamiento de especificaciones DEVS.

---

## Arquitectura

El entorno se ejecuta mediante dos contenedores Docker:

```text
Usuario
  |
  v
Frontend / Nginx
Puerto 80
  |
  | /api/*
  v
Mapper_DEVS
Puerto interno 8080
  |
  +--> ANTLR
  |
  +--> Modelo intermedio DEVS
  |
  +--> Validación EMF / OCL
  |
  +--> Transformación ATL
  |
  +--> Modelo computacional DEVS
  |
  +--> Validación EMF / OCL
```

El navegador accede únicamente al frontend.

Las solicitudes realizadas a:

```text
/api/*
```

son redirigidas por Nginx al servicio backend:

```text
backend:8080
```

---

## Estructura del repositorio

```text
DEVS-Deploy/
|
├── docker-compose.yml
├── .gitmodules
├── README.md
|
├── Mapper_DEVS/
|   └── Backend
|
└── DevsLangWebEditor/
    └── Frontend
```

---

## Requisitos

Para ejecutar el entorno solamente se requiere:

- Git
- Docker
- Docker Compose

No es necesario instalar localmente:

- Java
- Maven
- Node.js
- npm
- Eclipse
- ATL
- EMF
- OCL

Todas las dependencias necesarias son incorporadas durante la construcción de las imágenes Docker.

---

## Clonar el proyecto

Debido a que este repositorio utiliza submódulos Git, debe clonarse utilizando:

```bash
git clone <URL-DEVS-DEPLOY>
```

---

## Ejecutar el entorno

Desde la raíz de `DEVS-Deploy`:

```bash
docker compose up --build
```

Esto construirá y levantará:

```text
Mapper_DEVS
DevsLangWebEditor
```

Una vez iniciados los servicios, acceder desde el navegador a:

```text
http://localhost
```

---

## Ejecutar en segundo plano

Para iniciar los servicios en modo detached:

```bash
docker compose up --build -d
```

---

## Verificar el estado

Para consultar el estado de los servicios:

```bash
docker compose ps
```

Deberían aparecer los servicios:

```text
backend
frontend
```

en estado activo.

---

## Ver logs

Para visualizar los logs de todos los servicios:

```bash
docker compose logs -f
```

Logs únicamente del backend:

```bash
docker compose logs -f backend
```

Logs únicamente del frontend:

```bash
docker compose logs -f frontend
```

---

## Detener el entorno

Para detener y eliminar los contenedores:

```bash
docker compose down
```

---

## Reconstruir el entorno

Si se realizaron cambios en alguno de los proyectos:

```bash
docker compose up --build -d
```

Para forzar una reconstrucción completa:

```bash
docker compose build --no-cache
docker compose up -d
```

---

## Actualización de los submódulos

`DEVS-Deploy` referencia versiones concretas de:

- `Mapper_DEVS`
- `DevsLangWebEditor`

Esto permite mantener trazabilidad sobre qué versión del frontend y qué versión del backend forman una determinada versión del sistema.

Para obtener las versiones registradas actualmente en `DEVS-Deploy`:

```bash
git pull
git submodule update --init --recursive
```

---

## Actualizar los componentes a sus últimas versiones

Si se desea actualizar los submódulos con los últimos cambios de sus ramas configuradas:

```bash
git submodule update --remote --merge
```

Luego registrar las nuevas referencias:

```bash
git add Mapper_DEVS DevsLangWebEditor
git commit -m "Update DEVS components"
git push
```

---

## Flujo de actualización recomendado

Cuando se modifica el backend:

```text
Mapper_DEVS
   |
   | commit + push
   v
Repositorio remoto
```

Cuando se modifica el frontend:

```text
DevsLangWebEditor
   |
   | commit + push
   v
Repositorio remoto
```

Luego se actualizan las referencias desde `DEVS-Deploy`:

```bash
git submodule update --remote --merge

git add Mapper_DEVS DevsLangWebEditor

git commit -m "Update DEVS components"

git push
```

Finalmente se vuelve a desplegar:

```bash
docker compose up --build -d
```

---

## Backend

El servicio `backend` ejecuta `Mapper_DEVS`.

El pipeline implementado es:

```text
Especificación textual DEVS
        |
        v
ANTLR
        |
        v
devsModel
        |
        v
Validación EMF / OCL
        |
        v
Transformación ATL
        |
        v
devsComputationalModel
        |
        v
Validación EMF / OCL
```

El backend se ejecuta internamente en:

```text
backend:8080
```

El puerto 8080 no necesita exponerse públicamente, ya que el frontend accede al backend a través de Nginx.

---

## Frontend

El servicio `frontend` construye `DevsLangWebEditor` y utiliza Nginx para servir la aplicación.

El frontend se publica mediante:

```text
Puerto 80
```

y se accede desde:

```text
http://localhost
```

Las solicitudes al backend se realizan utilizando rutas relativas:

```text
/api/devs/map
```

Nginx se encarga de redirigir estas solicitudes hacia:

```text
http://backend:8080
```

Esto evita depender de direcciones como:

```text
localhost:8080
```

y permite desplegar el entorno en otros servidores sin modificar el código del frontend.

---

## Despliegue en servidor

En un servidor, el procedimiento general es:

```bash
git clone --recurse-submodules <URL-DEVS-DEPLOY>

cd DEVS-Deploy

docker compose up --build -d
```

Luego se puede acceder utilizando:

```text
http://IP-DEL-SERVIDOR
```

o mediante el dominio configurado para dicho servidor.

---

## Tecnologías utilizadas

### Backend

- Java 21
- Spring Boot
- ANTLR
- Eclipse Modeling Framework (EMF)
- Eclipse OCL
- ATL

### Frontend

- React
- TypeScript
- Monaco Editor
- Webpack
- Nginx

### Despliegue

- Docker
- Docker Compose
- Git Submodules

---

## Repositorios relacionados

### Mapper_DEVS

Backend encargado del procesamiento y transformación de especificaciones textuales DEVS.

### DevsLangWebEditor

Editor web para la edición y procesamiento de especificaciones DEVS.

---

## Estado actual

El entorno permite ejecutar de forma integrada:

```text
Editor web
   |
   v
Mapper_DEVS
   |
   +--> Parsing ANTLR
   +--> Generación del modelo intermedio
   +--> Validación OCL
   +--> Transformación ATL
   +--> Generación del modelo computacional
   +--> Validación del modelo computacional
```

Todo el entorno puede iniciarse mediante un único comando:

```bash
docker compose up --build
```

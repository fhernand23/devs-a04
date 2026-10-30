# DEVS Web Text Editor

Frontend web inspirado en `RdevsLangWebEditor`, adaptado a las gramáticas `CFG_DEVS_*`.

## Flujo

```text
Especificación textual DEVS
        ↓
Monaco Editor + ANTLR4TS (validación sintáctica local)
        ↓
POST http://localhost:8080/api/devs/map
        ↓
Mapper_DEVS
        ↓
devsModel.xmi
        ↓
ATL
        ↓
devsComputationalModel.xmi
```

## Ejecutar

```bash
npm install
npm run antlr4ts
npm start
```

La interfaz se levanta en `http://localhost:3000` y espera el backend en `http://localhost:8080`.

## Contrato esperado del backend

### Request

`POST /api/devs/map`

```json
{
  "source": "DETECTOR = (X, Y, S, ... )"
}
```

### Response

```json
{
  "success": true,
  "stage": "COMPLETED",
  "message": "Proceso completado correctamente.",
  "intermediateValidation": {
    "valid": true,
    "severity": 0,
    "diagnostics": []
  },
  "computationalValidation": {
    "valid": true,
    "severity": 0,
    "diagnostics": []
  },
  "devsModelXmi": "<?xml version=...",
  "devsComputationalModelXmi": "<?xml version=..."
}
```

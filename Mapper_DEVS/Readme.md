# DEVS Textual Mapper

Este proyecto implementa el mapeo desde la especificación textual de modelos DEVS hacia instancias del metamodelo `devsModel`.

El objetivo del proyecto es tomar como entrada modelos escritos con la sintaxis concreta definida mediante gramáticas ANTLR y construir una representación basada en modelos EMF. Esta representación intermedia permite trabajar con los modelos DEVS de forma estructurada, validable y reutilizable dentro de un flujo MDE.

## Objetivo

El propósito de este mapper es conectar la sintaxis textual del lenguaje DEVS con su sintaxis abstracta representada por el metamodelo `devsModel`.

El proceso general consiste en:

```text
Especificación textual DEVS
        ↓
Parser ANTLR
        ↓
Listener / Mapper
        ↓
Instancia EMF conforme a devsModel.ecore
```

Esta transformación permite:

- Procesar modelos DEVS escritos en sintaxis textual.
- Construir modelos EMF a partir del árbol de parseo.
- Separar la sintaxis concreta de la representación abstracta.
- Utilizar el modelo resultante como entrada para transformaciones posteriores.
- Integrar la especificación textual en un flujo de Model-Driven Engineering.

## Metamodelo destino

El metamodelo destino de este proyecto es `devsModel.ecore`.

El modelo generado puede contener:

```text
DevsSpecification
AtomicModel
CoupledModel
ModelDefinition
SetSentence
FunctionSentence
Function
FunctionBody
FunctionCase
FunctionResult
SetValue
MathValue
BooleanValue
```

También integra elementos provenientes de los metamodelos auxiliares:

```text
SetTheoryModel
MathExpressionModel
BooleanExpressionModel
```

## Componentes principales

El proyecto incluye clases encargadas de ejecutar el parser y construir el modelo EMF resultante.

Entre los componentes principales se encuentran:

```text
MapperDevsApplication
DevsMapperRunner
DevsMapperListener
SetTheoryMapperRunner
SetTheoryMapperListener
MathExpressionMapperRunner
MathExpressionMapperListener
BooleanExpressionMapperRunner
BooleanExpressionMapperListener
```

También se incluyen clases auxiliares para la construcción de elementos específicos:

```text
SetTheoryMapperHelper
MathExpressionMapperHelper
BooleanExpressionMapperHelper
```

## Gramáticas utilizadas

El proyecto se apoya en gramáticas ANTLR para reconocer la sintaxis textual del lenguaje y sus sublenguajes asociados.

Las gramáticas principales son:

```text
CFG_DEVS_MODEL.g4
CFG_SET_THEORY.g4
CFG_MATH_EXPRESSION.g4
CFG_BOOLEAN_EXPRESSION.g4
CFG_TOKENS.g4
```

Estas gramáticas permiten reconocer:

- La estructura general de modelos DEVS.
- Definiciones de conjuntos.
- Expresiones matemáticas.
- Expresiones booleanas.
- Tokens compartidos entre los distintos módulos del lenguaje.

## Flujo de transformación

El flujo esperado del proyecto es:

1. Leer una especificación textual DEVS.
2. Ejecutar el parser generado con ANTLR.
3. Recorrer el árbol de parseo mediante listeners.
4. Crear objetos EMF correspondientes al metamodelo `devsModel`.
5. Serializar el resultado como modelo XMI.

## Alcance actual

La implementación permite construir una representación estructurada de modelos DEVS a partir de la sintaxis textual.

Actualmente contempla el mapeo de:

- Especificaciones DEVS.
- Modelos atómicos.
- Modelos acoplados.
- Definiciones de conjuntos.
- Sentencias de funciones.
- Firmas de modelos.
- Parámetros.
- Expresiones de teoría de conjuntos.
- Expresiones matemáticas.
- Expresiones booleanas.
- Cuerpos, casos y resultados de funciones.

## Relación con otros proyectos

Este mapper forma parte de una cadena de transformación más amplia:

```text
CFG_DEVS
   ↓
DEVS Textual Mapper
   ↓
devsModel
   ↓
DevsModelToComputational
   ↓
devsComputationalModel
```

En este flujo:

- `CFG_DEVS` define la sintaxis concreta mediante gramáticas ANTLR.
- Este proyecto construye el modelo EMF conforme a `devsModel`.
- `DevsModelToComputational` transforma ese modelo hacia una representación computacional.
- `devsComputationalModel` define el metamodelo destino computacional.

## Tecnologías utilizadas

- Java
- ANTLR
- Eclipse Modeling Framework (EMF)
- Ecore
- XMI
- Model-Driven Engineering (MDE)

## Estructura esperada del proyecto

```text
DevsTextualMapper/
├── src/
│   └── ...
├── input/
│   └── modelo textual DEVS
├── output/
│   └── devsModel.xmi
└── README.md
```

La estructura puede variar según la configuración del proyecto Eclipse, pero el objetivo general es mantener separadas las entradas textuales, la lógica de mapeo y las salidas generadas.

## Estado

Versión inicial del mapper desde la especificación textual DEVS hacia el metamodelo `devsModel`, con soporte para los módulos de teoría de conjuntos, expresiones matemáticas y expresiones booleanas.

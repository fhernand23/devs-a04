FROM maven:3.9.11-eclipse-temurin-21 AS build

WORKDIR /app

COPY pom.xml .
COPY jardependencies ./jardependencies


# ============================================================
# Metamodelos locales
# ============================================================

RUN mvn install:install-file \
    -Dfile=jardependencies/setTheoryModel.jar \
    -DgroupId=mapper.devs.metamodel \
    -DartifactId=setTheoryModel \
    -Dversion=1.0.0 \
    -Dpackaging=jar

RUN mvn install:install-file \
    -Dfile=jardependencies/mathExpressionModel.jar \
    -DgroupId=mapper.devs.metamodel \
    -DartifactId=mathExpressionModel \
    -Dversion=1.0.0 \
    -Dpackaging=jar

RUN mvn install:install-file \
    -Dfile=jardependencies/booleanExpressionModel.jar \
    -DgroupId=mapper.devs.metamodel \
    -DartifactId=booleanExpressionModel \
    -Dversion=1.0.0 \
    -Dpackaging=jar

RUN mvn install:install-file \
    -Dfile=jardependencies/devsModel.jar \
    -DgroupId=mapper.devs.metamodel \
    -DartifactId=devsModel \
    -Dversion=1.0.0 \
    -Dpackaging=jar

RUN mvn install:install-file \
    -Dfile=jardependencies/devsComputationalModel.jar \
    -DgroupId=mapper.devs.metamodel \
    -DartifactId=devsComputationalModel \
    -Dversion=1.0.0 \
    -Dpackaging=jar


# ============================================================
# Eclipse OCL local
# ============================================================

RUN mvn install:install-file \
    -Dfile=jardependencies/org.eclipse.ocl.common-1.21.0.jar \
    -DgroupId=org.eclipse.ocl \
    -DartifactId=org.eclipse.ocl.common \
    -Dversion=1.21.0 \
    -Dpackaging=jar

RUN mvn install:install-file \
    -Dfile=jardependencies/org.eclipse.ocl.pivot-1.21.0.jar \
    -DgroupId=org.eclipse.ocl \
    -DartifactId=org.eclipse.ocl.pivot \
    -Dversion=1.21.0 \
    -Dpackaging=jar


# ============================================================
# Código fuente
# ============================================================

COPY src ./src


# ============================================================
# Compilación
# ============================================================

RUN mvn clean package -DskipTests


# ============================================================
# Imagen final
# ============================================================

FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build \
    /app/target/Mapper_DEVS-0.0.1-SNAPSHOT.jar \
    app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
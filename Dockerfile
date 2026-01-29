
# Fase 1: Construcción (Maven + Java 21)
FROM maven:3.9.6-eclipse-temurin-21-jammy AS build
WORKDIR /app
COPY . .

# CAMBIO AQUÍ: Usamos -f para decirle a Maven dónde está el proyecto
RUN mvn -f Enviart/pom.xml clean package -DskipTests

# Fase 2: Ejecución
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app

# CAMBIO AQUÍ: La ruta del JAR ahora incluye la carpeta Enviart
COPY --from=build /app/Enviart/target/Enviart-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

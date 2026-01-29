# Fase 1: Construcción (Maven + Java 21)
FROM maven:3.9.6-eclipse-temurin-21-jammy AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Fase 2: Ejecución (Solo JRE para que sea ligero)
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
COPY --from=build /app/target/Enviart-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

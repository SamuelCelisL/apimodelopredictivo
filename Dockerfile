# Usar una imagen base de Ubuntu para construir desde cero
FROM ubuntu:latest AS build

# Actualizar e instalar dependencias necesarias
RUN apt-get update && apt-get install -y \
    openjdk-21-jdk \
    maven \
    && apt-get clean

# Configurar directorio de trabajo
WORKDIR /app

# Copiar archivos del repositorio al contenedor
COPY . .

# Construir el proyecto usando Maven
RUN mvn clean package -DskipTests

# Segunda etapa: usar una imagen más ligera para la ejecución
FROM eclipse-temurin:21-jre-slim

# Configurar directorio de trabajo
WORKDIR /app

# Copiar el JAR generado en la etapa de construcción
COPY --from=build /app/target/apimodelopredictivo-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto de la aplicación
EXPOSE 8081

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]

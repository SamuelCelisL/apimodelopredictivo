# Usar una imagen base compatible con Java 21
FROM ubuntu:lastest AS build
RUN apt-get update
RUN apt-get install openjdk-21-jdk -y
COPY . .
RUN mvn clean package

FROM openjdk:21-jdk-slim

# Copiar el archivo JAR generado al contenedor
COPY target/apimodelopredictivo-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto en el que la aplicación escuchará (ajustar según sea necesario)
EXPOSE 8081

# Configurar el comando de inicio de la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
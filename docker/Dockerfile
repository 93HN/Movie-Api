# Use uma imagem base do Maven para construir a aplicação
FROM maven:3.8.1-jdk-11 AS builder

# Configurar diretório de trabalho
WORKDIR /app

# Copiar o arquivo pom.xml e as dependências
COPY ../pom.xml .
COPY ../src ./src

# Construir a aplicação
RUN mvn clean package -DskipTests

# Use uma imagem base do OpenJDK para rodar a aplicação
FROM openjdk:11-jre-slim

# Configurar diretório de trabalho
WORKDIR /app

# Copiar o artefato construído da etapa anterior
COPY --from=builder /app/target/*.jar app.jar

# Expor a porta que a aplicação irá rodar
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]

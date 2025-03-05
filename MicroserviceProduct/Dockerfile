# Base image with JDK 17
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the JAR file and the Docker Compose files
COPY target/app.jar app-product.jar


# Expose the port
EXPOSE 8080

# Run the backend
ENTRYPOINT ["java", "-jar", "app-product.jar"]
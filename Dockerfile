# Use the official Maven image to create a build environment.
FROM openjdk:17

# Copy the Maven project files
COPY target/ms-mail-0.0.1-SNAPSHOT.jar ms-mail.jar

# Expose the port
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "ms-mail.jar"]
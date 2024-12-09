# Jokes App - Simple Spring Boot Application

This is a simple spring boot backend application that will serve an index.html file when you hit an endpoint on your localhost `http://localhost:8080/joke`. The application uses an external dependency `guru.springframework:chuck-norris-for-actuator:2.4.0` to generate random chuck norris quotes. It is a simple html page which uses Thymeleaf to render out jokes.

----

## Instructions to follow

1. Download the jokes-app repo.
   
   ```bash
   git clone git@github.com:sriram15112001/jokes-app.git
   ```
2. Move to the JokesApp directory.

   ```bash
   cd JokesApp
   ```
3. Run the Spring Application by using the following command.

   ```bash
   ./mvnw spring-boot:run
   ```

### Thank You 😁

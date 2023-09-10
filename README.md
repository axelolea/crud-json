# CRUD con Json

Realizar un CRUD de clientes, donde las entidades contienen un ID, nombre y correo, con los métodos POST, PUT, GET y DELETE.
Con la condición de que el ID sea autoincrementable, es decir para los métodos que van a mutar el json dentro del body no deben recibir un ID si no este debe ser autoincrementable.

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)

## Requerimientos

Para construir y ejecutar la aplicación necesita:

- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn package
java -jar target/app.jar
```
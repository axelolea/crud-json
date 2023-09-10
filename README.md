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

## Correr la aplicación en local.

Hay varias formas de ejecutar una aplicación Spring Boot en su máquina local. Una forma es ejecutar el método `main` 
en la clase `com.axelolea.crudjson.CrudJsonApplication` desde su IDE.

Alternativamente, puede usar él [complemento Spring Boot Maven](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) así:

```shell
mvn package
java -jar target/app.jar
```
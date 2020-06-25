## Spring Boot + Rest + JIB
- It will run in all cases and there will not be 403 error in response.

### Usage

- Run the application and go on http://localhost:8082/
- Use the TestController url to invoke controllers methods.

### Build and run

#### Configurations

Open the `application.properties` file and set your own configurations for server port

#### Prerequisites

- Java 1.8
- Maven 3.6.0

#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.

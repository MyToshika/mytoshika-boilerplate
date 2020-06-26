## Spring Boot + Rest + JIB(Push docker image to repository)
- It will run in all cases and there will not be 403 error in response.

### Usage

- Run the application and go on http://localhost:8081/info

### Build and run

#### Configurations

Open the `application.properties` file and set your own configurations for server port

#### Prerequisites

- Java 1.8
- Maven 3.6.0

#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Dconfig.server.url=config-host -Dregistery.server.url=registry-host"
    
## To Push the docker image to docerhub run below command and update pom.xml for user name and password
	$ mvn compile jib:build
	
## Run image in docker container
- docker run -p 8081:8081 -e config.server.url="config-host-url" -e registery.server.url="registry-host-url" pushpendrasingh0009/boilerplate:0.0.1

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.

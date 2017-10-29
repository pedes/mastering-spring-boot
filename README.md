# mastering-spring-boot
Demo Project to explain how to master the autoconfiguration feature of Spring Boot

- Mastering-Application : Demo Application to test the autoconfigure
- Mastering-Starer : Starter pattern to wrap up the autoconfigure and all other optional dependencies
- Mastering-Autoconfigure: Spring Boot Magic, where all the work is done
- Mastering-Service: Simple hello service to autoconfigure with spring boot.

It's a spring boot application to run use either your local maven or the wrapper.

Go to the Mastering-Application module

```cd mastering-application```

Run the following command

```mvn spring-boot:run```

In a web client go to:

```http://localhost:8080/hello```

You'll see how the autoconfiguration kicks in.

# spring-clean-architecture-template
## About
This project is a template for SpringBoot based project with clean architecture.  
It uses following three layer of clean architecture: entity, usecase, presenters & infrastructure.  

This uses multimodule gradle project, so you can restrict the access of each layer.  
Config module has SpringBoot Starter classes, so you can start the application from there.  
Compiled jar file can access from `config/build/libs` directory.


![CleanArchitecture](https://blog.cleancoder.com/uncle-bob/images/2012-08-13-the-clean-architecture/CleanArchitecture.jpg)

## Prerequisites

* JDK 17
* SpringBoot 2.7.5 with WebFlux(Reactive)
* Gradle 7.5.1
* Lombok

# Reference
* Uncle Bob's Clean Architecture <https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html>
* eliostvs / clean-architecture-delivery-example <https://github.com/eliostvs/clean-architecture-delivery-example>

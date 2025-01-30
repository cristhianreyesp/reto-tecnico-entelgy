# Proyecto Reto Técnico

Este proyecto es una implementación para el reto técnico de Entelgy. El objetivo es desarrollar una aplicación utilizando Java, Maven y patrones de diseño orientados a objetos, que permita la gestión de animales y sus servicios.

## Requisitos

- Java 17 
- Maven 3.6 o superior

## Ejecutar el proyecto 

1. Tener [Maven (binary)](https://maven.apache.org/download.cgi) en tu pc.
2. Clona este repositorio en tu máquina local:

   ```bash
   git clone https://github.com/cristhianreyesp/reto-tecnico-entelgy.git
3. Navega al directorio del proyecto:
   ```bash
   cd reto-tecnico-entelgy
4. Ejecuta el proyecto
   ```bash
   mvn exec:java
5. Resultado ejemplo

   ![image](https://github.com/user-attachments/assets/388e359f-ba18-4a6c-a0a8-b438cf5483d6)


## Pruebas Implementadas con Junit

1. **testCrearAnimalTerrestre**: Verifica que la creación de un animal terrestre sea correcta.
2. **testCrearAnimalAcuatico**: Verifica que la creación de un animal acuático sea correcta.
3. **testCrearAnimalVolador**: Verifica que la creación de un animal volador sea correcta.
4. **testEntradaTipoAnimalInvalido**: Verifica que se lance una excepción si se intenta crear un animal con un tipo inválido.


## Estructura del Proyecto
```
reto-tecnico-entelgy/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   └── retotecnico/
│   │   │   │   │   ├── config/
│   │   │   │   │   │   └── ConfigAplicacion.java
│   │   │   │   │   ├── entidad/
│   │   │   │   │   │   └── Acuatico.java
│   │   │   │   │   │   └── Terrestre.java
│   │   │   │   │   │   └── Volador.java
│   │   │   │   │   ├── modelo/
│   │   │   │   │   │   └── Animal.java
│   │   │   │   │   │   └── TipoAnimal.java
│   │   │   │   │   └── servicio/
│   │   │   │   │          └── AnimalServicio.java
│   │   │   │   └── Main.java
│   │   ├── resources/
│   │   │   └── applicationContext.xml
│   └── test/
│       └── java/
│           └── com/
│               └── retotecnico/
│                   └── servicio/
│                       └── AnimalServicioTest.java
└── pom.xml
```

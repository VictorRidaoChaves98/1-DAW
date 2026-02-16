# OrangeHRM Selenium Automation

Este proyecto automatiza dos pruebas en el sistema OrangeHRM Open Source demo utilizando Java, Maven, Selenium y TestNG.

## 📁 Estructura del Proyecto

orangehrm-automation/
├── pom.xml
├── testng.xml
└── src/
    └── test/
        └── java/
            └── com/
                └── tuempresa/
                    └── orangehrm/
                        ├── BaseTest.java
                        ├── LoginTest.java
                        └── AddEmployeeTest.java

## 🧪 Pruebas Automatizadas

### 1. LoginTest
Verifica el inicio de sesión exitoso con las credenciales Admin/admin123 y que redirige al Dashboard.

### 2. AddEmployeeTest
Automatiza el flujo completo de agregar un nuevo empleado, incluyendo la opción de crear detalles de login (si está presente).

## 🛠️ Requisitos

- Java 17+
- Maven 3.8+
- Google Chrome (versión compatible con ChromeDriver)
- Internet activo para acceder al sitio demo

## 🚀 Ejecución de pruebas

Ejecuta el siguiente comando desde la raíz del proyecto:

    mvn test

## 📦 Dependencias principales (pom.xml)

- selenium-java
- testng
- webdrivermanager
- (opcional para SLF4J warning): slf4j-simple

## 📌 Notas

- Se utiliza WebDriverManager para gestionar automáticamente ChromeDriver.
- El test de añadir empleado incluye validación del redireccionamiento al perfil del nuevo empleado.
- Se utilizan esperas explícitas (WebDriverWait) para mejorar la estabilidad.
- Los fallos se capturan y reportan mediante try-catch con Assert.fail().

## 👤 Demo URL utilizada
https://opensource-demo.orangehrmlive.com/

## Adjunto una captura de la hoja de cálculo con los procesos:

![image](https://github.com/user-attachments/assets/f1603419-7ea3-4835-8a47-7c320be07737)


## Aquí dejo el GIF con la automatización del proceso:

![Demo](LoginAñadirNuevoUsuarioActividad12.1ED.gif)


# Actividad8.1ED

ACT 8.1 - Creación de un Proyecto con VSCode + Java + Maven
-----------------------------------------
PROYECTO A REALIZAR
-----------------------------------------
Este proyecto consiste en una aplicación básica de "Hola Mundo" desarrollada utilizando JDK23 y Maven para la ejecución de un programa en Java utilizando VisualStudioCode.
A continuación, se describen los pasos para crear y ejecutar el proyecto:

1.**Instalación de JDK23 y Maven**

Instalación de Java JDK (versión 23.0.2) y Maven (versión 3.9.9).
Configurar las variables de entorno JAVA_HOME, MAVEN_HOME y de la variable PATH.

2.**Creación del proyecto**

Iniciar el proyecto utilizando el comando "mvn archetype:generate".
Creación de la estructura de directorios del proyecto: src/main/java/com/ejemplo/holamundo y src/test/java.

3.**Desarrollo del código**

Implementación de la clase App.java en el paquete "com.ejemplo.holamundo", que contiene el mensaje "Hola Mundo".
Configuración del archivo pom.xml para incluir el plugin exec-maven-plugin y poder ejecutar el proyecto desde Maven.

4.**Ejecución del proyecto**

Compilación y ejecución del proyecto utilizando el comando "mvn clean compile exec:java".
Y verificación de la salida en consola con el mensaje "Hola Mundo".

5.**Subida al repositorio de GitHub**

Creación de un repositorio en GitHub y subida del proyecto utilizando GitHub Desktop.
-----------------------------------------
-----------------------------------------
A continuación añado una copia del código empleado:

1. CÓDIGO PARA App.java

package com.ejemplo.holamundo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana Hola Mundo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JOptionPane.showMessageDialog(frame, "Hola Mundo", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        frame.setVisible(true);
    }
}
------------------------------------------
------------------------------------------
2. CÓDIGO PARA pom.xml

<project xmlns="http://maven.apache.org/POM/4.0.0" 
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.ejemplo.holamundo</groupId>
    <artifactId>proyecto-hola-mundo</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>

    <dependencies>
        <!-- Dependencia para ejecutar aplicaciones Java con Maven -->
        <dependency>
            <groupId>org.codehaus.mojo</groupId>
            <artifactId>exec-maven-plugin</artifactId>
            <version>3.1.0</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>17</source>
                    <target>17</target>
                </configuration>
            </plugin>

            <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>exec-maven-plugin</artifactId>
                <version>3.1.0</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>java</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <mainClass>com.ejemplo.holamundo.App</mainClass>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
------------------------------------------
------------------------------------------

Y con esto quedaría todo explicado y funcionando.

![alt text](Gif.gif)
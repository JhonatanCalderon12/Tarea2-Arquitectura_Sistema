
# Tarea2-Arquitectura_Sistema
Estudio y realización de cambios en la arquitectura de un sistema existente

# Autor principal :man:

Abdul Basit Shahid
- https://github.com/warhoax/Hospital-Management-System


# Requisitos:clipboard:
- 	Sistema Operativo Windows 7 o superior
- 	JDK 1.6.0_23 o superior
- 	Memoria RAM 4 Gb

# Construido con :hammer:
+ Lenguaje JAVA
+ IDE de desarrollo NETBEANS


# Instrucciones:arrow_left:
## Proceso de descarga
   **1. Descargar el repositorio en el formato .zip disponible.**
   
   **2. Descomprimir el archivo**

## Importar base de Datos 🛢️
### Base de datos Local

Enlace de la pagina donde puedes descargar XAMPP el cual es un paquete de software libre, que consiste principalmente en el sistema de gestión de bases de datos MySQL, el servidor web Apache y los intérpretes para lenguajes de script PHP y Perl.
https://www.apachefriends.org/es/index.html
En la pagina hay un video donde se explica su instalación.

En el siguiente video se explica como importar y exportar una base de datos usando XAMPP.
https://youtu.be/J_ow7VIQhxw

   **3. Crear base de datos en phpMyAdmin con el nombre "hospitalmanagmentsystem" sin las comillas.** 
   
   **4. Importar el archivo .sql que se encuentra en la ruta dataBase\Sql Local\hospitalmanagmentsystem.sql**


### Base de datos Remota
Enlace de la pagina donde puede registrarse y crear sus bases de datos remotas.
https://remotemysql.com
 
En el siguiente video se muestra como crear y conectarse a una base de datos MySQL remota y gratuita para usar. La configuración es instantánea y usa phpMyAdmin para la administración.
https://youtu.be/7t6T8TpPsEE
	
	
## Configuraciones 🛠️

   **5. Abrir nuestro IDE de preferencia, para este caso Netbeans**
   
   **6. Cargar el proyecto que previamente se descomprimió**


### Si el proyecto presenta problemas...
- Click derecho sobre el proyecto y damos click en Resolving problems
- Importar las librerias que se encuentran en la carpeta "librerias" dentro del proyecto


**7. Dirigirse al paquete "BaseDeDatos" y acceder a la clase "Connect.java"** 
   
**8. Comentar la siguiente linea de código:**

` [java]
Connection con = DriverManager.getConnection("jdbc:mysql://instancia-db-hospital.cstv4jyg5vif.us-east-1.rds.amazonaws.com:3306/hospitalmanagmentsystem?    verifyServerCertificate=false&useSSL=true","root","passwordadmin");
`


   **9. Descomentar la siguiene linea de código y guardar cambios:**

` [java]
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagmentsystem?verifyServerCertificate=false&useSSL=true","root","");
`
### Nota: Si tiene un usuario registrado en phpMyAdmin cambiar las credenciales respectivas


## Ejecutar Aplicación ✔️

   **10. Click derecho sobre el proyecto y seleccionar "Run"**
   
   **11. Una vez abierto la aplicación colocar las siguientes credenciales**
   
	- Usuario: admin
	
	- Contraseña: passwordadmin


# Mejoras :wrench:
- Se migró la base de datos a la nube de aws con una instancia MySQL versión 8.0.20 y 2 GB de RAM
- Se cambio el lenguaje del sistema de Inglés a Español con excepción de los mensajes, alertas y errores.
- Se estableció la estructura de paquetes a uno de base de datos, modelo y vista


# Coautores :man:  :man:  :girl:
- Juan Ortiz -1151498
- Jhonatan Calderon -1151624
- Ángela Acevedo -1151628


# Tarea2-Arquitectura_Sistema
Estudio y realización de cambios en la arquitectura de un sistema existente

# Autor principal :man:

Abdul Basit Shahid
- https://github.com/warhoax/Hospital-Management-System/blob/master/README.md


# Requisitos:clipboard:
- 	Sistema Operativo Windows 7 o superior
- 	JDK 1.6.0_23 o superior
- 	Memoria RAM 4 Gb

# Construido con :hammer:
+ Lenguaje JAVA
+ IDE de desarrollo NETBEANS


# Instrucciones:arrow_left:
## Proceso de descarga
1. Descargar el repositorio en el formato .zip disponible.
2. Descomprimir el archivo 

## Importar base de Datos
### Base de datos Local

Enlace de la pagina donde puedes descargar XAMPP el cual es un paquete de software libre, que consiste principalmente en el sistema de gestión de bases de datos MySQL, el servidor web Apache y los intérpretes para lenguajes de script PHP y Perl.
https://www.apachefriends.org/es/index.html
En la pagina hay un video donde se explica su instalación.

En el siguiente video se explica como importar y exportar una base de datos usando XAMPP.
https://youtu.be/J_ow7VIQhxw

   1. Crear base de datos en phpMyAdmin con el nombre "hospitalmanagmentsystem" sin las comillas. 
   2. Importar el archivo .sql que se encuentra en la ruta dataBase\Sql Local\hospitalmanagmentsystem.sql

### Base de datos Remota
Enlace de la pagina donde puede registrarse y crear sus bases de datos remotas.
https://remotemysql.com
 
En el siguiente video se muestra como crear y conectarse a una base de datos MySQL remota y gratuita para usar. La configuración es instantánea y usa phpMyAdmin para la administración.
https://youtu.be/7t6T8TpPsEE
	
## Configuraciones	
3. Abrir nuestro IDE de preferencia, para este caso Netbeans
4. Cargar el proyecto que previamente se descomprimió

### Si el proyecto presenta problemas...
- Click derecho sobre el proyecto y damos click en Resolving problems
- Importar las librerias que se encuentran en la carpeta "librerias" dentro del proyecto

5. Dirigirse al paquete "BaseDeDatos" y acceder a la clase "Connect.java" 
6. Comentar la siguiente linea de código:

`
Connection con = DriverManager.getConnection("jdbc:mysql://instancia-db-hospital.cstv4jyg5vif.us-east-1.rds.amazonaws.com:3306/hospitalmanagmentsystem?    verifyServerCertificate=false&useSSL=true","root","passwordadmin");
`

7. Descomentar la siguiene linea de código y guardar cambios:

`
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagmentsystem?verifyServerCertificate=false&useSSL=true","root","");
`
### Nota: Si tiene un usuario registrado en phpMyAdmin cambiar las credenciales respectivas

## Ejecutar Aplicación
8. Click derecho sobre el proyecto y seleccionar "Run"
9. Una vez abierto la aplicación colocar las siguientes credenciales
	- Usuario: admin
	- Contraseña: passwordadmin

# Mejoras :wrench:
- Se migró la base de datos MySQL versión 8.0.20 en AWS con 2 GB de RAM
- Se cambio el lenguaje del sistema de English a Español
- Se establecio la arquitectura MVC (Modelo-Vista-Controlador) para el sistema

# Coautores :man:  :man:  :girl:
- Juan Ortiz -1151498
- Jhonatan Calderon -1151624
- Ángela Acevedo -1151628

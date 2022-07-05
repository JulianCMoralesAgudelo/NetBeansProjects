/*
docker run -d -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=pmysqlpw mysql:latest --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci

docker run --name mysql-8Prm -e MYSQL_ROOT_PASSWORD=mysqlpw -d mysql:latest

Analicemos el comando:

docker run corre/crea un contenedor.

-d indica que el contenedor permanecerá corriendo en segundo plano.

-p 3306:3306 conecta el puerto 33061 de nuestro sistema operativo con el puerto 3306 del contenedor.

--name mysql le da un nombre personalizado al contenedor.

-e MYSQL\_ROOT\_PASSWORD=secret asigna la contraseña "secret" al usuario "root" de MySQL, -e sirve para configurar variables de entorno.

mysql:latest indica la imagen a partir de la cual se va a crear el contenedor, después de los dos puntos se indica la versión específica de la imagen.

--character-set-server=utf8mb4 es una configuración específica de mysql, será la codificación de caracteres por defecto cuando creemos bases de datos.

--collection-server=utf8mb4\_unicode\_ci le dice a mysql que use utf8mb4 en las colecciones de datos.

Si queremos usar nuestro cliente MySQL preferido, por ejemplo Sequel Pro, los datos que usaremos para conectarnos son:

Host: 127.0.0.1
User: root
Password: pmysqlpw
Puerto: 3306

bd: escuela

Para conectarnos al servidor usando el proprio docker:

docker exec -it mysql mysql -uroot -p

docker exec -it mysql -pmysqlpw

docker exec -it mysql bash

*/

CREATE DATABASE escuela;

USE escuela;

CREATE TABLE persona(
	idPersona INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(50) NOT NULL,
	domicilio VARCHAR(200) NOT NULL,
	celular VARCHAR(10) NOT NULL,
	correoElectronico VARCHAR(50) NULL,
	fechaNacimiento DATE NULL,
	genero VARCHAR(10) NOT NULL,
	PRIMARY KEY(idPersona)
);


INSERT INTO `persona` 
(`idPersona`, `nombre`, `domicilio`, `celular`, `correoElectronico`, `fechaNacimiento`, `genero`)
VALUES ('1', 'Edson Arantes do Nascimento', 'Calle 8000 # 509-4600', '3078939765', 'EdsonPele@gmail.com', '1940-10-03', 'Maxculino');


SELECT * FROM persona;

ALTER TABLE persona ADD COLUMN clave VARCHAR(10) NOT NULL AFTER idPersona;

UPDATE `persona` SET
`idPersona` = '1',
`clave` = '001',
`nombre` = 'Edson Arantes do Nascimento',
`domicilio` = 'Calle 8000 # 509-4600',
`celular` = '3078939765',
`correoElectronico` = 'EdsonPele@gmail.com',
`fechaNacimiento` = '1940-10-03',
`genero` = 'Maxculino'
WHERE ((`idPersona` = '1'));


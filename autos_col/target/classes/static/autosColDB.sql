/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  julian
 * Created: 15 may 2022
 */

CREATE DATABASE autos_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE autos_db.usuario (
	idUsuario INT NOT NULL,
	nombres varchar(100) NOT NULL,
	apellidos varchar(100) NOT NULL,
	celular varchar(10) NOT NULL,
	correo varchar(100) NOT NULL,
	fechaNaciemiento DATE NOT NULL
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci
COMMENT='Tabla para registrar los usuarios';

CREATE TABLE autos_db.vehiculo (
	idVehiculo varchar(100) NOT NULL,
	modelo varchar(100) NOT NULL,
	color varchar(100) NOT NULL,
	idUsuario INT NOT NULL,
	marca varchar(100) NOT NULL
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci
COMMENT='Tabla para la informacion del vehiculo';

CREATE TABLE autos_db.Registro (
	idRegistro varchar(100) NOT NULL,
	idUsuario INT NOT NULL,
	idVehiculo varchar(100) NOT NULL,
	horaIngreso TIMESTAMP NOT NULL,
	horaSalida TIMESTAMP NOT NULL,
	tarifaxHora DECIMAL NOT NULL,
	celda varchar(100) NOT NULL,
	pago DECIMAL NOT NULL,
	CONSTRAINT Registro_PK PRIMARY KEY (idRegistro)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci
COMMENT='Registro de los vehiculos dentro del establecimiento.';



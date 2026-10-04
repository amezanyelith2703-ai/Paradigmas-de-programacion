-- 1. Crear la base de datos llamada 'paradigmas'
CREATE DATABASE IF NOT EXISTS paradigmas;

-- Seleccionar la base de datos para trabajar en ella
USE paradigmas;

-- 2. Crear la tabla 'alumnos' con su llave primaria e id autoincrementable
CREATE TABLE IF NOT EXISTS alumnos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    edad INT NOT NULL,
    grupo VARCHAR(10) NOT NULL,
    promedio DECIMAL(4,2) NOT NULL
);

-- 3. Insertar los 6 alumnos indicados en el problema
INSERT INTO alumnos (nombre, edad, grupo, promedio) VALUES
('Ana', 15, '1A', 8.50),
('Luis', 16, '1A', 7.80),
('Marta', 15, '1B', 9.20),
('Pedro', 17, '2A', 8.90),
('Sofía', 16, '2A', 9.50),
('Juan', 17, '2B', 7.50);
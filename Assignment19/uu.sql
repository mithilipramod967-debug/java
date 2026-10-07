CREATE DATABASE IF NOT EXISTS cardb;

USE cardb;

DROP TABLE IF EXISTS cars;

CREATE TABLE cars (
    car_id INT PRIMARY KEY,
    brand VARCHAR(50),
    model VARCHAR(50),
    price DECIMAL(10,2)
);

INSERT INTO cars (car_id, brand, model, price) VALUES
(101, 'Toyota', 'Camry', 30000.00),
(102, 'BMW', '320i', 45000.00),
(103, 'Mercedes', 'C-Class', 52000.00),
(104, 'Audi', 'A4', 48000.00);

SELECT * FROM cars;
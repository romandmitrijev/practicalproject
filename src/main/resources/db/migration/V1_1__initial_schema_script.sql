CREATE DATABASE IF NOT EXISTS sda_final_project;
USE sda_final_project;

CREATE TABLE user (
    userName VARCHAR(15) NOT NULL PRIMARY KEY,
    password VARCHAR(15) NOT NULL,
    usertype VARCHAR(20) NOT NULL
);

CREATE TABLE userdetails (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    userName VARCHAR(15) NOT NULL,
    firstname VARCHAR(15) NOT NULL,
    lastname VARCHAR(15),
    email VARCHAR(20),
    phonenumber INT,
    country VARCHAR(20) NOT NULL,
    city VARCHAR(20)
);


CREATE TABLE company(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username INT NOT NULL,
	company_name VARCHAR(20),
    reg_number VARCHAR(20),
    post_index VARCHAR(20)
);

CREATE TABLE country(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    city_id INT NOT NULL,
	countryname VARCHAR(20)
);

CREATE TABLE city(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
	cityname VARCHAR(20)
);

CREATE TABLE cargo(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
	cargo_description VARCHAR(50),
    cargoweight INT,
    cargo_size VARCHAR(20)
);

CREATE TABLE vehicle(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    user_id LONG NOT NULL,
	capacity INT(20),
    loading_place VARCHAR(20),
    delivery_place VARCHAR(20)
);

CREATE TABLE shipment(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    user_id LONG NOT NULL,
	cargo_id LONG NOT NULL,
    shipment_id LONG NOT NULL,
    comment VARCHAR(20)
);
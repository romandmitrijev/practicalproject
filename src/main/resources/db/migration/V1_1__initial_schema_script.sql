USE sda_final_project;
drop table city;
drop table company;
drop table country;
drop table shipment;
DROP TABLE user_details;
DROP TABLE user;
drop table vehicle;
drop table cargo;
alter table vehicle MODIFY capacity INT;

CREATE TABLE user (
    username VARCHAR(15) NOT NULL PRIMARY KEY,
    password VARCHAR(15) NOT NULL,
    email VARCHAR(20) NOT NULL,
    usertype VARCHAR(20) NOT NULL
);

CREATE TABLE user_details (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(15)NOT NULL,
    firstname VARCHAR(15) NOT NULL,
    lastname VARCHAR(15),
    phonenumber INT,
    country VARCHAR(20) NOT NULL,
    city VARCHAR(20)
);


CREATE TABLE company(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(15)NOT NULL,
	  company_name VARCHAR(20),
    reg_number VARCHAR(20),
    post_index VARCHAR(20),
    street VARCHAR (20),
    city VARCHAR (20)
);


CREATE TABLE cargo(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(15)NOT NULL,
	cargo_description VARCHAR(50),
    loading_place VARCHAR(20),
    discharging_place VARCHAR(20),
    cargo_weight INT,
    custom_status VARCHAR(20)
);

CREATE TABLE vehicle(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(15)NOT NULL,
	capacity INT,
    location VARCHAR(20),
    possible_delivery_areas VARCHAR(20),
    status VARCHAR(20)
);


CREATE TABLE shipment(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(15)NOT NULL,
	cargo_id INT NOT NULL,
    vehicle_id INT NOT NULL
);

CREATE TABLE pending(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(15)NOT NULL,
	cargo_id INT NOT NULL,
    vehicle_id INT NOT NULL,
    comments VARCHAR(20)
);
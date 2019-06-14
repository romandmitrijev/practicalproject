USE sda_final_project;

CREATE TABLE user (
    username VARCHAR(15) NOT NULL PRIMARY KEY,
    password VARCHAR(15) NOT NULL,
    usertype VARCHAR(20) NOT NULL
);

CREATE TABLE userdetails (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(15)NOT NULL,
    firstname VARCHAR(15) NOT NULL,
    lastname VARCHAR(15),
    email VARCHAR(20),
    phonenumber INT,
    country VARCHAR(20) NOT NULL,
    city VARCHAR(20)
);


CREATE TABLE company(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	companyname VARCHAR(20),
  reg_number VARCHAR(20),
  postindex VARCHAR(20),
  Street VARCHAR(20),
  city VARCHAR(20)

);


CREATE TABLE cargo(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(15)NOT NULL,
	cargo_description VARCHAR(50),
  cargo_weight INT,
  status VARCHAR(20)
);

CREATE TABLE vehicle(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(15)NOT NULL,
	capacity INT,
  loading_place VARCHAR(20),
  delivery_place VARCHAR(20),
  status VARCHAR(20)
);


CREATE TABLE shipment(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(15)NOT NULL,
	cargo_id INT NOT NULL,
  shipment_id INT NOT NULL
);

CREATE TABLE pending(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(15)NOT NULL,
	cargo_id INT NOT NULL,
  vehicle_id INT NOT NULL
);
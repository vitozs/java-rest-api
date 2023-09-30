CREATE DATABASE loja;

USE loja;

CREATE TABLE produtos(
	id int not null auto_increment primary key,
	nome varchar(255) not null
);

INSERT INTO produtos (nome)values
("Colchao"), 
("Armario");

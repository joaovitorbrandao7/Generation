SET @@global.sql_mode= '';
create database loja;
use loja;

create table produtos(
id bigint(5) auto_increment,
nome varchar(20) not null,
marca varchar(20) not null,
tamanho varchar(2) not null,
estoque int(5) not null,
preco decimal(8,2) not null,
primary key (id)
);

INSERT INTO produtos (nome, marca, tamanho, estoque, preco) VALUES ('Camisa', 'Nike', 'M', '1000', "50.00");
INSERT INTO produtos (nome, marca, tamanho, estoque, preco) VALUES ('Calça', 'Calvin Clain', 'G', '1000', "150.00");
INSERT INTO produtos (nome, marca, tamanho, estoque, preco) VALUES ('Cinto', 'Gucci', 'M', '500', "550.00");
INSERT INTO produtos (nome, marca, tamanho, estoque, preco) VALUES ('Jaqueta', 'Nike', 'GG', '200', "350.00");
INSERT INTO produtos (nome, marca, tamanho, estoque, preco) VALUES ('Meia', 'Nike', 'M', '5000', "10.00");
INSERT INTO produtos (nome, marca, tamanho, estoque, preco) VALUES ('Tenis', 'Jordan', '41', '500', "1050.00");
INSERT INTO produtos (nome, marca, tamanho, estoque, preco) VALUES ('Bermuda', 'Adidas', 'P', '1000', "150.00");
INSERT INTO produtos (nome, marca, tamanho, estoque, preco) VALUES ('Boné', 'Blunt', 'Un', '7000', "70.00");

SELECT * FROM produtos WHERE preco > 500;
SELECT * FROM produtos WHERE preco < 500;

UPDATE produtos SET nome = "Nike", marca="Nike", tamanho="G", estoque = "1500", preco="65.00" where id = 1;

SELECT * FROM produtos;

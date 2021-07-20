SET @@global.sql_mode= '';

create database empresa;
use empresa;

Create table tb_funcionario(
id bigint(5) auto_increment,
nome varchar(20) not null,
rg int(10) not null,
cpf int(11) not null,
salario decimal(8,2) not null,
funcao varchar(40) not null,
ativo boolean,
primary key (id)
);

INSERT INTO tb_funcionario (nome, rg, cpf, salario, funcao, ativo) VALUES ('Joao', '00001', '00001', '5000.00', 'desenvolvedore', true);
INSERT INTO tb_funcionario (nome, rg, cpf, salario, funcao, ativo) VALUES ('Babi', '00002', '00002', '1000.00', 'desenvolvedore', true);
INSERT INTO tb_funcionario (nome, rg, cpf, salario, funcao, ativo) VALUES ('Suellen', '00003', '00003', '2500.00', 'desenvolvedore', true);
INSERT INTO tb_funcionario (nome, rg, cpf, salario, funcao, ativo) VALUES ('Felipe', '00004', '00004', '800.00', 'engenharia', true);
INSERT INTO tb_funcionario (nome, rg, cpf, salario, funcao, ativo) VALUES ('Ana', '00005', '00005', '1000.00', "analista", true);

SELECT * FROM tb_funcionario WHERE salario > 2000.00;
SELECT * FROM tb_funcionario WHERE salario < 2000.00;

drop database empresa;

update tb_funcionario set nome = "JoaoVitor", rg="391737703", cpf="32334523", salario = "7000.00", funcao="Front-End", ativo = true where id = 1;
SELECT * FROM tb_funcionario;

update tb_funcionario set nome = "Joao Vitor", rg="378737703", cpf="34334523", salario = "7500.00", funcao="Front-End", ativo = true where id = 1;

update tb_funcionario set nome = "Joao" where id=1;




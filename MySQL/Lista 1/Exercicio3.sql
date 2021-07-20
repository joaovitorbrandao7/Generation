SET @@global.sql_mode= '';

create database db_escola;
use db_escola;

Create table tb_alunos(
id bigint(5) auto_increment,
nome varchar(20) not null,
rg int(10) not null,
cpf int(11) not null,
turma int(2) not null,
nota decimal(2,1) not null,
situacao boolean,
primary key (id)
);

INSERT INTO tb_alunos (nome, rg, cpf, turma, nota, situacao) VALUES ('Joao', '00001', '00001', 2, '9.5', true);
INSERT INTO tb_alunos (nome, rg, cpf, turma, nota, situacao) VALUES ('Babi', '00002', '00003', 2, '9.5', true);
INSERT INTO tb_alunos (nome, rg, cpf, turma, nota, situacao) VALUES ('Gabriel', '00003', '00004', 1, '7.5', true);
INSERT INTO tb_alunos (nome, rg, cpf, turma, nota, situacao) VALUES ('Suellen', '00004', '00004', 1, '5.5', true);
INSERT INTO tb_alunos (nome, rg, cpf, turma, nota, situacao) VALUES ('Samuel', '00005', '00005', 1, '9.0', true);
INSERT INTO tb_alunos (nome, rg, cpf, turma, nota, situacao) VALUES ('Cami', '00006', '00006', 2, '7.4', true);
INSERT INTO tb_alunos (nome, rg, cpf, turma, nota, situacao) VALUES ('Luiz', '00007', '00007', 2, '9.5', true);
INSERT INTO tb_alunos (nome, rg, cpf, turma, nota, situacao) VALUES ('Boaz', '00008', '00008', 1, '6.5', true);

SELECT * FROM tb_alunos WHERE nota > 7;
SELECT * FROM tb_alunos WHERE nota < 7;

UPDATE tb_alunos SET nome = "Joao Vitor", rg="378737703", cpf="34334523", turma = "1", nota="9.9", situacao = true WHERE id = 1;

SELECT * FROM tb_alunos;



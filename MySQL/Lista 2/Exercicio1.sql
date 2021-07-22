create database db_game;
use db_game;

create table classe(
id bigint(8) auto_increment,
nome varchar(20) not null,
equipamento varchar(20) not null,
alcance varchar(20) not null,
primary key(id)
);

INSERT INTO classe (nome, equipamento, alcance) VALUES ('Atirador','Arco e Flexa','A distancia');
INSERT INTO classe (nome, equipamento, alcance) VALUES ('Atirador','Pistola','Media Distancia');
INSERT INTO classe (nome, equipamento, alcance) VALUES ('Tanque','Machado','Corpo a Corpo');
INSERT INTO classe (nome, equipamento, alcance) VALUES ('Tanque','Espada','Corpo a Corpo');
INSERT INTO classe (nome, equipamento, alcance) VALUES ('Mago','Magia','Media Distancia');
INSERT INTO classe (nome, equipamento, alcance) VALUES ('Atirador','Besta','A distancia');

create table personagem(
id bigint(5) auto_increment,
nome varchar(20) not null,
regiao varchar(20) not null,
tipo varchar(20) not null,
cor_uniforme varchar(10) not null,
ataque int(10) not null,
defesa int(10) not null,
fk_classe bigint(8) not null,
primary key (id),
foreign key(fk_classe) references classe(id)
);
#ALTER TABLE personagem ADD CONSTRAINT id_classe FOREIGN KEY (id) REFERENCES classe (id);

INSERT INTO personagem (nome,regiao,tipo,cor_uniforme,ataque,defesa,fk_classe) VALUES ('Tristana', 'Bandopolis','Yordle','Azul','1000','500','1');
INSERT INTO personagem (nome,regiao,tipo,cor_uniforme,ataque,defesa,fk_classe) VALUES ('Twitch', 'Zaun','Hibrido','Verde','900','500','1');
INSERT INTO personagem (nome,regiao,tipo,cor_uniforme,ataque,defesa,fk_classe) VALUES ('Jhin', 'Ionia','Mutante','Branco','2100','500','2');
INSERT INTO personagem (nome,regiao,tipo,cor_uniforme,ataque,defesa,fk_classe) VALUES ('Kalista', 'Ilha das Sombras','Fantasma','Azul','900','500','1');
INSERT INTO personagem (nome,regiao,tipo,cor_uniforme,ataque,defesa,fk_classe) VALUES ('Vayne', 'Demacia','Humana','Azul','900','500','1');
INSERT INTO personagem (nome,regiao,tipo,cor_uniforme,ataque,defesa,fk_classe) VALUES ('Ekko', 'Zaun','Homem','Verde','2200','1650','5');
INSERT INTO personagem (nome,regiao,tipo,cor_uniforme,ataque,defesa,fk_classe) VALUES ('Orianna', 'Piltover','Ciborge','Cinza','2750','1500','5');
INSERT INTO personagem (nome,regiao,tipo,cor_uniforme,ataque,defesa,fk_classe) VALUES ('Camillie', 'Demacia','Ciborgo','Cinzo','2600','2050','3');

SELECT * FROM personagem; 

SELECT * FROM personagem WHERE ataque > 2000;
SELECT * FROM personagem WHERE defesa >= 1000 AND defesa <= 2000;

SELECT * FROM personagem WHERE nome LIKE "%C%";

SELECT personagem.nome, personagem.regiao, personagem.tipo, personagem.cor_uniforme, personagem.ataque, personagem.defesa, classe.nome, classe.equipamento, classe.alcance
from personagem
inner join classe on classe.id = personagem.fk_classe;

SELECT personagem.id, personagem.nome, classe.nome
from personagem
inner join classe on classe.id = personagem.fk_classe
where classe.nome="Atirador";



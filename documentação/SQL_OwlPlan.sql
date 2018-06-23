create database owlplan;
use owlplan;

CREATE TABLE usuario (
login varchar (50) PRIMARY KEY,
senha varchar (10)
);

CREATE TABLE pedagoga (
id_user int AUTO_INCREMENT PRIMARY KEY,
foto varchar (100),
nome varchar (100),
sexo char,
nasc date,
login varchar (50),
FOREIGN KEY (login) REFERENCES usuario (login)
);

CREATE TABLE escola (
id_escola int AUTO_INCREMENT PRIMARY KEY,
nome varchar (100)
);

CREATE TABLE turma (
id_turma int AUTO_INCREMENT PRIMARY KEY,
apelido varchar (50),
serie varchar (20),
periodo varchar (20),
id_user int,
id_escola int,
FOREIGN KEY (id_user) REFERENCES pedagoga (id_user),
FOREIGN KEY (id_escola) REFERENCES escola (id_escola)
);

CREATE TABLE aluno (
id_aluno int AUTO_INCREMENT PRIMARY KEY,
nome varchar (100) ,
sexo char,
id_turma int,
FOREIGN KEY (id_turma) REFERENCES turma (id_turma) 
);

CREATE TABLE layout (
id_layout int AUTO_INCREMENT PRIMARY KEY,
url varchar(150)
);

CREATE TABLE planejamento (
id_plan int AUTO_INCREMENT PRIMARY KEY,
imagem varchar (100),
id_turma int,
id_layout int,
FOREIGN KEY(id_turma) REFERENCES turma (id_turma),
FOREIGN KEY(id_layout) REFERENCES layout (id_layout)
);

CREATE TABLE corpo (
id_corpo int AUTO_INCREMENT PRIMARY KEY,
recurso varchar (500),
atividade varchar (500),
id_plan int,
FOREIGN KEY(id_plan) REFERENCES planejamento (id_plan)
);

CREATE TABLE cabecalho (
id_cabecalho int AUTO_INCREMENT PRIMARY KEY,
escola varchar(100),
professora varchar (100),
turma varchar (50),
titulo varchar (100),
data_plan date,
id_plan int,
FOREIGN KEY(id_plan) REFERENCES planejamento (id_plan)
);






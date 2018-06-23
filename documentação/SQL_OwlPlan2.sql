insert into usuario (login, senha)
values("mariajulia","MA123"),
("celiabastos","CB123"),
("meiresilva","MS123"),
("julianamartins","JM123"),
("amandareis","AR123"),
("carolsantos","CS123"),
("mariaclara","MC123"),
("sirleneoliveira","SO123"),
("marlipereira","MP123"),
("katialima","KL123");

insert into pedagoga (nome, foto, sexo, nasc, login)
values("Maria Júia","ABCD","F","20/03/1983","mariajulia"),
("Celia Baster","EFGH","F","13/01/1963","celiabastos"),
("Meire Silva","IJKL","F","28/07/1977","meiresilva"),
("Juiana Martins","MNOP","F","03/02/1989","julianamartins"),
("Amanda Reis","QRST","F","21/09/1988","amandareis"),
("Carol Santos","UVWX","F","18/12/1983","carolsantos"),
("Maria Clara","YZAB","F","15/03/1975","mariaclara"),
("Sirlene Oliveira","CDEF","F","01/02/1984","sirleneoliveira"),
("Marli Pereira","GHIJ","F","09/06/1970","marlipereira"),
("Katia Lima","KLMN","F","10/05/1972","katialima");

insert into escola (nome)
values("Escola Estadual Segismundo Pereira"),
("Escola Municipal Professor Domingos Pimentel de Ulhôa"),
("EMEI Carmelita Vieira dos Santos"),
("EMEI Tibery"),
("Escola Municipal Amanda Carneiro Teixeira");

insert into turma (apelido, serie, periodo, id_user, id_escola)
values("2° P","2° período","matutino",1,1),
("1p","1° período","vespertino",2,2),
("Turma da girafa","3° período","matutino",3,3),
("pipoquinhas","2° período","matutino",4,4),
("primeiro período","1° período","vespertino",5,5),
("terceiro p","3° período","matutino",6,1),
("turma da joaninha","1° período","vespertino",7,2),
("2° período","2° período","matutino",8,3),
("3° p turma do elefante","2° período","matutino",9,4),
("terceiro P","3° período","vespertino",10,5);

insert into aluno (nome, sexo, id_turma)
values("João Gulherme","M",7),
("Ana Júlia","F",7),
("Gustavo","M",7),
("Renan","M",7),
("Marina","F",7);



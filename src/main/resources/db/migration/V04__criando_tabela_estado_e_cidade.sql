create sequence sqc_estado start 1;
create table tbl_estado(
id integer default nextval('sqc_estado'),
nome varchar(50) not null,
constraint id_estado unique(id)
);

create sequence sqc_cidade start 1;
create table tbl_cidade(
id_cidade integer default nextval('sqc_cidade'),
nome varchar(100) not null,
id_estado int not null,
foreign key (id_estado) references tbl_estado(id)
);

insert into tbl_estado (nome) values ('Minas Gerais');
insert into tbl_estado (nome) values ('São Paulo');

insert into tbl_cidade(nome, id_estado) values('Uberlândia', 1);
insert into tbl_cidade(nome, id_estado) values('São Paulo', 2);
insert into tbl_cidade(nome, id_estado) values('Campinas', 2);



create sequence sqc_categoria start 1;
create table categoria(
codigo integer default nextval('sqc_categoria'),
nome varchar(50) not null,
constraint codigo_categoria unique(codigo)
);

insert into categoria (nome) values ('Lazer');
insert into categoria (nome) values ('Alimentação');
insert into categoria (nome) values ('Supermercado');
insert into categoria (nome) values ('Farmacia');
insert into categoria (nome) values ('Outros');

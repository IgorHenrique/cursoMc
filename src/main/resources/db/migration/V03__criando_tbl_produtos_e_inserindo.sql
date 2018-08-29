create sequence sqc_produto start 1;
create table tbl_produto(
id integer default nextval('sqc_produto'),
nome varchar(50) not null,
preco numeric(6,2),
constraint id_produto unique(id)
);

create table PRODUTO_CATEGORIA(
produto_id int not null,
categoria_id int not null,
foreign key (produto_id) references tbl_produto(id),
foreign key (categoria_id) references categoria(codigo)
);

insert into tbl_produto (nome, preco) values ('Computador', 2000.00);
insert into tbl_produto (nome, preco) values ('Impressora', 800.00);
insert into tbl_produto (nome, preco) values ('Mouse', 80.00);

insert into PRODUTO_CATEGORIA (produto_id, categoria_id) values (1,1);
insert into PRODUTO_CATEGORIA (produto_id, categoria_id) values (2,1);
insert into PRODUTO_CATEGORIA (produto_id, categoria_id) values (2,2);
insert into PRODUTO_CATEGORIA (produto_id, categoria_id) values (3,1);


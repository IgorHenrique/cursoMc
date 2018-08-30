create table tbl_telefone(
id_cliente integer not null,
numero varchar(14) not null,
foreign key(id_cliente) references tbl_cliente(id)
);

insert into tbl_telefone(id_cliente, numero) values (1, '(31)99315-2183');
insert into tbl_telefone(id_cliente, numero) values (1, '(31)99532-1242');
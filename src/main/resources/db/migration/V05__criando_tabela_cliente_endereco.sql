alter table tbl_cidade add constraint id_cidade unique(id_cidade);

create sequence sqc_cliente start 1;
create table tbl_cliente(
id integer default nextval('sqc_cliente'),
nome varchar(100) not null,
CPF_OU_CNPJ varchar(50),
email varchar(100),
tipo int not null,
constraint id_cliente unique(id)
);

create sequence sqc_endereco start 1;
create table tbl_endereco(
id integer default nextval('sqc_endereco'),
bairro varchar(50) not null,
cep varchar(50),
complemento varchar(50),
logradouro varchar(50),
numero varchar(10),
id_cidade int not null,
id_cliente int not null,
foreign key(id_cidade) references tbl_cidade(id_cidade),
foreign key(id_cliente) references tbl_cliente(id),
constraint id_endereco unique(id)
);


insert into tbl_cliente (nome, CPF_OU_CNPJ, email, tipo) values ('Maria', '123.123.123.123-21', 'teste@email.com',1);

insert into tbl_endereco (bairro, cep, complemento, logradouro, numero, id_cidade, id_cliente)
	 values ('Jardim', '123453452', 'Apto 01', 'Rua Flores', '300', 1, 1);
	 
insert into tbl_endereco (bairro, cep, complemento, logradouro, numero, id_cidade, id_cliente)
	 values ('Centro', '432423443', 'Apto 02', 'Avenida Matos', '400', 2, 1);




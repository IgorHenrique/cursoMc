create table tbl_item_pedido(
desconto numeric(7,2) ,
preco numeric(7,2),
quantidade integer,
id_pedido integer not null,
id_produto integer not null,
foreign key(id_pedido) references tbl_pedido(id),
foreign key(id_produto) references tbl_produto(id),
primary key(id_pedido, id_produto)
);

insert into tbl_item_pedido(desconto, preco, quantidade, id_pedido, id_produto) values 
	(0.00, 2000.00, 1, 1, 1);
	
insert into tbl_item_pedido(desconto, preco, quantidade, id_pedido, id_produto) values 
	(0.00, 80.00, 2, 1, 3);
	
insert into tbl_item_pedido(desconto, preco, quantidade, id_pedido, id_produto) values 
	(100.00, 800.00, 1, 2, 2);
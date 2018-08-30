create sequence sqc_pedido start 1;
create table tbl_pedido(
id integer default nextval('sqc_pedido') primary key,
instante timestamp not null,
id_cliente integer not null,
id_endereco_entrega integer not null,
foreign key(id_cliente) references tbl_cliente(id),
foreign key(id_endereco_entrega) references tbl_endereco(id),
constraint id_pedido unique(id)
);

create table tbl_pagamento(
id integer primary key not null,
estado integer not null,
foreign key(id) references tbl_pedido(id)

);

create table tbl_pagamento_boleto(
id integer primary key not null,
data_pagamento timestamp not null,
data_vencimento timestamp not null,
foreign key(id) references tbl_pagamento(id)
);

create table tbl_pagamento_cartao(
id integer primary key not null,
numero_de_parcelas integer not null,
foreign key(id) references tbl_pagamento(id)
);

insert into tbl_pedido (instante, id_cliente, id_endereco_entrega) values (current_timestamp, 1,1);
insert into tbl_pedido (instante, id_cliente, id_endereco_entrega) values (current_timestamp, 1,2);

insert into tbl_pagamento (id, estado) values (1,2);
insert into tbl_pagamento_cartao(id, numero_de_parcelas) values (1,6);

insert into tbl_pagamento (id, estado) values (2,1);
insert into tbl_pagamento_boleto(id, data_pagamento, data_vencimento) values (2, '2018-08-30 00:00:00', '2018-09-30 00:00:00');





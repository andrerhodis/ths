create table Venda_produto(
id_vendaproduto int not null primary key,
id_venda int,
cod_produto bigint,
foreign key (id_venda) references Vendas(id_venda),
foreign key (cod_produto) references CadastroDeProdutos(codigo_produto)
);

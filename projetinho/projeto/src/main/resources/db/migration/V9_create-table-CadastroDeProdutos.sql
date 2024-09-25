create table CadastroDeProdutos(
codigo_produto bigint not null primary key,
nome_produto varchar(50),
descricao_produto longtext,
preco_produto float,
quantidade_produto int(10),
data_cadastro date,
cod_estoquista int,
foreign key(cod_estoquista) references Estoquista(cod_pessoa)
);

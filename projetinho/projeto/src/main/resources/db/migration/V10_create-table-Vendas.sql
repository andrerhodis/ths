create table Vendas(
id_venda int not null primary key,
preco_venda float,
quantidade int(10),
data_venda date,
cpf_cliente bigint,
nome_cliente varchar(50),
numero_caixa int (2)
);

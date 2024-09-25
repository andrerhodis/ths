create table AtendimentoAoCliente(
id_venda int,
foreign key(id_venda) references Vendas(id_venda)
);
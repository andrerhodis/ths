create table Caixa(
cod_pessoa int,
foreign key (cod_pessoa) references Pessoa(codigo_pessoa)
);

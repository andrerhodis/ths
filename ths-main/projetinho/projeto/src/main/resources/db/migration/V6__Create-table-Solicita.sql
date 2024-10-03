create table Solicita(
id_solicitacao int auto_increment not null primary key,
descricao longtext,
cod_pessoa int,
foreign key (cod_pessoa) references Pessoa(codigo_pessoa)
);
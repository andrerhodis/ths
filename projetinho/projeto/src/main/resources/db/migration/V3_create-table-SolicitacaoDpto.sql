create table SolicitacaoDpto(
id_solicitacao int auto_increment not null primary key,
data_solicitao date,
descricao_solicitacao longtext,
cod_pessoadpto int,
cod_pessoa int,
foreign key (cod_pessoadpto) references Pessoa(codigo_pessoa),
foreign key (cod_pessoa) references Pessoa(codigo_pessoa)
);
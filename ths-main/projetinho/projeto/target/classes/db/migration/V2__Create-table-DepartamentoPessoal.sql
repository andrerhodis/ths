create table DepartamentoPessoal(
cod_pessoadpto int,
foreign key (cod_pessoadpto) references Pessoa(codigo_pessoa)
);
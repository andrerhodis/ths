create table Login(
senha varchar(50),
cod_pessoa int,
foreign key(cod_pessoa) references Cargo(id_cargo)
);
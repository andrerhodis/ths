create table Pessoa(
codigo_pessoa int auto_increment not null primary key,
cpf_pessoa bigint,
pis bigint,
nome_pessoa varchar(50),
telefone varchar(20),
salario float,
email varchar(30),
data_admissao date
);
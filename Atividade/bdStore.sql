Create database bd_itemStore;
use bd_itemStore;

create table tb_Produto(
	codigo int not null auto_increment primary key,
    nome varchar(50) not null,
    marca varchar(50) not null,
    valor float not null,
    codBarras varchar(150)
);

Create table tb_Colaborador(
	codigo int not null auto_increment primary key,
    cpf varchar(15) not null,
    nome varchar(50) not null,
    login varchar(50) not null,
    senha varchar(150) not null
);

select * from tb_Produto;
select * from tb_Colaborador;
create database db_pessoa; 

use db_pessoa; 

create table tb_pessoas(
codigo int primary key auto_increment, 
nome varchar(68) not null, 
fone varchar(20), 
email varchar(60) 
); 

insert into tb_pessoas(
codigo, nome, fone, email) 

values(1, "lucas", "1234-567", "lucas@gmail.com"), 
("jessica", "4532-0344", "jessica@gmail.com"), 
("Marcelo", "722-492", "Marcelo@gmail.com"); 

select * from tb_pessoas


 
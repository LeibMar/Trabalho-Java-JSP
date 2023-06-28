create database catalogo;

create table livro (
 id int auto_increment,
titulo varchar(200),
autor varchar(150),
localPublicacao varchar(100),
ano varchar(30),

primary key (id));

create table usuario (
 id int auto_increment,
nome varchar(200),
email varchar(150),
senha varchar(100),

primary key (id));
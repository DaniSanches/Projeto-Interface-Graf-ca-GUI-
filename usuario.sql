create database login;
use login;

create table usuario(
 id int primary key auto_increment not null,
 login varchar(30) not null,
 senha varchar (20) not null);
 
 Insert Into `usuario` (`login`, `senha`) Values
 ('Caludio Benossi', ' Aluno123456'),
 ('adm', 'adm');
 
select * from usuario;
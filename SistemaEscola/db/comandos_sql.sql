CREATE TABLE produtos(
codigo integer not null,
descricao varchar(30) not null
)

insert into produtos(codigo, descricao)
values(1,'arroz')
;
insert into produtos(codigo, descricao)
values(2,'feij�o')
;
insert into produtos(codigo, descricao)
values(3,'macarr�o')
;
commit
;


select * from produtos


;

update produtos
set descricao = 'Arroz pr�-cozido'
where codigo = 1
commit
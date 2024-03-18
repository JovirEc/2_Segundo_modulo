-- Script 1
create table productos(
	codigo int not null,
	nombre varchar(50) not null,
	descripcion varchar(200),
	precio money not null,
	stock int not null,
	constraint productos_pk primary key (codigo)
)

select * from productos
--Crear y ejecutar 5 inserts
insert into productos (codigo,nombre,descripcion,precio,stock)
values (0001,'jabón','limpieza de baño',1.00,100)

insert into productos (codigo,nombre,descripcion,precio,stock)
values (0002,'shampoo','limpieza de cabello',5.00,50)

insert into productos (codigo,nombre,descripcion,precio,stock)
values (0003,'biberón','utencilios para bebes',1.50,80)

insert into productos (codigo,nombre,descripcion,precio,stock)
values (0004,'sartén','utencilio para cocina',15.00,25)

insert into productos (codigo,nombre,descripcion,precio,stock)
values (0005,'lapiz','utencilio escolar',0.50,200)

select * from productos
--Crear y ejecutar 3 inserts
insert into productos (codigo,nombre,precio,stock)
values (0006,'peine',3.00,50)

insert into productos (codigo,nombre,precio,stock)
values (0007,'labial',0.50,100)

insert into productos (codigo,nombre,precio,stock)
values (0008,'gafas',5.00,20)

select * from productos
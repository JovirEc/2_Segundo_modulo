-- Script 3
create table estudiantes (
	cedula char(10) not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	email varchar(50) not null,
	fecha_nacimiento date not null,
	constraint estudiantes_pk primary key (cedula)
)

select * from estudiantes

insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (1234567890,'Juan','Pérez','juan.perez@email.com','15/05/1990')

insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (9876543210,'María','García','maria.garcia@email.com','22/08/1985')

insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (4567890123,'Carlos','Rodríguez','carlos.rodriguez@email.com','10/11/1992')

insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (7890123456,'Laura','López','laura.lopez@email.com','28/03/1988')

insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (2345678901,'Javier','Martínez','javier.martinez@email.com','05/07/1995')

insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (5678901234,'Ana','Sánchez','ana.sanchez@email.com','14/09/1980')

insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (8901234567,'Andrés','Torres','andres.torres@email.com','18/02/1998')

insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (3210987654,'Isabel','Ramírez','isabel.ramirez@email.com','03/12/1983')

select * from estudiantes
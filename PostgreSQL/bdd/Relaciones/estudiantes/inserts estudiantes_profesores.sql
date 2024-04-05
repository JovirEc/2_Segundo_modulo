select * from profesores

--Inserts profesores
insert into profesores (codigo,nombre) values (001,'Pedro');
insert into profesores (codigo,nombre) values (002,'Francisco');
insert into profesores (codigo,nombre) values (003,'Angel');
insert into profesores (codigo,nombre) values (004,'Andrés');
insert into profesores (codigo,nombre) values (005,'Katerine');
insert into profesores (codigo,nombre) values (006,'Balboa');
insert into profesores (codigo,nombre) values (007,'Andy');
insert into profesores (codigo,nombre) values (008,'Mary');
insert into profesores (codigo,nombre) values (009,'Miguel');
insert into profesores (codigo,nombre) values (010,'Francisco');

--Inserts estudiantes
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (9876543210,'María','García','maria.garcia@email.com','1985-08-22',001);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (2345678901,'Javier','Martínez','javier.martinez@email.com','1995-07-05',002);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (5678901234,'Ana','Sánchez','ana.sanchez@email.com','1980-09-14',003);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (1734567890,'Juan','Hernández','juan.perez@email.com','1990-05-15',004);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (1790123456,'Laura','Hernández','laura.lopez@email.com','1988-03-28',005);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (1701234567,'Andrés','Hernández','andres.torres@email.com','1998-02-18',006);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (1710987654,'Isabel','Hernández','isabel.ramirez@email.com','1983-12-03',007);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (1235476801,'Raul','Martínez','raumart01@gmail.com','2003-02-04',008);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (1735476802,'Mario','Guaman','MarioG25@gmail.com','2000-12-08',009);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (1235476803,'Roberto','Quishpe','RobQuishpe64@gmail.com','2005-06-29',010);
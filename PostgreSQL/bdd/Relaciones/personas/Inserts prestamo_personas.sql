select * from prestamo

--Inserts personas
insert into personas (cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values (1234567890,'Sean','Pérez','1995-07-20','U');
insert into personas (cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values (9876543210,'María','López','1992-11-12','S');
insert into personas (cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values (4567890123,'Carlos','García','1991-09-05','U');
insert into personas (cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values (7890123456,'Ana','Martínez','1996-04-17','U');
insert into personas (cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values (2345678901,'Luis','Rodríguez','1995-03-25','C');
insert into personas (cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values (9012345678,'Laura','Sánchez','1992-02-10','S');
insert into personas (cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values (5678901234,'Pedro','Ramírez','1991-10-30','U');
insert into personas (cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values (3456789012,'Marta','González','1998-08-03','S');
insert into personas (cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values (6789012345,'Javier','Díaz','1994-12-11','U');
insert into personas (cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values (0123456789,'Sean','Fernández','1993-06-28','C');

--Inserts prestamos
insert into prestamo (cedula,monto) values (1234567890,250);
insert into prestamo (cedula,monto) values (9876543210,300);
insert into prestamo (cedula,monto) values (4567890123,1500);
insert into prestamo (cedula,monto) values (7890123456,2000);
insert into prestamo (cedula,monto) values (2345678901,150);
insert into prestamo (cedula,monto) values (9012345678,556);
insert into prestamo (cedula,monto) values (5678901234,3200);
insert into prestamo (cedula,monto) values (3456789012,110);
insert into prestamo (cedula,monto) values (6789012345,1200);
insert into prestamo (cedula,monto) values (0123456789,440);
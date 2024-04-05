select * from registros_entrada

--Inserts empleado
insert into empleado (codigo_empleado,nombre,fecha,hora) values (2200,'Joel','01/01/2023','12:00:00');
insert into empleado (codigo_empleado,nombre,fecha,hora) values (2201,'Andrés','02/01/2023','12:00:00');
insert into empleado (codigo_empleado,nombre,fecha,hora) values (2202,'Marcos','03/01/2023','12:00:00');
insert into empleado (codigo_empleado,nombre,fecha,hora) values (2203,'Francisca','04/01/2023','12:00:00');
insert into empleado (codigo_empleado,nombre,fecha,hora) values (2204,'Martha','05/01/2023','12:00:00');
insert into empleado (codigo_empleado,nombre,fecha,hora) values (2205,'Mary','06/01/2023','12:00:00');
insert into empleado (codigo_empleado,nombre,fecha,hora) values (2206,'Angel','07/01/2023','12:00:00');
insert into empleado (codigo_empleado,nombre,fecha,hora) values (2207,'Lucas','08/01/2023','12:00:00');
insert into empleado (codigo_empleado,nombre,fecha,hora) values (2208,'Azucena','09/01/2023','12:00:00');
insert into empleado (codigo_empleado,nombre,fecha,hora) values (2209,'Morelo','10/01/2023','12:00:00');

--Inserts registros_entrada
insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora,codigo_empleado) values (3,4567890123,'1992-11-10','18:00:00',2200);
insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora,codigo_empleado) values (5,2345678901,'1995-07-05','12:30:00',2201);
insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora,codigo_empleado) values (6,5678901234,'1980-09-14','16:30:00',2202);
insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora,codigo_empleado) values (7,8901234567,'1998-02-18','13:30:00',2203);
insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora,codigo_empleado) values (9,1357902468,'1993-04-17','12:30:00',2204);
insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora,codigo_empleado) values (1,0823456799,'2023-08-15','20:00:00',2205);
insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora,codigo_empleado) values (8,0823456799,'2023-08-03','10:30:00',2206);
insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora,codigo_empleado) values (2,0823456739,'2023-08-22','12:00:00',2207);
insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora,codigo_empleado) values (4,0823456797,'2023-08-28','12:30:00',2208);
insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora,codigo_empleado) values (10,1754416489,'2023-06-18','07:00:00',2209);
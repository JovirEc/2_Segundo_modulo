-- Script 4
create table registros_entrada(
	codigo_registro int not null,
	cedula_empleado char(10) not null,
	fecha date not null,
	hora time not null,
	constraint registros_entrada_pk primary key (codigo_registro)
)

select * from registros_entrada

insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora)
values (0001,1234567890,'15/05/1990','20:00')

insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora)
values (0002,9876543210,'22/08/1985','15:00')

insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora)
values (0003,4567890123,'10/11/1992','18:00')

insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora)
values (0004,7890123456,'28/03/1988','15:30')

insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora)
values (0005,2345678901,'05/07/1995','12:30')

insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora)
values (0006,5678901234,'14/09/1980','16:30')

insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora)
values (0007,8901234567,'18/02/1998','13:30')

insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora)
values (0008,3210987654,'03/12/1983','10:30')

insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora)
values (0009,1357902468,'17/04/1993','12:30')

insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora)
values (0010,9753108642,'25/06/1987','18:45')

select * from registros_entrada
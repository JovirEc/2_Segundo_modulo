select * from empleado


create table empleado(
	codigo_empleado int not null,
	nombre varchar(25) not null,
	fecha date not null,
	hora time not null,
	constraint empleado_pk primary key (codigo_empleado)
)

delete from registros_entrada

alter table registros_entrada add column codigo_empleado int not null


alter table registros_entrada add constraint registros_entrada_empleado_fk foreign key (codigo_empleado) references empleado(codigo_empleado)
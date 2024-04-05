select * from personas

create table prestamo(
	cedula char(10),
	monto money,
	fecha_prestamo date,
	hora_prestamo time,
	garante varchar(40),
	constraint prestamo_pk primary key (cedula)
)

alter table prestamo add constraint prestamo_personas_fk foreign key (cedula) references personas(cedula)

delete from personas
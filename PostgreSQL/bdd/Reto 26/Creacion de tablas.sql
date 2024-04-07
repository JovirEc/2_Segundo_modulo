--USUARIOS Y GRUPOS
create table usuarios(
	id int,
	nombre varchar(25) not null,
	apellido varchar(25) not null,
	fecha_nacimiento date,
	constraint usuarios_pk primary key (id)
)

create table grupo (
	id int,
	nombre varchar(25) not null,
	descripcion varchar(75),
	fecha_creacion date,
	constraint grupo_pk primary key (id)
)

create table usuario_grupo (
	us_id int not null,
	gr_id int not null,
	constraint us_id_fk foreign key (us_id) references usuarios(id),
	constraint gr_id_fk foreign key (gr_id) references grupo(id),
	constraint usuario_grupo_pk primary key (us_id,gr_id)
)
--HABITACIONES Y HUÉSPEDES
create table habitaciones (
	habitacion_numero int,
	precio_por_noche decimal not null,
	piso int not null,
	max_personas int,
	constraint habitaciones_pk primary key (habitacion_numero)
)
create table huespedes (
	id int,
	nombres varchar(45) not null,
	apellidos varchar(45) not null,
	telefono char(10),
	correo varchar(45),
	direccion varchar(45),
	ciudad varchar(45),
	pais varchar(45),
	constraint huespedes_pk primary key (id)
)
create table huespedes_atributos(
	inicio_fecha date,
	fin_fecha date,
	habitacion int not null,
	huesped_id int not null,
	constraint habitacion_numero_fk foreign key (habitacion) references habitaciones(habitacion_numero),
	constraint huesped_id_fk foreign key (huesped_id) references huespedes(id),
	constraint huespedes_atributos_pk primary key (habitacion,huesped_id)
)
--MUNICIPIO  YPROYECTO
create table ciudad (
	id int,--llave
	nombre varchar(45) not null,
	constraint ciudad_pk primary key (id)
)
create table municipio(
	id int,--llave
	nombre varchar(45),
	ciudad_id int,--foreign
	constraint municipio_pk primary key (id),
	constraint ciudad_id_fk foreign key (ciudad_id) references ciudad(id)
)
create table proyecto(
	id int,--llave
	proyecto varchar(50) not null,
	monto money not null,
	fecha_inicio date,
	fecha_entreaga date,
	constraint proyecto_pk primary key (id)
)
create table proyecto_municipio (
	municipio_id int not null, --fk
	proyecto_id int not null,
	constraint municipio_id_fk foreign key (municipio_id) references municipio(id),
	constraint proyecto_id_fk foreign key (proyecto_id) references proyecto(id),
	constraint proyecto_municipio_pk primary key (municipio_id,proyecto_id)
)

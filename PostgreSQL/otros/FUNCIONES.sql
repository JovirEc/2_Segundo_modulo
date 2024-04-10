--Seleccionar tabla
select * from nombre_tabla

--Crear tabla
create table cuentas(
	numero_cuenta char(5) not null,
	cedula_propietario char(5) not null,
	fecha_creacion date not null,
	saldo money not null,
	constraint cuentas_pk primary key (numero_cuenta)
	constraint cuentas_usuario_fk foreign key cuentaID references usuario(id)
)

--Tablas relacion muchos a muchos
create table productos_por_proveedor (
	pp_codigo_producto int not null,
	pp_codigo_proveedor int not null,
	constraint producto_fk foreign key(pp_codigo_producto) references productos(codigo),
	constraint proveedor_fk foreign key(pp_codigo_proveedor) references proveedores(codigo),
	constraint productos_por_proveedor_pk primary key (pp_codigo_producto,pp_codigo_proveedor)
)

--Insertar datos
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (10000,20000,'01/01/2023',300)

--Between
select * from nombre_tabla where fecha between '01/08/2023' and '31/08/2023'
									   between '14:00' and '20:00'
									   between money(100) and money(500) 

--Like
select * from nombre_tabla where cedula_propietario like '17%'

--Actualizar fila
update registros_entrada set cedula_empleado = '0823456799' where fecha between '01/08/2023' and '31/08/2023'
update cuentas set saldo = 10.00 where cedula_propietario like '17%'

--Eliminar
delete from proyecto where id = 4 --Eliminar fila entera a partir del PK
					 where cedula_propietario like '10%'
 					 where proyecto_id = 4 and municipio_id = 8 --Eliminar fila entera a partir de Tabla con PK combinada.
					 where fecha between '01/06/2023' and '30/06/2023'
					 where valoracion < 7

--COUNT
select count(ec.codigo) from estado_civil ec

--AVG
select AVG(numero) from tabla
select AVG (cast(saldo as numeric)) from tabla

--MAX - MIN - SUM
select max(columna1),min(columna2),sum(celda1,celda2)

--ALTER TABLE
alter table tabla_1 add constraint nombre_foreign_fk foreign key (columna_1) references tabla_2 (columna_2)
				    add column codigo_empleado int not null

--Group by
group by cedula

--Relacion muchos a muchos
select * from tabla1 t1, tabla2 t2, tablaUnion tu
where t1.id = tu.t1_id and t2.id = tu.t2_id
and --el resto de condiciones.

--IN
where columna_x in(select columna from tabla where columnaX = 5)


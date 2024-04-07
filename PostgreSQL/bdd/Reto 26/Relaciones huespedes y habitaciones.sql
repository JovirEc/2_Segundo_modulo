select * from habitaciones
select * from huespedes
select * from reservas

--Consulta 1 habitaciones y huespedes
select habitacion_numero,nombres,apellidos from habitaciones,huespedes,reservas
where habitacion_numero = habitacion and id = huesped_id
--Subconsulta 1 habitaciones y huespedes
select nombres, apellidos from huespedes
where id in (select huesped_id from reservas where habitacion = 2)
--Agregacion 1 habitaciones y huespedes
select habitacion_numero, count(huesped_id) from habitaciones, reservas
where habitacion_numero = habitacion
group by habitacion_numero

--Consulta 2 habitaciones y huespedes
select habitacion_numero, piso, nombres, apellidos from habitaciones, huespedes, reservas
where habitacion_numero = habitacion and id = huesped_id
and piso = 4
--Subconsulta 2 habitaciones y huespedes
select nombres, apellidos from huespedes
where id in(select huesped_id from reservas where habitacion = 3)
--Agregacion 2 habitaciones y huespedes
select habitacion_numero,avg(huesped_id) from habitaciones, reservas
where habitacion_numero = habitacion
group by habitacion_numero

--Consulta 3 habitaciones y huespedes
select habitacion_numero,nombres,apellidos from habitaciones,huespedes,reservas
where habitacion_numero = habitacion and id = huesped_id
--Subconsulta 3 habitaciones y huespedes
select nombres,apellidos from huespedes
where id in(select huesped_id from reservas where habitacion = 4)
--Agregacion 3 habitaciones y huespedes
select habitacion_numero, sum(precio_por_noche) from habitaciones,reservas
where habitacion_numero = habitacion
group by habitacion_numero
--Agregaciones1 registros_entrada y empleado
select cedula_empleado,count(codigo_registro) total_registros_entrada from registros_entrada
group by cedula_empleado

--Agregaciones2 registros_entrada y empleado
select min(fecha) as fecha_minima, max(fecha) as fecha_maxima from registros_entrada

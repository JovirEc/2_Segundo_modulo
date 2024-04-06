--Consulta Registros_entrada y empleado
select re.cedula_empleado,em.fecha,em.nombre from registros_entrada re,empleado em
where re.codigo_empleado = em.codigo_empleado
and (re.fecha between '2023-08-01' and '2023-08-31')
or re.cedula_empleado like '17%'
and (re.hora between '08:00' and '12:00')
or (re.fecha between '2023-10-06' and '2023-10-20')
or re.cedula_empleado like '08%'
and (re.hora between '09:00' and '13:00')
--Subconsulta Registros_entrada y empleado
select em.codigo_empleado,em.nombre,em.fecha,em.hora from registros_entrada re, empleado em
where re.codigo_empleado = em.codigo_empleado
and em.codigo_empleado = 2201
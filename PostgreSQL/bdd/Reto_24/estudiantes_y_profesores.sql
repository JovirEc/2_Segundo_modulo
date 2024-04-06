--Consulta Estudiantes y profesores
select pf.codigo,es.nombre,es.apellido from profesores pf,estudiantes es
where es.codigo_profesor = pf.codigo and apellido like '%n%'
--Subconsulta Estudiantes y profesores
select * from estudiantes es,profesores pf
where es.codigo_profesor = pf.codigo and pf.nombre = 'Francisco'
--Agregaciones1 estudiantes y profesores
select pf.nombre,count(es.cedula) from estudiantes es,profesores pf
where es.codigo_profesor = pf.codigo
group by codigo_profesor,pf.nombre
--Agregaciones2 estudiantes y profesores
select round(AVG(extract(year from current_date) - extract(year from fecha_nacimiento)))
FROM estudiantes
select * from estudiantes

select nombre,apellido from estudiantes where nombre like 'm%' or apellido like '%z'
select nombre from estudiantes where cedula like '%32%' and cedula like '18%'
select nombre,apellido from estudiantes where cedula like '%06' or cedula like '17%'
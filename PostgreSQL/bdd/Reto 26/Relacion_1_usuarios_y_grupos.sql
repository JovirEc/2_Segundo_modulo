select * from usuarios
select * from grupo
select * from usuario_grupo

--CONSULTA1 USUARIOS Y GRUPO
select us.nombre,gr.nombre from usuarios us,grupo gr,usuario_grupo ug
where us.id = ug.us_id and gr.id = ug.gr_id
--SUBCONSULTA1 USUARIOS Y GRUPO
select us.nombre from usuarios us, grupo gr, usuario_grupo ug
where us.id = ug.us_id and gr.id = ug.gr_id
and gr_id in (1)
--Función de agregación1
select gr.nombre,count(ug.us_id) from grupo gr,usuario_grupo ug
where gr.id = ug.gr_id
group by gr.nombre

---------------------------------------
--CONSULTA2 USUARIOS Y GRUPO

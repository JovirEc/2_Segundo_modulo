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


--Consulta 2 usuarios y grupos
select us.nombre,gr.nombre from usuarios us, grupo gr, usuario_grupo ug
where us.id = ug.us_id and gr.id = ug.gr_id
and gr.nombre like '%intensivo%'
--Subconsulta 2 usuarios y grupos
select us.nombre from usuarios us,usuario_grupo ug
where us.id = ug.us_id and us.id in (select us_id from usuario_grupo where gr_id = 2)
--Agregacion 2
select gr.nombre,max(ug.us_id),min(ug.us_id) from grupo gr,usuario_grupo ug
where gr.id = ug.gr_id 
group by gr.nombre


--Consulta 3 usuarios y grupos
select us.nombre,gr.fecha_creacion from usuarios us, grupo gr, usuario_grupo ug
where us.id = ug.us_id and gr.id = ug.gr_id
and gr.fecha_creacion between '2020-03-08' and '2022-03-08'
--Subconsulta 3 usuarios y grupos
select us.nombre from usuarios us
where us.id in (select us_id from usuario_grupo where gr_id = 3)
--Agregacion 3 usuarios y grupos
select gr.descripcion, count(ug.us_id) from grupo gr, usuario_grupo ug
where gr.id = ug.gr_id
and gr.descripcion like '&matutino'
group by gr.descripcion
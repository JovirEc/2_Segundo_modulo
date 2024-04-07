select * from usuarios
select * from grupo
select * from usuario_grupo

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

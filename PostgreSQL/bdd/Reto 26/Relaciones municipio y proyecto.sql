select * from municipio
select * from proyecto
select * from proyecto_municipio
select * from ciudad

--Consulta 1 municipio y proyecto
select mun.nombre, pro.proyecto from municipio mun,proyecto pro, proyecto_municipio pm
where mun.id = pm.municipio_id and pro.id = pm.proyecto_id
--Subconsulta 1 municipio y proyecto
select pro.proyecto from proyecto pro
where pro.id in(select proyecto_id from proyecto_municipio where municipio_id = 1)
--Agregacion 1 municipio y proyecto
select mun.nombre,count(pm.proyecto_id) from municipio mun,proyecto_municipio pm
where mun.id = pm.municipio_id
group by mun.nombre


--Consulta 2 municipio y proyecto
select mun.nombre, pro.proyecto from municipio mun,proyecto pro,proyecto_municipio pm
where mun.id = pm.municipio_id and pro.id = pm.proyecto_id
and mun.nombre like '%GAD%'
--Agregacion 2 municipio y proyecto
select mun.nombre,min(pm.proyecto_id) from municipio mun,proyecto_municipio pm
where mun.id = pm.municipio_id
group by mun.nombre


--Consulta 3 municipio y proyecto
select mun.nombre, ciu.nombre from municipio mun,ciudad ciu
where mun.id = ciu.id
--Subconsulta 3 municipio y proyecto
select pro.proyecto from proyecto pro
where pro.id in (select proyecto_id from proyecto_municipio where municipio_id = 3)
--Agregacion 3 municipio y proyecto
select mun.nombre, max(pm.proyecto_id) from municipio mun,proyecto_municipio pm
where mun.id = pm.municipio_id 
group by mun.nombre
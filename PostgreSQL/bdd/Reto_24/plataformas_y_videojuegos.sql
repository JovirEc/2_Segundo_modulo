--Consulta plataformas videojuegos
select vj.nombre,vj.descripcion,vj.valoracion,pf.nombre_plataforma from videojuegos vj,plataformas pf
where pf.codigo_videojuego = vj.codigo and vj.descripcion like '%guerra%' and (vj.valoracion > 7 or vj.nombre like 'C%') and ( vj.valoracion > 8 and vj.nombre like 'D%')
--Subconsulta plataformas videojuegos
select pf.id_plataforma,pf.nombre_plataforma,pf.codigo_videojuego from videojuegos vj,plataformas pf
where pf.codigo_videojuego = vj.codigo and vj.nombre = 'God of War'
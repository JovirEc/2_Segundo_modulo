--Consulta Prodcutos ventas
select pr.nombre,pr.stock,v.cantidad from productos pr,ventas v
where v.codigo_producto = pr.codigo and (pr.nombre like '%m%') or pr.descripcion = '0'
--Subconsulta Productos ventas
select pr.nombre,pr.stock from productos pr,ventas v
where v.codigo_producto = pr.codigo and v.cantidad = 5
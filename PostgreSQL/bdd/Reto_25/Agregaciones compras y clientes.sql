--Agregacion1 compras y clientes
select cedula,sum(monto) from compras
group by cedula
--Agregacion2 compras y clientes
select fecha_compra, count(fecha_compra) from compras
where fecha_compra = '2024-03-15'
group by fecha_compra

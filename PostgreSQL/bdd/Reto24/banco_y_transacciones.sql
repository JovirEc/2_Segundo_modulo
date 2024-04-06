--Consulta Banco transacciones
select * from transacciones tr, banco bc
where bc.codigo_transaccion = tr.codigo and tr.tipo = 'C' and (tr.numero_cuenta between 22001 and 22004)
--Subconsulta Banco Transaccioens
select * from transacciones tr, banco bc
where bc.codigo_transaccion = tr.codigo and bc.codigo_transaccion = 1
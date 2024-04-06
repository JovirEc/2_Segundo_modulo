--Consulta Prestamo Persona
select pe.cantidad_ahorrada,pr.monto,pr.garante from personas pe,prestamo pr
where pr.cedula = pe.cedula and (pr.monto between '100' and '1000')
--Subconsulta Prestamo Persona
select * from personas pe,prestamo pr where pe.cedula = pr.cedula and (pe.nombre = 'Sean')
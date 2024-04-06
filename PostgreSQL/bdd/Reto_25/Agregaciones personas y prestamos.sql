--Agregacion1 personas y prestamo
select pr.cedula,sum(pr.monto) from prestamo pr,personas pe
where pr.cedula = pe.cedula
group by pr.cedula;
--Agregacion2 personas y prestamo
select count(cedula) as total_personas from personas 
where numero_hijos > 1 
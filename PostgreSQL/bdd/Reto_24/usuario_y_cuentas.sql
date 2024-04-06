--CONSULTA USUARIO Y CUENTAS
select ct.numero_cuenta,us.nombre from cuentas ct,usuario us
where ct.cedula_propietario = us.cedula and (ct.saldo between '100,00€' and '1000,00€') and (ct.fecha_creacion between '2022-09-21' and '2023-09-21')

--SUBCONSULTA USUARIO Y CUENTAS
select * from cuentas ct,usuario us
where ct.cedula_propietario = us.cedula and (ct.fecha_creacion between '2022-09-21' and '2023-09-21')
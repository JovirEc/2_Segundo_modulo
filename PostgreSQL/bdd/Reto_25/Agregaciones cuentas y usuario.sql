--Agregacion1 cuentas y usuario
select AVG(cast (saldo as numeric)) from cuentas
where cedula_propietario = '20004'
--Agregacion2 cuentas y usuario
select count(cedula) from usuario
group by (tipo_cuenta)
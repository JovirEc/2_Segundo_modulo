select * from cuentas

select numero_cuenta,saldo from cuentas where saldo > money(100) and saldo < money(1000)
select * from cuentas where fecha_creacion > '10/03/2023' and fecha_creacion < '10/03/2024'
select * from cuentas where saldo = money(0) or cedula_propietario like '%2'
select * from transacciones

select * from transacciones
where tipo = 'C' and (numero_cuenta between 22001 and 222004)

select  * from transacciones
where tipo = 'D'
and (extract(month from fecha) = 05 and extract(day from fecha) = 25)
and numero_cuenta between 22007 and 22010

select * from transacciones where codigo between 1 and 5
and numero_cuenta between 22002 and 22004
and (extract(month from fecha) = 05 and extract (day from fecha) between 26 and 29)
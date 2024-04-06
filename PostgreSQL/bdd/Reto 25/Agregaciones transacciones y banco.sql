--Agregaciones 1 transacciones y banco
select count(tipo) as total_transacciones_credito from transacciones
where tipo = 'C'
--Agregaciones 2 transacciones y banco
select numero_cuenta,round(avg(cast (monto as decimal)),2) as monto_promedio from transacciones
group by numero_cuenta
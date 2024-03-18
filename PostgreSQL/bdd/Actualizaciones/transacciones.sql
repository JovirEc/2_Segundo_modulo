select * from transacciones

update transacciones set tipo = 'T' 
where monto between money(100) and money(500) 

update transacciones set tipo = 'T' 
where fecha between '01/09/2023' and '30/09/2023'

update transacciones set tipo = 'T' 
where hora between '14:00' and '20:00'
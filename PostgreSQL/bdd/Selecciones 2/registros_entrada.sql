select * from registros_entrada

select * from registros_entrada
where extract(month from fecha) = 09 or cedula_empleado like '17%'

select * from registros_entrada
where extract(month from fecha) = 08 and cedula_empleado like '17%' and (hora between '08:00' and '12:00')

select * from registros_entrada
where (extract(month from fecha) = 08 and cedula_empleado like '17%' and (hora between '08:00' and '12:00'))
or (extract(month from fecha) = 09 and cedula_empleado like '08%' and (hora between '09:00' and '13:00'))

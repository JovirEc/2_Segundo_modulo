select count ( ec.codigo) from personas per, estado_civil ec
where per.estado_civil_codigo = ec.codigo
and estado_civil_codigo = 'C'

select AVG ( cast ( cantidad_ahorrada as numeric))
from personas

select AVG (cast(cantidad_ahorrada as numeric))
from personas per,estado_civil ec
where per.estado_civil_codigo = ec.codigo
and estado_civil_codigo = 'C'


--MAX PARA SACAR EL MAXIMO NUMERO DE UNA COLUMNA
--MIN PARA SACAR EL MISMO NUMERO DE UNA COLUMNA
--SUM PARA HACER LA SUMA

--group by -- Para agregar
select * from personas
group by estado_civil_codigo

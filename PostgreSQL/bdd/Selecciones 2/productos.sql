select * from productos

select * from productos where stock = 10 and precio < money(10)
select nombre,stock from productos where nombre like '%m%' or descripcion like '% %'
select nombre from productos where descripcion is null or stock = 0
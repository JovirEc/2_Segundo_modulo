select * from videojuegos

select * from videojuegos 
where (nombre like '%c%' or nombre like 'C%' or nombre like '%c') or valoracion = 7

select * from videojuegos
where (codigo between 3 and 7) or valoracion = 7

select * from videojuegos
where (descripcion = 'juego de guerra' and valoracion > 7 and nombre like 'C%')
or (valoracion > 8 and nombre like 'D%')
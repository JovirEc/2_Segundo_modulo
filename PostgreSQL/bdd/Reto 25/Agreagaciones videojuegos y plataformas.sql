--Agregacion1 videojuegos y plataformas
select codigo_videojuego,count(nombre_plataforma) from plataformas
group by codigo_videojuego
--Agregacion2 videojuegos y plataformas
select round(avg(valoracion),2) from videojuegos
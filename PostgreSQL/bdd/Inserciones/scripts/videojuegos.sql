-- Script 5
create table videojuegos(
	codigo int not null,
	nombre varchar(100) not null,
	descripcion varchar(300),
	valoracion int not null,
	constraint videojuegos_pk primary key (codigo)
)

select * from videojuegos

insert into videojuegos (codigo,nombre,descripcion,valoracion)
values (12121,'The Witcher 3: Wild Hunt','Epica aventura de caza de monstruos.',10)

insert into videojuegos (codigo,nombre,descripcion,valoracion)
values (42687,'Fortnite','Batallas intensas en un mundo dinámico.',9)

insert into videojuegos (codigo,nombre,descripcion,valoracion)
values (34625,'Minecraft','Construye y explora tu propio mundo.',10)

insert into videojuegos (codigo,nombre,descripcion,valoracion)
values (79365,'Overwatch','Combates en equipo con héroes variados.',8)

insert into videojuegos (codigo,nombre,descripcion,valoracion)
values (41237,'Grand Theft Auto V','Crimen, caos y diversión en Los Santos.',10)

insert into videojuegos (codigo,nombre,valoracion)
values (44362,'The Legend of Zelda',9)

insert into videojuegos (codigo,nombre,valoracion)
values (22458,'Doom Eternal',7)

insert into videojuegos (codigo,nombre,valoracion)
values (76432,'Apex Legends',7)

select * from videojuegos
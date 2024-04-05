select * from plataformas
--Inserts videojuegos
insert into videojuegos (codigo,nombre,descripcion,valoracion) values (79365,'Overwatch','Combates en equipo con héroes variados'8);
insert into videojuegos (codigo,nombre,descripcion,valoracion) values (22458,'Doom Eternal','Guerra con alienígenas',7);
insert into videojuegos (codigo,nombre,descripcion,valoracion) values (76432,'C-Apex Legends','Guerra multiplayer',7);
insert into videojuegos (codigo,nombre,descripcion,valoracion) values (12121,'The Witcher 3: Wild Hunt','Mejor puntuado',10);
insert into videojuegos (codigo,nombre,descripcion,valoracion) values (42687,'Fortnite','Mejor puntuado',9);
insert into videojuegos (codigo,nombre,descripcion,valoracion) values (41237,'Grand Theft Auto V','Mejor puntuado',10);
insert into videojuegos (codigo,nombre,descripcion,valoracion) values (34625,'C-Minecraft','Mejor puntuado',10);
insert into videojuegos (codigo,nombre,descripcion,valoracion) values (44362,'C-The Legend of Zelda','Mejor puntuado',9);
insert into videojuegos (codigo,nombre,descripcion,valoracion) values (7563,'Call of Duty','juego de terror',9);
insert into videojuegos (codigo,nombre,descripcion,valoracion) values (85421,'Free Fire','juego de accion',7);
insert into videojuegos (codigo,nombre,descripcion,valoracion) values (93475,'Call of Clans','juego de terror',10);


--Inserts Plataformas
insert into plataformas (id_plataforma,nombre_plataforma,codigo_videojuego) values (0001,'Playstation',79365);
insert into plataformas (id_plataforma,nombre_plataforma,codigo_videojuego) values (0002,'Xbox',22458);
insert into plataformas (id_plataforma,nombre_plataforma,codigo_videojuego) values (0003,'Pc',76432);
insert into plataformas (id_plataforma,nombre_plataforma,codigo_videojuego) values (0004,'Playstation',12121);
insert into plataformas (id_plataforma,nombre_plataforma,codigo_videojuego) values (0005,'Xbox',42687);
insert into plataformas (id_plataforma,nombre_plataforma,codigo_videojuego) values (0006,'Nintendo',41237);
insert into plataformas (id_plataforma,nombre_plataforma,codigo_videojuego) values (0007,'Pc',34625);
insert into plataformas (id_plataforma,nombre_plataforma,codigo_videojuego) values (0008,'Playstation',44362);
insert into plataformas (id_plataforma,nombre_plataforma,codigo_videojuego) values (0009,'Xbox',85421);
insert into plataformas (id_plataforma,nombre_plataforma,codigo_videojuego) values (0010,'Playstation',93475);


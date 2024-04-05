select * from ventas

--Inserts productos
insert into productos (codigo,nombre,descripcion,precio,stock) values (001,'Jabón','Lavatodo',3.50,10);
insert into productos (codigo,nombre,descripcion,precio,stock) values (002,'Shampoo','Sabital',2.50,20);
insert into productos (codigo,nombre,descripcion,precio,stock) values (003,'Deja','Deja',1.50,30);
insert into productos (codigo,nombre,descripcion,precio,stock) values (004,'Pasta Dental','Fortident',3.00,40);
insert into productos (codigo,nombre,descripcion,precio,stock) values (005,'Cera','Cera de piso',2.50,50);
insert into productos (codigo,nombre,precio,stock) values (006,'Pan',3.00,50);
insert into productos (codigo,nombre,precio,stock) values (007,'Queso',5.50,60);
insert into productos (codigo,nombre,precio,stock) values (008,'Leche',2.50,70);
insert into productos (codigo,nombre,precio,stock) values (009,'Jamón',1.00,120);
insert into productos (codigo,nombre,precio,stock) values (010,'CocaCola',3.50,300);

--Inserts ventas
insert into ventas (id_venta,codigo_producto,fecha_venta,cantidad) values (0001,001,'04/04/2024',2);
insert into ventas (id_venta,codigo_producto,fecha_venta,cantidad) values (0002,002,'04/04/2024',3);
insert into ventas (id_venta,codigo_producto,fecha_venta,cantidad) values (0003,003,'04/04/2024',5);
insert into ventas (id_venta,codigo_producto,fecha_venta,cantidad) values (0004,001,'04/04/2024',3);
insert into ventas (id_venta,codigo_producto,fecha_venta,cantidad) values (0005,002,'04/04/2024',2);
insert into ventas (id_venta,codigo_producto,fecha_venta,cantidad) values (0006,003,'04/04/2024',3);
insert into ventas (id_venta,codigo_producto,fecha_venta,cantidad) values (0007,001,'04/04/2024',5);
insert into ventas (id_venta,codigo_producto,fecha_venta,cantidad) values (0008,002,'04/04/2024',3);
insert into ventas (id_venta,codigo_producto,fecha_venta,cantidad) values (0009,001,'04/04/2024',4);
insert into ventas (id_venta,codigo_producto,fecha_venta,cantidad) values (0010,003,'04/04/2024',5);
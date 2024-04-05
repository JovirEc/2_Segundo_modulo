select * from compras
--Inserts clientes
insert into clientes (cedula,nombre,apellido) values (1234567890,'Juan','Perez');
insert into clientes (cedula,nombre,apellido) values (9876543210,'Monica','López');
insert into clientes (cedula,nombre,apellido) values (4567890123,'Carlos','García');
insert into clientes (cedula,nombre,apellido) values (7890123456,'Monica','Martínez');
insert into clientes (cedula,nombre,apellido) values (2345678901,'Luis','Rodríguez');
insert into clientes (cedula,nombre,apellido) values (9012345678,'Laura','Sanchez');
insert into clientes (cedula,nombre,apellido) values (5678901234,'Pedro','Ramírez');
insert into clientes (cedula,nombre,apellido) values (3456789012,'Marta','Gonzalez');
insert into clientes (cedula,nombre,apellido) values (6789012345,'Javier','Diaz');
insert into clientes (cedula,nombre,apellido) values (0123456789,'Carolina','Fernandez');

--Inserts Compras
insert into compras (id_compra,cedula,fecha_compra,monto) values (1110,1234567890,'2024-03-15',1500);
insert into compras (id_compra,cedula,fecha_compra,monto) values (1001,9876543210,'2024-02-28',2300);
insert into compras (id_compra,cedula,fecha_compra,monto) values (1002,4567890123,'2024-01-10',1800);
insert into compras (id_compra,cedula,fecha_compra,monto) values (1003,7890123456,'2024-04-03',3200);
insert into compras (id_compra,cedula,fecha_compra,monto) values (1004,2345678901,'2024-03-20',2750);
insert into compras (id_compra,cedula,fecha_compra,monto) values (1005,9012345678,'2024-02-15',1950);
insert into compras (id_compra,cedula,fecha_compra,monto) values (1006,5678901234,'2024-01-05',2100);
insert into compras (id_compra,cedula,fecha_compra,monto) values (1007,3456789012,'2024-04-01',2800);
insert into compras (id_compra,cedula,fecha_compra,monto) values (1008,6789012345,'2024-03-10',1750);
insert into compras (id_compra,cedula,fecha_compra,monto) values (1009,0123456789,'2024-02-18',1950);
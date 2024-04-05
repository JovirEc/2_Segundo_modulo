select * from cuentas

--Inserts de USUARIO
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito) values (20000,'Juan','Perez','Ahorros',426.85);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito) values (20001,'Maria','García','Corriente',7584.24);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito) values (20002,'Carlos','Rodríguez','Ahorros',543.91);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito) values (20003,'Ana','Martinez','Credito',3120.57);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito) values (20004,'Pedro','López','Ahorros',167.46);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito) values (20005,'Laura','Sánchez','Corriente',8450.32);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito) values (20006,'David','Gonzáles','Ahorros',512.78);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito) values (20007,'Marta','Fernández','Corriente',6780.93);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito) values (20008,'Sergio','Díaz','Ahorros',729.11);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito) values (20009,'Paula','Ruiz','Corriente',1950.76);

--Inserts de Cuentas
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo) values (10000,20000,'21/08/2022',300);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo) values (10001,20000,'21/08/2021',500);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo) values (10002,20001,'21/09/2022',6700);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo) values (10003,20001,'21/09/2021',750);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo) values (10004,20002,'21/10/2022',10);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo) values (10005,20002,'21/10/2021',10);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo) values (10006,20003,'21/11/2022',10);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo) values (10007,20003,'21/11/2021',10);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo) values (10008,20004,'21/12/2022',500);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo) values (10009,20004,'21/12/2021',600);
-- Script 2
create table cuentas(
	numero_cuenta char(5) not null,
	cedula_propietario char(5) not null,
	fecha_creacion date not null,
	saldo money not null,
	constraint cuentas_pk primary key (numero_cuenta)
)

select * from cuentas

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (10000,20000,'01/01/2023',300)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (10001,20001,'02/01/2023',200)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (10002,20002,'03/01/2023',500)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (10003,20003,'04/01/2023',600)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (10004,20004,'05/01/2023',100)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (10005,20005,'06/01/2023',750)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (10006,20006,'07/01/2023',2000)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (10007,20007,'08/01/2023',4500)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (10008,20008,'09/01/2023',6700)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (10009,20009,'10/01/2023',950)

select * from cuentas
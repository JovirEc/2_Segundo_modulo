-- Script 6
create table transacciones (
	codigo int not null,
	numero_cuenta char(5) not null,
	monto money not null,
	tipo char(1) not null,
	fecha date not null,
	hora time not null,
	constraint transacciones_pk primary key (codigo)
)

select * from transacciones

insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values (1234,56789,256.00,'C','15/04/2023','15:30')

insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values (9876,54321,120.00,'D','02/09/2022','12:30')

insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values (2345,67890,500.00,'C','11/07/2024','13:30')

insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values (8765,43210,80.00,'D','30/11/2023','16:30')

insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values (3456,78901,150.00,'C','05/06/2022','14:30')

insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values (6543,21098,300.00,'D','18/12/2024','15:30')

insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values (7890,12345,75.00,'D','30/11/2023','16:30')

insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values (4321,09876,200.00,'C','02/09/2022','12:30')

insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values (5678,90123,450.00,'D','05/06/2022','14:30')

insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values (2109,87654,30.00,'D','18/12/2024','15:30')

select * from transacciones
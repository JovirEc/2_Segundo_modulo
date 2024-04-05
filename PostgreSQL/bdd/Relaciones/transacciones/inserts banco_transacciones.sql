select * from banco

--Inserts transacciones
insert into transacciones (codigo,numero_cuenta,monto,tipo) values (1,67890,500,'T');
insert into transacciones (codigo,numero_cuenta,monto,tipo) values (9876,54321,120,'T');
insert into transacciones (codigo,numero_cuenta,monto,tipo) values (4321,9876,200,'T');
insert into transacciones (codigo,numero_cuenta,monto,tipo) values (53147,32102,500.65,'D');
insert into transacciones (codigo,numero_cuenta,monto,tipo) values (32165,51437,1050,'D');
insert into transacciones (codigo,numero_cuenta,monto,tipo) values (78542,2147,300,'D');
insert into transacciones (codigo,numero_cuenta,monto,tipo) values (23210,32015,400,'C');
insert into transacciones (codigo,numero_cuenta,monto,tipo) values (35412,85214,600,'D');
insert into transacciones (codigo,numero_cuenta,monto,tipo) values (78945,22004,200,'C');
insert into transacciones (codigo,numero_cuenta,monto,tipo) values (32548,22008,1600,'C');

--Inserts banco
insert into banco (codigo_banco,codigo_transaccion) values (1001,1);
insert into banco (codigo_banco,codigo_transaccion) values (1002,9876);
insert into banco (codigo_banco,codigo_transaccion) values (1003,4321);
insert into banco (codigo_banco,codigo_transaccion) values (1004,53147);
insert into banco (codigo_banco,codigo_transaccion) values (1005,32165);
insert into banco (codigo_banco,codigo_transaccion) values (1006,78542);
insert into banco (codigo_banco,codigo_transaccion) values (1007,23210);
insert into banco (codigo_banco,codigo_transaccion) values (1008,35412);
insert into banco (codigo_banco,codigo_transaccion) values (1009,78945);
insert into banco (codigo_banco,codigo_transaccion) values (1010,32548);

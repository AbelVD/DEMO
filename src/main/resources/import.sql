insert into categoria (nombre, idcategoria) values ('ANTENA', nextval ('in_categoria'));
insert into categoria (nombre, idcategoria) values ('MEMORIA', nextval ('in_categoria'));
insert into categoria (nombre, idcategoria) values ('TECLADO', nextval ('in_categoria'));
insert into categoria (nombre, idcategoria) values ('MOUSE', nextval ('in_categoria'));
insert into categoria (nombre, idcategoria) values ('ROUTER', nextval ('in_categoria'));

insert into producto (categoria_idcategoria, nombre, precio, stock, idproducto) values (1, 'LiteBeam m5 23', 220, 5, nextval ('in_producto'));
insert into producto (categoria_idcategoria, nombre, precio, stock, idproducto) values (2, 'USB 8GB', 30, 6, nextval ('in_producto'));
insert into producto (categoria_idcategoria, nombre, precio, stock, idproducto) values (3, 'TECLADO Genius', 35, 15, nextval ('in_producto'));
insert into producto (categoria_idcategoria, nombre, precio, stock, idproducto) values (4, 'Mouse Genius', 30, 50, nextval ('in_producto'));
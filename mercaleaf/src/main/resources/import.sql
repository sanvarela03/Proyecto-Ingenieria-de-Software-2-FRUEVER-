INSERT INTO rol (id_rol, nombre) VALUES (1, 'comprador');
INSERT INTO rol (id_rol, nombre) VALUES (2, 'productor');
INSERT INTO rol (id_rol, nombre) VALUES (3, 'transportador');

INSERT INTO usuarios (id_usuario, nombre, apellido, email,fecha_nacimiento ,create_at, id_rol, direccion) VALUES (1,'Santiago','Varela','random@gmail.com', '1998-03-22','2020-03-22',1,'Allá arriba en aquel alto');
INSERT INTO comprador (id_usuario) VALUES (1);


INSERT INTO usuarios (id_usuario, nombre, apellido, email,fecha_nacimiento ,create_at, id_rol, direccion) VALUES (2,'Pepito','Perez','raton@gmail.com', '2000-04-22', '2020-03-22',3,'akldsfjflkdfkk');

INSERT INTO "PROFESOR" ("p_profesor", "nombre", "apellidos", "dni") VALUES ('1', 'PABLO', 'GONZALEZ GONZALEZ', '11111111Y');
INSERT INTO "PROFESOR" ("p_profesor", "nombre", "apellidos", "dni") VALUES ('2', 'ALFREDO', 'PÉREZ ÁLVAREZ', '22222222Z');
INSERT INTO "PROFESOR" ("p_profesor", "nombre", "apellidos", "dni") VALUES ('3', 'JUAN', 'FERNÁNDEZ FERNÁNDEZ', '33333333W');
INSERT INTO "PROFESOR" ("p_profesor", "nombre", "apellidos", "dni") VALUES ('4', 'PEDRO', 'RUIZ CANALES', '44444444M');

INSERT INTO "AULA" ("p_aula", "capacidad", "situacion") VALUES ('1', '30', 'SEGUNDA PLANTA');
INSERT INTO "AULA" ("p_aula", "capacidad", "situacion") VALUES ('2', '35', 'SEGUNDA PLANTA');
INSERT INTO "AULA" ("p_aula", "capacidad", "situacion") VALUES ('3', '25', 'SEGUNDA PLANTA');
INSERT INTO "AULA" ("p_aula", "capacidad", "situacion") VALUES ('4', '35', 'SEGUNDA PLANTA');

INSERT INTO "GRUPO" ("p_grupo", "nombre", "a_aula") VALUES ('1', 'DAM1', '1');
INSERT INTO "GRUPO" ("p_grupo", "nombre", "a_aula") VALUES ('2', 'DAM2', '2');
INSERT INTO "GRUPO" ("p_grupo", "nombre", "a_aula") VALUES ('3', 'DAW1', '3');
INSERT INTO "GRUPO" ("p_grupo", "nombre", "a_aula") VALUES ('4', 'DAW2', '4');

INSERT INTO "ALUMNO" ("p_alumno", "nombre", "apellidos", "dni", "a_grupo") VALUES ('1', 'FERNANDO', 'AJA AJA', '80358091R', '2');
INSERT INTO "ALUMNO" ("p_alumno", "nombre", "apellidos", "dni", "a_grupo") VALUES ('2', 'MANUEL', 'ÁLVAREZ LAVÍN', '33443048J', '2');
INSERT INTO "ALUMNO" ("p_alumno", "nombre", "apellidos", "dni", "a_grupo") VALUES ('3', 'MARÍA VALENTINA', 'ARRANZ GONZÁLEZ', '45566588T', '2');
INSERT INTO "ALUMNO" ("p_alumno", "nombre", "apellidos", "dni", "a_grupo") VALUES ('4', 'PAULA', 'ARROYO LÓPEZ-CHACARRA', '53531031A', '2');
INSERT INTO "ALUMNO" ("p_alumno", "nombre", "apellidos", "dni", "a_grupo") VALUES ('5', 'ÁLVARO', 'BEDIA PILA', '56108989Y', '2');
INSERT INTO "ALUMNO" ("p_alumno", "nombre", "apellidos", "dni", "a_grupo") VALUES ('6', 'IVÁN', 'DIEGO BLANCO', '48759278Z', '2');
INSERT INTO "ALUMNO" ("p_alumno", "nombre", "apellidos", "dni", "a_grupo") VALUES ('7', 'ÁLVARO', 'FERNÁNDEZ SAINZ', '38063399D', '2');
INSERT INTO "ALUMNO" ("p_alumno", "nombre", "apellidos", "dni", "a_grupo") VALUES ('8', 'ÁNGEL', 'GARCÍA FRECHOSO', '20826788N', '2');
INSERT INTO "ALUMNO" ("p_alumno", "nombre", "apellidos", "dni", "a_grupo") VALUES ('9', 'PABLO', 'GUTIÉRREZ MUÑOZ', '29018320W', '2');

INSERT INTO "MODULO" ("p_modulo", "nombre", "n_horas", "a_profesor", "a_grupo") VALUES ('1', 'DESARROLLO DE INTERFACES', '8', '1', '2');
INSERT INTO "MODULO" ("p_modulo", "nombre", "n_horas", "a_profesor", "a_grupo") VALUES ('2', 'ACCESO A DATOS', '6', '2', '2');
INSERT INTO "MODULO" ("p_modulo", "nombre", "n_horas", "a_profesor", "a_grupo") VALUES ('3', 'PROGRAMACIÓN SERVICIOS Y PROCESOS', '5', '3', '2');
INSERT INTO "MODULO" ("p_modulo", "nombre", "n_horas", "a_profesor", "a_grupo") VALUES ('4', 'PROGRAMACIÓN DISPOSITIVOS MÓVILES', '5', '4', '2');

INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('1', '1', '1');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('2', '2', '1');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('3', '3', '1');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('4', '4', '1');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('5', '5', '1');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('6', '6', '1');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('7', '7', '1');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('8', '8', '1');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('9', '9', '1');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('10', '1', '2');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('11', '2', '2');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('12', '3', '2');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('13', '4', '2');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('14', '5', '3');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('15', '6', '3');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('16', '7', '3');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('17', '8', '3');
INSERT INTO "MOD_ALUM" ("p_mod_alum", "a_alumno", "a_modulo") VALUES ('18', '9', '3');




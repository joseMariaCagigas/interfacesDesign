CREATE TABLE ALUMNO (
                p_alumno NUMERIC(4) NOT NULL,
                nombre VARCHAR(50) NOT NULL,
                apellidos VARCHAR(50) NOT NULL,
                dni VARCHAR(9) NOT NULL,
                a_grupo NUMERIC(4) NOT NULL,
                PRIMARY KEY (p_alumno)
);


CREATE TABLE AULA (
                p_aula NUMERIC(4) NOT NULL,
                capacidad NUMERIC(2) NOT NULL,
                situacion VARCHAR(50) NOT NULL,
                PRIMARY KEY (p_aula)
);


CREATE TABLE GRUPO (
                p_grupo NUMERIC(4) NOT NULL,
                nombre VARCHAR(50) NOT NULL,
                a_aula NUMERIC(4) NOT NULL,
                PRIMARY KEY (p_grupo)
);


CREATE TABLE MOD_ALUM (
                p_mod_alum NUMERIC(4) NOT NULL,
                a_alumno NUMERIC(4) NOT NULL,
                a_modulo NUMERIC(4) NOT NULL,
                PRIMARY KEY (p_mod_alum)
);


CREATE TABLE MODULO (
                p_modulo NUMERIC(4) NOT NULL,
                nombre VARCHAR(50) NOT NULL,
                n_horas NUMERIC(2) NOT NULL,
                a_profesor NUMERIC(4) NOT NULL,
                a_grupo NUMERIC(4) NOT NULL,
                PRIMARY KEY (p_modulo)
);


CREATE TABLE PROFESOR (
                p_profesor NUMERIC(4) NOT NULL,
                nombre VARCHAR(50) NOT NULL,
                apellidos VARCHAR(50) NOT NULL,
                dni VARCHAR(9) NOT NULL,
                PRIMARY KEY (p_profesor)
);


ALTER TABLE MOD_ALUM ADD CONSTRAINT alumno_mod_alum_fk
FOREIGN KEY (a_alumno)
REFERENCES ALUMNO (p_alumno)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE GRUPO ADD CONSTRAINT aula_grupo_fk
FOREIGN KEY (a_aula)
REFERENCES AULA (p_aula)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE ALUMNO ADD CONSTRAINT grupo_alumno_fk
FOREIGN KEY (a_grupo)
REFERENCES GRUPO (p_grupo)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE MODULO ADD CONSTRAINT grupo_modulo_fk
FOREIGN KEY (a_grupo)
REFERENCES GRUPO (p_grupo)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE MOD_ALUM ADD CONSTRAINT modulo_mod_alum_fk
FOREIGN KEY (a_modulo)
REFERENCES MODULO (p_modulo)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE MODULO ADD CONSTRAINT profesor_modulo_fk
FOREIGN KEY (a_profesor)
REFERENCES PROFESOR (p_profesor)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

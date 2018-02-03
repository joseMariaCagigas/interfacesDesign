package Proyecto_Alumnos;

import java.io.Serializable;

public abstract class Alumno implements Tasable, Serializable {
    private String codigoAlumno;
    private Identidad id;

    public Alumno(Identidad id, String codigoAlumno) {
        this.id = id;
        this.codigoAlumno = codigoAlumno;
    }

    @Override
    public double calcularTasas(){
        return 300;
    }

    public Identidad getId() {
        return id;
    }

    public void setId(Identidad id) {
        this.id = id;
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Alumno al=(Alumno) obj;
        return this.codigoAlumno.equalsIgnoreCase(al.codigoAlumno);
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigoAlumno=" + codigoAlumno + ", id=" + id + '}';
    }
    
}

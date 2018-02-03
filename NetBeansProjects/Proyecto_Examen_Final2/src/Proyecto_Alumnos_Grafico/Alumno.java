/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Alumnos_Grafico;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author MaQuiNa1995
 */
public abstract class Alumno implements Tasable, Serializable {
    private String codigoAlumno;
    private Identidad id;
    private ArrayList<Alumno> Array_Alumno;

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

    public ArrayList<Alumno> getArray_Alumno() {
        return Array_Alumno;
    }

    public void setArray_Alumno(ArrayList<Alumno> Array_Alumno) {
        this.Array_Alumno = Array_Alumno;
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

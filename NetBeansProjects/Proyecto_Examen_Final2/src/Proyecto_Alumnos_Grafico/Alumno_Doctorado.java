/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Alumnos_Grafico;


/**
 *
 * @author MaQuiNa1995
 */
public class Alumno_Doctorado extends Alumno{

    private int Num_Cursos;

    public Alumno_Doctorado(Identidad id, String codigoAlumno,int Num_Cursos) {
        super(id, codigoAlumno);
        this.Num_Cursos = Num_Cursos;
    }

    @Override
    public double calcularTasas() {
        return super.calcularTasas() + (Num_Cursos * 150); 
    }

    @Override
    public String toString() {
        return super.toString()+" Numero De Cursos:" +Num_Cursos+ " Tasa: "+ calcularTasas(); 
    }

    public int getNum_Cursos() {
        return Num_Cursos;
    }

    public void setNum_Cursos(int Num_Cursos) {
        this.Num_Cursos = Num_Cursos;
    }
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Alumnos;

/**
 *
 * @author MaQuiNa1995
 */
public class Alumno_Standar extends Alumno{

    private String Curso;
    
    public Alumno_Standar(Identidad id,String  CodigoAlumno, String Curso) {
        super(id, CodigoAlumno);
        this.Curso = Curso;
    }

    @Override
    public double calcularTasas() {
        double Numero_Curso=Double.parseDouble(Curso.substring(0,1));
        Numero_Curso = Numero_Curso * 25;
        
        return super.calcularTasas()+Numero_Curso;
    }
    
    @Override
    public String toString() {
        System.out.println("Curso: "+Curso+ "Tasa: "+  calcularTasas());
        return super.toString(); 
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    
    
}

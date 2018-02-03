/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Alumnos_Grafico;

import java.io.Serializable;

/**
 *
 * @author MaQuiNa1995
 */
public class Identidad implements Serializable {
    private String Nombre,Apellidos;

    public Identidad(String Nombre, String Apellidos) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
    }

    @Override
    public String toString() {
        return "Identidad{" + "Nombre=" + Nombre + ", Apellidos=" + Apellidos + '}';
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.io.Serializable;
import javax.swing.JPanel;

/**
 *
 * @author El_Ma
 */
public class Ejercicio3 extends JPanel implements Serializable {

    private String rutaImagen;
    private int filas = 1 ,columnas = 1;

    public Ejercicio3() {
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void
            setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
}

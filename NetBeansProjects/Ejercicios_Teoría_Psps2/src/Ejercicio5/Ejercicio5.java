/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;
import oracle.jrockit.jfr.VMJFR;

/**
 *
 * @author MaQuiNa1995
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Random numero = new Random();
        Integer objeto = numero.nextInt(100);
        
        String nombreArchivo = "fichero.txt";

        FileWriter escribir = new FileWriter(nombreArchivo);

        escribir.write(objeto.toString());

        escribir.close();
    
    }
    
}

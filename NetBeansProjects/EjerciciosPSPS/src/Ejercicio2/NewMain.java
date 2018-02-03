/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author MaQuiNa1995
 */
public class NewMain {
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayNumero = new ArrayList();
        Random numero = new Random();
        int numeroaMeter, controlador = 0;
        
        do {
            numeroaMeter = numero.nextInt(500);
            arrayNumero.add(numeroaMeter);
            controlador = controlador + 1;
            
        } while (controlador < 50);
        
        Collections.sort(arrayNumero);
        
        for (Integer objetoSacado : arrayNumero) {
            System.out.println(objetoSacado.toString());
        }
    }
    
}

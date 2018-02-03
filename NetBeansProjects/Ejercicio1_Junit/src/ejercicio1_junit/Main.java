/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_junit;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author El_Ma
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws ejercicio1_junit.BRException
     */
    public static void main(String[] args) {
        Ejercicio1_Junit ejercicio = new Ejercicio1_Junit();
        

        try {
            System.out.println(ejercicio.calculaSalarioBruto("encargado", 1500, 1));
            System.out.println(ejercicio.calculaSalarioNeto(1500));
        } catch (BRException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}

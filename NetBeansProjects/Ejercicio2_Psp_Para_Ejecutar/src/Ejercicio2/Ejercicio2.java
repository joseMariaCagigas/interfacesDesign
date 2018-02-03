/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.io.IOException;

/**
 *
 * @author MaQuiNa1995
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean seguir=true;
        double Primer,Resultado=0;
        
        do {
            try {
                for (int i = 1; i < 3; i++) {
                    Primer =PedirDatos_Statica.Numero_Double("Introduce El "+ i +" Double: ");
                    Resultado = Primer + Resultado;
                }
            System.out.println("Resultado: "+Resultado);
        } catch (IOException ex) {
            seguir = false;
                System.err.println("Introduce Numeros Doubles");
        }
        } while (seguir =false);
        
        
        
        
    }
    
}

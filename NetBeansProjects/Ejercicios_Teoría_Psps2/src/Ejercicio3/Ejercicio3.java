/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

public class Ejercicio3 {

        public static void main(String[] args){
        Runtime rt = Runtime.getRuntime(); 
        Process p = null;
        String comando2= "CMD /C ";
        try {
            p= rt.exec(comando2);
         } catch (Exception ex){
            System.out.println ("Error al ejecutar el comando: " + comando2);
            System.exit(-1);
        }

        }

    }
    


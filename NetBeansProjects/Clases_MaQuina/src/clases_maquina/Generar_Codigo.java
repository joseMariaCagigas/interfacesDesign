/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_maquina;

import java.util.ArrayList;

public class Generar_Codigo {
    

        static ArrayList<String> Gen_Codigo(String[] Array_Opciones) {
        
        // A traves de un for recorremos las posiciones 0 a (Longitud Maxima Del Array -1)
        // Para mostrar el contenido indentado(Con sangria) y Con una numeracion de preguntas
        
        ArrayList<String> Array_Codigos = new ArrayList();
            
        for (int i = 0; i < Array_Opciones.length; i++) {
            
            String Codigos=Array_Opciones[i].substring(0, 3);
        
            Array_Codigos.add(Codigos);
        }
        
        return Array_Codigos;
        }
        
        
        
        static ArrayList<String> Gen_Codigo(String[] Array_Opciones,int Pos_Ini,int Pos_Fin) {
        
        // A traves de un for recorremos las posiciones 0 a (Longitud Maxima Del Array -1)
        // Para mostrar el contenido indentado(Con sangria) y Con una numeracion de preguntas
        
        ArrayList<String> Array_Codigos = new ArrayList();
            
        for (int i = 0; i < Array_Opciones.length; i++) {
            
            String Codigos=Array_Opciones[i].substring(Pos_Ini, Pos_Fin);
        
            Array_Codigos.add(Codigos);
        }
        
        return Array_Codigos;
        }
}


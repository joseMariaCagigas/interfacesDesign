package Ejercicio3_4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3_4_Skype {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        // Fase Declaraciones Variables 
        PedirDatos leer = new PedirDatos();
        String Cadena_Sacada;
        String Edad = leer.Leer_String("¿ Cuantos Años Tienes ? ");
        
//        // Fase Escribir
//        FileOutputStream crear_fichero = new FileOutputStream("Ejercicio1.txt", true);
//        
//        for (int pos = 0; pos < Edad.length(); pos++) {
//            crear_fichero.write((byte) Edad.charAt(pos));
//        }
//        

        // ----------------------------Separador Fases Escribir---------------------------------
        
        // Fase Escribir 2
        // -------------------ATENCION---------------------
        // Se pone el true para que no te sobreescriba todo 
        //-------------------------------------------------
        FileWriter Escribir_Fichero=new FileWriter("Ejercicio1.txt", true);
        Escribir_Fichero.write(Edad);
        Escribir_Fichero.close();
        
        //Fase Leer

        BufferedReader leer_fichero = new BufferedReader(new FileReader("Ejercicio1.txt"));
        
        //Creamos un while para leer linea por linea el fichero
        while((Cadena_Sacada = leer_fichero.readLine())!=null){
            //Imprimimos por pantalla la variable 
            System.out.println(Cadena_Sacada);
    }
        
        //cerramos el flujo
        leer_fichero.close();
        
// ----------------------------Separador Fases Leer---------------------------------
//        // Fase Leer 2
//         int Comprobador;
//         try{
//             FileInputStream leer_fichero=new FileInputStream("Ejercicio1.txt");
//             while((Comprobador=leer_fichero.read())!=-1){
//                     System.out.print((char)Comprobador);
//             }
//                     leer_fichero.close();
//         }
//         catch (FileNotFoundException e){
//             System.out.println("¡Lo siento mucho. No se puede leer el fichero ya que no existe!");
//         }
         
        System.exit(0);
    }
}



package Ejercicio_Ampliacion1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio_Ampliacion1 {

    public static void main(String[] args) throws IOException {
        
        PedirDatos leer = new PedirDatos();
        String Cadena_Pedida,Strings_Dentro;
        
        //Fase Escribir
        FileWriter Escribir_Fichero=new FileWriter("Ejercicio1.txt", true);
        do{
            Cadena_Pedida = leer.Leer_String("Escribe Fin Para Salir: ");
            
            if (Cadena_Pedida.equalsIgnoreCase("Fin")== false){
                Escribir_Fichero.write(Cadena_Pedida+"\n");
            }
            
        } while(Cadena_Pedida.equalsIgnoreCase("Fin")== false);
        
        Escribir_Fichero.close();
        
        // Fase Leer
        BufferedReader leer_fichero = new BufferedReader(new FileReader("Ejercicio1.txt"));
        while((Strings_Dentro = leer_fichero.readLine())!=null){
            System.out.println(Strings_Dentro);
        }
        
        leer_fichero.close();
        
    }

}

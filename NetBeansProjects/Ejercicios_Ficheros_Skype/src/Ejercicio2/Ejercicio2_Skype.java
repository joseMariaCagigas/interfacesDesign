package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2_Skype {

    public static void main(String[] args) throws FileNotFoundException, IOException {
//        String Cadena_Sacada;
//        
//        BufferedReader leer_fichero = new BufferedReader(new FileReader("Ejercicio1.txt"));
//        
//        while ((Cadena_Sacada = leer_fichero.readLine())!=null) {
//            System.out.println(Cadena_Sacada);
//        }
//
//        leer_fichero.close();
//        

        int c;
        try {
            FileInputStream f = new FileInputStream("Ejercicio1.txt");
            while ((c = f.read()) != -1) {
                System.out.print((char) c);
            }
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("¡Lo siento mucho. No se puede leer el fichero ya que no existe!");
        }
        
        
        System.exit(0);
    }

}

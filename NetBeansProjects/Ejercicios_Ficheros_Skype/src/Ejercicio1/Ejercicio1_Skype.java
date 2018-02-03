package Ejercicio1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio1_Skype {

    public static void main(String[] args) throws IOException {
        
        // Declaraciones
        
        
        PedirDatos leer = new PedirDatos();
        String Nombre = leer.Leer_String("¿ Como Te Llamas ? ");
        
        FileOutputStream fichero = new FileOutputStream("Ejercicio1.txt", true);

        for (int pos = 0; pos < Nombre.length(); pos++) {
            fichero.write((byte) Nombre.charAt(pos));
        }
        
        fichero.close();
        
    }

}

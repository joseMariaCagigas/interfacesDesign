// --------------------- Clase Gestion De Ficheros Open Source ---------------------------------------
// Version: Beta
// Creado Por MaQuina reconoce el trabajo del autor ;)
package Ejercicio5;

// Imports
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

// Comienzo De La Clase
public class GestionFicheros {

    // Constructor
    public GestionFicheros() {

    }
    
    static String Meter_Objeto(String Nombre_Archivo, Object Objeto, boolean Sobreescribir) throws FileNotFoundException, IOException {

        FileOutputStream fos;
        ObjectOutputStream oos;

        File archivo = new File(Nombre_Archivo);

        if (archivo.length() != 0) {
            fos = new FileOutputStream(archivo, Sobreescribir);
            oos = new MiObjectOutputStream(fos);
        } else {
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(Objeto);

        fos.close();
        oos.close();

        return "Objeto Guardado Con Exito";

    }

}

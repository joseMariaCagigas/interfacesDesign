// --------------------- Clase Gestion De Ficheros Open Source ---------------------------------------
// Version: Beta
// Creado Por MaQuina reconoce el trabajo del autor ;)
package clases_maquina;

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

    // Parametros:
    //          Pregunta: Corresponde a la pregunta que se le hará al usuario para que su respuesta quede guardada
    //                  como String en el fichero
    //          NombreFichero: Corresponde al nombre del fichero donde queremos guardar
    //              Si no existe: Lo crea
    //              Si existe: Depende que le pasemos como tercer parametro:
    //                      true: Añade la String
    //                      false: destruye lo que haya dentro del fichero y despues añade la String
    static String Meter_String(String Pregunta, String NombreFichero, boolean Sobreescribir) throws IOException {

        // Definicion De Variables
        String Cadena_Pedida;

        try {
            // Creamos El Objeto Para Escribir En Ficheros
            FileWriter Escribir_Fichero = new FileWriter(NombreFichero, Sobreescribir);

            //Pedimos al usuario el string que quiere meter al fichero a traves de la clase PedirDatos_Statica
            //Parametros:
            //       Pregunta: Es la pregunta que le haremos al usuario es tipo String y fue pasada como parametro antes
            Cadena_Pedida = PedirDatos_Statica.Leer_String(Pregunta);

            // Metemos en el fichero lo que escribio el usuario acompañado de un salto de linea
            Escribir_Fichero.write(Cadena_Pedida + "\n");

            // Cerramos el flujo
            Escribir_Fichero.close();

            //Returnamos una string describiendo el exito del proceso
            return "String Guardada En El Fichero: " + NombreFichero + " Con Exito";

            // Capturamos excepciones
        } catch (IOException error) {
            return "Hubo Un Error Fatal De Escritura >.<";
        }

    }

    // Al Llamar Al Metodo aique capturar la excepcion IO saltará en caso de que no exista el fichero
    //   try{
    //    GestionFicheros.Leer_Fichero_String("Nuevo.txt");
    //   } catch (IOException error){
    //        System.out.println("No Existe El Fichero");
    //   }
    // Parametros:
    //          NombreFichero: Corresponde al nombre del fichero del que queremos leer
    static void Leer_Fichero_String(String NombreFichero) throws FileNotFoundException, IOException {

        // Deficinion De Variables
        String Strings_Dentro;

        // Creamos El Objeto Para Leer De Ficheros
        BufferedReader leer_fichero = new BufferedReader(new FileReader(NombreFichero));

        try {

            // Mientras La siguiente linea no sea nula sacamos la String 
            while ((Strings_Dentro = leer_fichero.readLine()) != null) {
                // Imprimimos en pantalla la String Sacada
                System.out.println(Strings_Dentro);
            }

            // Capturamos Excepciones
        } catch (IOException error) {
            System.out.println("Hubo Un Error De Escritura O_o");
        }

        // Cerramos flujos
        leer_fichero.close();

    }

    // En caso De no existir el fichero, lo crea
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

    // Parametros:
    //          NombreFichero: Corresponde al nombre del fichero del que queremos leer
    //              Si no existe:
    //                      -Te muestra un mensaje acorde
    //              Si existe:
    //                      -No esta vacio: Te muestra el contenido
    //                      -Esta vacio: Te muestra un mensaje acorde
    static void Leer_Fichero_Objetos(String Nombre_Archivo) throws FileNotFoundException, IOException, ClassNotFoundException {

        // Creamos el objeto para manejar ficheros
        File archivo = new File(Nombre_Archivo);

        // Definicion de variables
        boolean Encontrado = false;

        // Si el archivo existe: pasa a leerlo
        // Si no existe: muestra un mensaje
        if (archivo.exists() == false) {
            System.out.println("No Existe El Fichero...");
        } else {

            // Creamos los flujos para meter objetos
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);

            try {

                // Mientras sea cierto 
                while (true) {

                    // creamos un nuevo objeto con el objeto sacado del fichero:
                    // IMPORTANTE: cambiar "Empleados" en los 2 sitios por el nombre de la clase
                    // del que quieres recuperar objetos
                    Empleados Objeto_Sacado = (Empleados) ois.readObject();

                    // Hacemos el toString de los atributos del objeto sacado
                    System.out.println(Objeto_Sacado.toString());

                    // Ponemos encontrado a true para verificar que se encontraron objetos dentro
                    Encontrado = true;
                }

                // capturamos la excepcion final de fichero que saltara cuando se llegue al final
                // por lo tanto saldra del bucle 
            } catch (EOFException error) {
                // si encontrado es false es que no se encontro ningun objeto
                if (Encontrado == false) {
                    // por lo tanto mandamos un mensaje acorde
                    System.out.println("Ningun Objeto Encontrado");
                }

            }
            // cerramos flujos
            fis.close();
            ois.close();
        }
    }

    static boolean Eliminar_Archivo() {

        String Respuesta = JOptionPane.showInputDialog(null, "Introduce El Nombre De La Copia De Seguridad a Borrar", "Borrar", 1);

        File archivo = new File(Respuesta);

        if (archivo.exists()) {
            archivo.delete();
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El Archivo No Se Llama Asi o No Existe", "Error 404", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}

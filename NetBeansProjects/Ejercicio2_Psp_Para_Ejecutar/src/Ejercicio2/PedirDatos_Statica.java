// --------------------- Clase PedirDatos v1.2 Open Source ---------------------------------------
// Creado Por MaQuina reconoce el trabajo del autor ;)
// ----------Nombre Del Paquete----------
package Ejercicio2;

//-------------- Imports -------------------
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Inicio De Clase
public class PedirDatos_Statica {

    //Metodo constructor 
    PedirDatos_Statica() {

    }

    // Como Funciona Esta Clase:
    //      Llama al metodo pasandole como parametro una String osea la pregunta, que sera mostrada
    //      El metodo devolvera una variable acorde al metodo llamado
    // ------------------ Leer String -----------------------
    static String Leer_String(String Pregunta) throws IOException {

        // Inicializamos El Objeto Que Usaremos Para Pedir Datos Al Usuario
        InputStreamReader flujo1 = new InputStreamReader(System.in);
        BufferedReader teclado1 = new BufferedReader(flujo1);

        boolean Seguir1;
        String Cadena = null;
        
        do {

            // Ponemos a true la variable Seguir1 que controla las excepciones
            Seguir1 = true;
            

            // Mostramos la pregunta pasada como parametro
            System.out.print(Pregunta);

            // Controlamos Excepciones y ponemos a false Seguir1 si solo si salta la IOException
            try {
                // Leemos La Entrada Del Teclado Para Recoger La Respuesta Del Usuario
                Cadena = teclado1.readLine();
            } catch (IOException error) {
                // Excepcion: Error De Escritura
                System.err.println("La Liaste Parda Hubo Un Error En La Escritura O_o");
                Seguir1 = false;
            }

            // Hacemos un Validador para que en caso de que se hubiera producido
            // Una excepcion repita el proceso
        } while (Seguir1 == false);

        // Returnamos la String validada
        return Cadena;

    }

    //------------------ Leer String Sin Numeros -----------------------
    static String Leer_String_Sin_Numeros(String Pregunta) throws IOException {

        
        
        //Inicializamos El Objeto Que Usaremos Para Pedir Datos Al Usuario
        InputStreamReader flujo1 = new InputStreamReader(System.in);
        BufferedReader teclado1 = new BufferedReader(flujo1);

        // Ponemos a true la variable Seguir1 que controla las excepciones
        boolean Seguir1,Seguir2;
        String Cadena_Sin_Numeros=null;

        do {

            // Ponemos Seguir2 a true y la cambiamos a false si se
            // produjo una entrada erronea 

            // Ponemos a true la variable Seguir1 que controla las excepciones
            Seguir1 = true;

            // Mostramos la pregunta pasada como parametro
            System.out.print(Pregunta);

            // Controlamos Excepciones y ponemos a false Seguir1 si solo si salta la IOException
            try {
                // Leemos La Entrada Del Teclado Para Recoger La Respuesta Del Usuario
                Cadena_Sin_Numeros = teclado1.readLine();
            } catch (IOException error) {
                System.err.println("La Liaste Parda Hubo Un Error En La Escritura O_o");
                Seguir1 = false;
            }

            // Validamos que Solo contenga caracteres comprendidos entre
            //  'a' a la 'z' en Mayusculas y Minisculas 
            Seguir2 = Cadena_Sin_Numeros.matches("[A-Za-z]*");

            // En caso de que contenga algo que no sea una letra
            //      False: Imprimimos un comentario acorde
            //      True: Ponemos Seguir2 a True Para Seguir La ejecucion
            if (Seguir2 == false) {
                System.err.println("Solo Admito Letras En Esta String ¬¬");
            } else {
                Seguir2 = true;
            }

            // Hacemos un Validador para que en caso de que se hubiera producido
            // Una excepcion o un dato erroneo repita el proceso
        } while (Seguir1 == false || Seguir2 == false);

        // Returnamos la String validada 
        return Cadena_Sin_Numeros;

    }

    //--------------- Leer Double --------------------------
    static Double Numero_Double(String Pregunta) throws IOException {

        // Inicializamos El Objeto Que Usaremos Para Pedir Datos Al Usuario
        InputStreamReader flujo2 = new InputStreamReader(System.in);
        BufferedReader teclado2 = new BufferedReader(flujo2);

        //Mostramos La Pregunta Pasada Como Parametro
        System.out.print(Pregunta);

        boolean Seguir2;
        double Numero_Double=0;
        
        do {

            // Ponemos a true la variable Seguir2 que controla las excepciones
            Seguir2 = true;

            try {
                // Leemos La Entrada Del Teclado Para Recoger La Respuesta Del Usuario
                Numero_Double = Double.parseDouble(teclado2.readLine());

            } catch (NumberFormatException error) {
                //Excepcion: Dato Mal Introducido
                System.err.println("La Liaste No Metiste Un Numero Valido");
                Seguir2 = false;
            } catch (IOException error) {
                // Excepcion: Error De Escritura
                System.err.println("La Liaste Parda Hubo Un Error En La Escritura O_o");
                Seguir2 = false;
            }

            // Hacemos un Validador para que en caso de que se hubiera producido
            // Una excepcion o un dato erroneo repita el proceso
        } while (Seguir2 == false);
        // Returnamos el double validado
        return Numero_Double;
    }

    //-------------------- Leer Numero ---------------------------
    static int Numero_Int(String Pregunta) throws IOException {

        // Inicializamos El Objeto Que Usaremos Para Pedir Datos Al Usuario
        InputStreamReader flujo3 = new InputStreamReader(System.in);
        BufferedReader teclado3 = new BufferedReader(flujo3);

        boolean Seguir3,Seguir2;
        int Numero_Int=0;
        
        do {

            // Ponemos a true la variable Seguir2 que controla las excepciones
            Seguir3 = true;

            //Mostramos La Pregunta Pasada Como Parametro
            System.out.print(Pregunta);

            try {
                // Leemos La Entrada Del Teclado Para Recoger La Respuesta Del Usuario
                Numero_Int = Integer.parseInt(teclado3.readLine());
            } catch (NumberFormatException error) {
                //Excepcion: Dato Mal Introducido
                System.err.println("No Me Engañes Eso No Fue Un Numero ¬¬");
                System.out.println(Pregunta);
                Seguir3 = false;
            } catch (IOException error) {
                // Excepcion: Error De Escritura
                System.err.println("La Liaste Parda Hubo Un Error En La Escritura O_o");
                Seguir2 = false;
            }

            // Hacemos un Validador para que en caso de que se hubiera producido
            // Una excepcion o un dato erroneo repita el proceso
        } while (Seguir3 == false);

        // Returnamos el int validado
        return Numero_Int;
    }

}
// Fin Clase

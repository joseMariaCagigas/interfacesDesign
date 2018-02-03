package Ejercicio1;

// --------------------- Clase Leer Open Source ---------------------------------------
// Creado Por MaQuina reconoce el trabajo del autor ;)
// Imports ---------------------------
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class PedirDatos  implements Serializable {

    // Deficion De Variables
    public int Numero_Int;
    public String Cadena;
    public Double Numero_Double;
    boolean Seguir1, Seguir2, Seguir3;

    //Metodo constructor 
    PedirDatos() {

    }

    // Metodo Para Saber Como Funciona Esta Clase
    void Como_Funciona() {
        System.out.println("Llama al metodo, pasandole como parametro una string, que es la pregunta. Retornará las variables:"
                + "Leer_Cadena: Cadena"
                + "Leer_Numero_Int: Numero_Int"
                + "Leer_Numero_Double: Numero_Double");
    }

    // ------------------ Leer String -----------------------
    String Leer_String(String Pregunta) throws IOException {

        // Inicializamos El Objeto Que Usaremos Para Pedir Datos Al Usuario
        InputStreamReader flujo1 = new InputStreamReader(System.in);
        BufferedReader teclado1 = new BufferedReader(flujo1);

        do {

            Seguir1 = true;

            System.out.print(Pregunta);

            try {
                Cadena = teclado1.readLine();
            } catch (IOException error) {
                System.out.println("La Liaste Parda Hubo Un Error En La Escritura O_o");
                Seguir1 = false;
            }

        } while (Seguir1 == false);

        return Cadena;

    }

    //--------------- Leer Double --------------------------
    Double Numero_Double(String Pregunta) throws IOException {

        // Inicializamos El Objeto Que Usaremos Para Pedir Datos Al Usuario
        InputStreamReader flujo2 = new InputStreamReader(System.in);
        BufferedReader teclado2 = new BufferedReader(flujo2);

        //Mostramos La Pregunta Pasada Como Parametro
        System.out.print(Pregunta);

        do {

            Seguir2 = true;

            try {
                Numero_Double = Double.parseDouble(teclado2.readLine());
            } catch (NumberFormatException error) {
                System.out.println("La Liaste Parda Hubo Un Error De Escritura :(");
                Seguir2 = false;
            } catch (ArithmeticException error) {
                System.out.println("La Liaste Al Meter Un Cero Al Dividir");
                Seguir2 = false;
            }

        } while (Seguir2 == false);

        return Numero_Double;
    }

    //-------------------- Leer Numero ---------------------------
    int Numero_Int(String Pregunta) throws IOException {

        // Inicializamos El Objeto Que Usaremos Para Pedir Datos Al Usuario
        InputStreamReader flujo3 = new InputStreamReader(System.in);
        BufferedReader teclado3 = new BufferedReader(flujo3);

        do {

            Seguir3 = true;

            System.out.print(Pregunta);

            try {
                Numero_Int = Integer.parseInt(teclado3.readLine());
            } catch (NumberFormatException error) {
                System.out.println("No Me Engañes Eso No Fue Un Numero ¬¬");
                Seguir3 = false;
            } catch (ArithmeticException error) {
                System.out.println("La Liaste Al Meter Un Cero Al Dividir");
                Seguir3 = false;
            }

        } while (Seguir3 == false);
        return Numero_Int;
    }

} // Fin Clase

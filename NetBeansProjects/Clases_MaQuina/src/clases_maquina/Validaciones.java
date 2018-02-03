// --------------------- Clase Validaciones v1.0 Open Source ---------------------------------------
// Creado Por MaQuina reconoce el trabajo del autor ;)

package clases_maquina;

public class Validaciones {

    public Validaciones() {

    }

    // Pasamos la string que queremos validar
    static boolean Nombre(String Nombre) {
        
        // Comprueba si la String pasada como parametro tiene:
        //      1º Mayus y resto minus retorna true o false segun la situacion
        if (Nombre.matches("[A-Z]{1}[A-Za-z]*") == true) {
            return true;
        } else {
            return false;
        }

    }

    // Pasamos en un array las distintas opciones que tiene que adoptar la String pasada como parametro posteriormente
    static boolean Entre_Strings(String[] Array_Strings, String Cadena) {

        //Inicializamos a false el validador 
        boolean Validador = false;
        
        // Hacemos un for each para sacar cada cadena del array
        for (String Objeto_Sacado : Array_Strings) {
            
            // Verificamos si el objeto sacado(String) es igual a algun valor del Array
            if (Cadena.equalsIgnoreCase(Objeto_Sacado)) {
                // En tal caso Validador se pone a true y nos vamos del for
                Validador = true;
                break;
            }
        }
        // returnamos Validador, en caso de que haya encontrado una similitud Validador sera true
        //      en caso de no encontrar una similitud Validador sera false
        return Validador;
    }

    static boolean Telefono(String Telefono) {

        if (Telefono.matches("[0-9]{9}")) {
            return true;
        } else {
            return false;
        }

    }

}

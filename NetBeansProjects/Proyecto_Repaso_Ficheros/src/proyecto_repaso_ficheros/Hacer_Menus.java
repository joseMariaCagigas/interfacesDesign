// --------------------- Clase Hacer_Menus Open Source ---------------------------------------
// Creado Por MaQuina reconoce el trabajo del autor ;)

package proyecto_repaso_ficheros;

// Comienzo De La Clase
public class Hacer_Menus {

    // Metodo Constructor
    public Hacer_Menus() {

    }

    // Metodo Para Crear El Menu
    
    //Parametros:
    //      String[] Array_Opciones: Es un array predefinido de strings para llamar al metodo
    //      es necesario crear un array definiendo cada opcion como una String
    
    //      Ejemplo:
    //        Hacer_Menus menu = new Hacer_Menus();
    //        String Array_Opciones[] = {"Opcion1 Pasada Como Parametro","Opcion2 Pasada Como Parametro"};
    //        menu.Menu_Opciones(Array_Opciones);
    
    static void Menu_Opciones(String[] Array_Opciones) {
        
        // A traves de un for recorremos las posiciones 0 a (Longitud Maxima Del Array -1)
        // Para mostrar el contenido indentado(Con sangria) y Con una numeracion de preguntas
        
        System.out.println("---------------------------------------------");
        for (int i = 0; i < Array_Opciones.length; i++) {
            int a = i + 1;
            System.out.println("|"+ "\t"+a + ") " + Array_Opciones[i]);
        }
        System.out.println("---------------------------------------------");

    }

}

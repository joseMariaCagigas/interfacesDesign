package Presentacion;

import Datos.Array;
import Entidades.Personal;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Personal persona = new Personal();
        Array array = new Array();
        
        boolean Seguir = false;

        String Array_Opciones[] = {
            "Registrar empleado fijo",
            "Registrar empleado eventual",
            "Mostrar salario de los empleados",
            "Salir"
        };

        Hacer_Menus.Menu_Opciones(Array_Opciones);
        
        do {
        int Opcion = PedirDatos_Statica.Numero_Int("Elige Una Opcion: ");
        
            switch (Opcion) {
                case 1:
                    array.Annadir_Empleado_Fijo(persona.Crear_Empleado());
                    break;

                case 2:
                    array.Annadir_Empleado_Fijo(persona.Crear_Empleado());
                    break;

                case 3:
                    array.Consultar_Array();
                    break;

                case 4:
                    Seguir = true;
                    break;
            }
        } while (Seguir != true);
        System.exit(0);
    }

}

package proyecto_repaso_ficheros;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        int Opcion;
        boolean Seguir = false;

        String Array_Opciones[] = {
            "Alta de empleado",
            "Listar empleados",
            "Buscar empleado Por Departamento",
            "Borrar empleado",
            "Borrar fichero",
            "Salir de la aplicación"
        };
        
        do{
            Hacer_Menus.Menu_Opciones(Array_Opciones);
            Opcion = PedirDatos_Statica.Numero_Int("Introduce La Opcion Deseada: ");
            
        switch (Opcion) {
            case 1:
                Procesos.Alta_Empleados();
                break;
            case 2:
                Procesos.Listar_Empleados();
                break;
            case 3:
                Procesos.Buscar_Empleados();
                break;
            case 4:
                Procesos.Borrar_Empleado();
                break;
            case 5:
                Procesos.Borrar_Fichero();
                break;
            case 6:
                Seguir = true;
                Procesos.Salir();
                break;
        }
        } while (Seguir == false);

    }

}

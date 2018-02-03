package Proyecto_Alumnos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        String Nombre_Fichero = "Matadero.txt";
        File archivo = new File(Nombre_Fichero);


        if (archivo.exists()){
            ArrayList<Alumno> Array_Alumno= Metodos.Leer_Fichero_Existe(Nombre_Fichero);
            Principal(Array_Alumno,true,Nombre_Fichero);
        }   else {
            ArrayList<Alumno> Array_Alumno = Metodos.Leer_Fichero_No_Existe(Nombre_Fichero);
            Principal(Array_Alumno,true,Nombre_Fichero);
        }
        
    }
    
    static void Principal (ArrayList<Alumno> Array_Alumno,boolean Seguir, String Nombre_Fichero) throws IOException{
        
        Metodos metodos = new Metodos();
        while (Seguir = true){
        
        String Array_Opciones[] = {
            "Añadir alumno",
            "Visualizar todos los alumnos",
            "Consultar tasas (a partir del código de alumno",
            "Borrar alumno (a partir del código de alumno)",
            "Mostrar Ingresos",
            "Salir"
        };

        Hacer_Menus.Menu_Opciones(Array_Opciones);
        
        int Opcion = PedirDatos_Statica.Numero_Int("Introduce La Opcion Deseada: ");

        switch (Opcion) {
            case 1:
                Array_Alumno.add(metodos.Anadir_Alumno());
                break;
            case 2:
                metodos.Listar_Alumnos(Array_Alumno);
                break;
            case 3:
                metodos.Consultar_Tasa(Array_Alumno);
                break;
            case 4:
                metodos.Borrar_Alumno(Array_Alumno);
                break;
            case 5:
                metodos.Mostrar_Ingresos(Array_Alumno);
                break;
            case 6:
                Metodos.Guardar_Fichero(Nombre_Fichero,Array_Alumno);
                metodos.Salir();
                break;
            default:
                System.out.println("Opcion Incorrecta ¬¬");
                break;
        }
        
        }
        
        
    }
}





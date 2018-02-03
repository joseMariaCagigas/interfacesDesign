package Datos;

import java.util.ArrayList;
import Entidades.Personal;
import java.io.IOException;

public class Array {
    
    ArrayList<Personal> Array_Empleado = new ArrayList();
    
    public void Consultar_Array(){
        for (Personal Objeto_Sacado3 : Array_Empleado) {
                System.out.println(Objeto_Sacado3.toString());
        }
    }
    
    public String Annadir_Empleado_Fijo(Personal empleado2) throws IOException {
            Personal empleado3 = empleado2.Crear_Empleado();
            Array_Empleado.add(empleado3);
            System.out.println("Empleado agregado");
            
            return empleado2.toString();
        
    }
}

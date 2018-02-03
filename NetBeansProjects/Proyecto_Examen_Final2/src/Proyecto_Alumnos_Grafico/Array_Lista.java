package Proyecto_Alumnos_Grafico;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Array_Lista {

    // Lo de protected lo puse porque me mola xD
    // Como public pero no esta accesible a todas las clases sino qe tienes que estar en su mismo paquete
    protected ArrayList<Alumno> Array_Alumno;
    
    public Array_Lista() {
        
    }
    // Constructor
    public Array_Lista(ArrayList<Alumno> Array_Alumno) {
        this.Array_Alumno = Array_Alumno;
    }

    // Get y Set del array
    public ArrayList<Alumno> getArray_Alumno() {
        return Array_Alumno;
    }

    public void setArray_Alumno(ArrayList<Alumno> Array_Alumno) {
        this.Array_Alumno = Array_Alumno;
    }
    
    // pasamos como parametro un objeto alumno
    public void anadir_Alumno(Alumno alumno){
        // Geteamos el array de la clase array lista
        Array_Alumno = getArray_Alumno();
        // yle añadimos el alumno
        Array_Alumno.add(alumno);
    }
    
    
    
    
    
    
    
    
    public void Guardar_Copia(String Nombre_Fichero) throws FileNotFoundException, IOException{
    // Copia Seguridad
        File Copia_Seguridad = new File(Nombre_Fichero);

        // obtenemos el array con el get de la clase array_lista y lo guardamos en nuestro array
        // por asi decirlo hacemos una "copia"
        ArrayList<Alumno> Array_Guardar = getArray_Alumno();
        
        // Abrimos flujos
        FileOutputStream fos = new FileOutputStream(Copia_Seguridad);
        ObjectOutputStream oss = new ObjectOutputStream(fos);

        // guardamos el array en el fichero
        oss.writeObject(Array_Guardar);

        // Cerramos flujos
        fos.close();
        oss.close();
    }
    
public double Mostrar_Ingresos(ArrayList<Alumno> Array_Alumno) {
    
            // Seteamos Tasas a 0
            double Tasas = 0;
            
            // Sumamos la tasa de todos los alumnos
            for (Alumno Objeto_Sacado : Array_Alumno) {
                Tasas = Tasas + Objeto_Sacado.calcularTasas();
            }
            // Retornamos tasas
            return Tasas;
    }
    
    static ArrayList<Alumno> Leer_Fichero_Existe(String Nombre_Archivo) throws FileNotFoundException, IOException, ClassNotFoundException {

        // Creamos el archivo
        File archivo = new File(Nombre_Archivo);

        // Abrimos flujos
        FileInputStream fis = new FileInputStream(archivo);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        // leemos el fichero y lo casteamos el objeto a arraylist para guardarlo en nuestro array
        ArrayList<Alumno> Array_Alumno = (ArrayList<Alumno>) ois.readObject();

        // cerramos flujos
        fis.close();
        ois.close();

        // retornamos array
        return Array_Alumno;
    }


}

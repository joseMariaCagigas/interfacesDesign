package ejercicio2_ficheros;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        escribir("Fichero.txt");
        
        if (tieneRegistros("Fichero.txt") == true){
            System.out.println("Tiene Algo Escrito");
        }
        
        leer("Fichero.txt");
        
    }
    
        public static void leer(String fichero) throws ClassNotFoundException{
            
        FileInputStream fs ;
        ObjectInputStream os;
        
        boolean eof_fich=false;
        int cont=1;

        try{
            fs=new FileInputStream(fichero);
            os=new ObjectInputStream(fs);

            while(eof_fich!=true){
                Empleados Objeto_Empleado;
                Objeto_Empleado=(Empleados)os.readObject();
                System.out.println(cont+"--> "+Objeto_Empleado.Nombre+" "+Objeto_Empleado.Sueldo+" "+Objeto_Empleado.Antiguedad);
                cont++;
            }
        }catch(EOFException eeof){
            eof_fich=true;
        }catch(IOException ex){
            System.out.println("Error leer");
        }
    }
    
    public static void escribir (String fichero){
        
        // Objeto Para Leer
        PedirDatos Leer = new PedirDatos();
        
        FileOutputStream fs;
        ObjectOutputStream os;

        try{
            fs = new FileOutputStream(fichero,true);

                String Nombre = Leer.Leer_String("Introduce El Nombre: ");
                int Sueldo = Leer.Numero_Int("Introduce El Sueldo: ");
                int Antiguedad = Leer.Numero_Int("Introduce La Antiguedad: ");
                
                // Crear Objeto Empleado
                Empleados Objeto_Empleado = new Empleados(Nombre, Sueldo, Antiguedad);

                //comprobar si tiene elementos ya el fichero
                if (tieneRegistros(fichero))
                    // Uso esta redefinición de la clase para
                    // evitar que escriba datos de la cabecera que corromperían
                    // la posterior lectura del fichero
                    os = new MiObjectOutputStream(fs);
                else
                    os = new ObjectOutputStream(fs);

                os.writeObject(Objeto_Empleado);
                
                
                os.close();
                fs.close();

        }catch(IOException ex){
            System.out.println("\nError escritura");
        }
    }
    
    private static boolean tieneRegistros(String fichero){
        
        Empleados Objeto_Empleado;
        
        boolean tiene = false ;
        FileInputStream fiAmigLec ;
        ObjectInputStream fluent;
        
        try {
            fiAmigLec = new FileInputStream(fichero);
            fluent = new ObjectInputStream(fiAmigLec);

            // Leer el objeto del fichero
            Objeto_Empleado = (Empleados) fluent.readObject();

            if (Objeto_Empleado != null)
                tiene = true ;
            fiAmigLec.close();
            fluent.close();
        } catch (FileNotFoundException e) {
            System.out.println( "Error: " + e.getMessage() ) ;
        } catch (Exception ex) {
            
        }

        return(tiene) ;
    }

}

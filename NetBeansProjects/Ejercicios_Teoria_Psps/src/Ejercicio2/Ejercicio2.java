/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime(); //objeto runtime asociado a la app
        Process p=null; //Proceso
        String comando = "CMD /C DIR C:\\";
        InputStream is; //InputStream para recoger como entrada la salida del proceso ejecutado
        InputStreamReader isr; //Reader para el InputStream
        BufferedReader bfr; //para el bufferReader --> printar la salida obtenida         
        try {
            p= rt.exec(comando);
        } catch (Exception ex){
            System.out.println ("Error al ejecutar el comnado: " + comando);
            System.exit(-1);
        }
        is = p.getInputStream(); // Lee el stream de salida del proceso
        //para poder usar el método readLine() necesito un objeto BufferedReder
        isr = new InputStreamReader (is);
        bfr = new BufferedReader (isr);        
        try{
            String line = bfr.readLine(); //leo la primera linea
            while (line != null){ //leo hasta el final de la salida del bufferReader
                System.out.println(line);
                line = bfr.readLine();
            }                
       }catch(IOException ex){
            System.out.println("Error de lectura");
            ex.printStackTrace();
        }
        bfr.close();
        /*waitFor() --> Hace esperar al proceso actual hasta que el subproceso 
        representado por el objeto p termine. Devuelve 0 si termina bien y el 
        valor 1 si termina mal
        */
        //comprobación de error  (0 bien y -1 mal)
        int exitValue;
        try {
            exitValue = p.waitFor();
            System.out.println ("Salida (0=bien y -1=mal): " + exitValue);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
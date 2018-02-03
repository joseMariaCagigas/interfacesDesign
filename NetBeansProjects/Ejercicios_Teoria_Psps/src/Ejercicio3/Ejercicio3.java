package Ejercicio3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

public class Ejercicio3 {
    

    
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
        is = p.getInputStream(); 
        
        isr = new InputStreamReader (is);
        bfr = new BufferedReader (isr);        
        try{
            String line = bfr.readLine(); 
            while (line != null){
                Meter_String(line, "Fichero.txt", true);
                line = bfr.readLine();
            }                
       }catch(IOException ex){
            System.out.println("Error de lectura");
            ex.printStackTrace();
        }
        bfr.close();
        int exitValue;
        try {
            exitValue = p.waitFor();
            System.out.println ("Salida (0=bien y -1=mal): " + exitValue);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        
    }
    
    static String Meter_String(String Cadena_Pedida, String NombreFichero, boolean Sobreescribir) throws IOException {

        try {
            // Creamos El Objeto Para Escribir En Ficheros
            FileWriter Escribir_Fichero = new FileWriter(NombreFichero, Sobreescribir);
            BufferedWriter bw = new BufferedWriter(Escribir_Fichero);

            // Metemos en el fichero lo que escribio el usuario acompañado de un salto de linea
            bw.write(Cadena_Pedida);
            bw.newLine();
           
            // Cerramos el flujo
            Escribir_Fichero.close();

            //Returnamos una string describiendo el exito del proceso
            return "String Guardada En El Fichero: " + NombreFichero + " Con Exito";

            // Capturamos excepciones
        } catch (IOException error) {
            return "Hubo Un Error Fatal De Escritura >.<";
        }

    }
}
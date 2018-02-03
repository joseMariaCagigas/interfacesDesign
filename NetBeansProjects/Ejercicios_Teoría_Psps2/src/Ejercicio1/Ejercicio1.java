package Ejercicio1;

import java.io.*;

public class Ejercicio1 {
    

    
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime(); 
        Process p = null;
        File fichero= new File("svchost.txt");
        FileWriter escribir = new FileWriter(fichero);
        BufferedWriter bw = new BufferedWriter(escribir); 
        String comando2= "CMD /C tasklist /svc /fi "+ '"' +"imagename eq svchost.exe"+'"';
        InputStreamReader isr; 
        BufferedReader bfr;
        InputStream is; 
        try {
            p= rt.exec(comando2);
         } catch (Exception ex){
            System.out.println ("Error al ejecutar el comando: " + comando2);
            System.exit(-1);
        }
        is = p.getInputStream(); 
        isr = new InputStreamReader (is);
        bfr = new BufferedReader (isr);
        try{
            String line = bfr.readLine();
            while (line != null){
                bw.write(line);
                bw.newLine();
                line = bfr.readLine();
            }                
       }catch(IOException ex){
            System.out.println("Error de lectura");
            ex.printStackTrace();
        }
        try {
            InputStream iserror = p.getErrorStream();
            InputStreamReader isrerror = new InputStreamReader (iserror);
            BufferedReader bfrerror = new BufferedReader (isrerror);
            //leo linea a linea para mostrarlos
            String lineerror = bfrerror.readLine();
            while (lineerror != null){
                System.out.println ("Error = " + lineerror);
                lineerror = bfrerror.readLine();
            }}catch (IOException ioex){
            ioex.printStackTrace();
        }
        int exitValue;
        try {
            exitValue = p.waitFor();
            System.out.println ("Salida (0=bien y 1=mal): " + exitValue);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        bfr.close();
        bw.close();
        escribir.close();
    }
    }
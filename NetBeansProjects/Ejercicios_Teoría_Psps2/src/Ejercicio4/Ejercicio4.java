package Ejercicio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Ejercicio4 {

    ProcessBuilder proceso;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ProcessBuilder pb = new ProcessBuilder ("CMD");
        
        File fbat = new File ("instrucciones.bat");
        File fout = new File ("salida.txt");
        File ferror = new File ("error.txt");
        
        pb.redirectInput(fbat);
        pb.redirectOutput(fout);
        pb.redirectError(ferror);
        try {
            pb.start();
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
}

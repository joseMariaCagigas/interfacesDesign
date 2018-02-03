/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.RandomAccess;

/**
 *
 * @author MaQuiNa1995
 */
public class SumaNumeros {

    public static void main(String[] args) throws IOException {

        try {
            

        
        File log = new File("log.txt");
        
        //FileWriter guardar, guardar2;
        //FileReader leer, leer2;
        int numerosLeidos = 0, resultado;
        
        if (args.length != 3) {
            System.out.println("No Se Han Introducido 3 Argumentos");
        } else {
            
        RandomAccessFile raf = new RandomAccessFile(args[1],"rw");
            //guardar = new FileWriter(args[1], true);
            //leer = new FileReader(args[1]);
        RandomAccessFile raf2 = new RandomAccessFile(args[2],"rw");
            //guardar2 = new FileWriter(args[2], true);
            //leer2 = new FileReader(args[2]);

            Random numAleatorio = new Random();

            for (int i = 0; i < Integer.parseInt(args[0]); i++) {
                raf.seek(i*4);
                int aleatorio = numAleatorio.nextInt(100);
                
                raf.write(aleatorio);
                
                int numerosLeer = raf.read();
                System.out.println(numerosLeer);
                numerosLeidos = numerosLeer + numerosLeidos;

                raf2.write(numerosLeidos);
                resultado = (int) (raf2.read());
            }
            
            

            raf.close();
            raf2.close();
            

        }
        
        } catch (Exception e) {
                e.printStackTrace();
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Semaphore semaforo = new Semaphore(10,true);
        
        Hilo1 hilo = new Hilo1();
        
        
        
        semaforo.acquire();
    }
    
}

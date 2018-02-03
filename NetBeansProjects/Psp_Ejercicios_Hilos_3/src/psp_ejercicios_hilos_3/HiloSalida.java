/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_ejercicios_hilos_3;

/**
 *
 * @author MaQuiNa1995
 */
public class HiloSalida extends Thread{
    private Garage garage;
    
    HiloSalida (String nombre, Garage m){
        this.setName(nombre);
        this.garage=m;
    }
    @Override
    public void run(){
        //tengo que usar segmento sincronizado
        synchronized (garage){
            garage.DecrementaCuenta();
        }
        
    }
}
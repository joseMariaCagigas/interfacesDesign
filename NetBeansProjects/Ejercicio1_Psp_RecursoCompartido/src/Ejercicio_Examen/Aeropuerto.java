package Ejercicio_Examen;

import ejercicio1_psp_recursocompartido.*;

public class Aeropuerto {

    private String mensaje="";
    boolean lleno = false;

    public Aeropuerto() {

    }

    public synchronized void Aterrizar() {
            while (lleno) {
                try {
                    wait();
                } catch (InterruptedException ex) {}
                
                System.out.println(Thread.currentThread().getName() + " Intento Aterrizar Pero Esta Ocupado");
            }
            if (lleno == false) {
                System.out.println(Thread.currentThread().getName()+" Aterrizo");
                lleno = true;
                notify();
            }
            System.out.println(lleno);
    }

    public synchronized void Despegar() {
            while (!lleno) {
                try {
                    wait();
                } catch (InterruptedException ex) {}
                
                System.out.println("No hay Ningun Avion En El Aeropuerto");
            }
            lleno = false;
            notify();
        }
}

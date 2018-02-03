package Ejercicio_Examen;

public class EntraAvion extends Thread implements Runnable {

    Aeropuerto bc;
    String nombre;

    public EntraAvion() {

    }

    EntraAvion(Aeropuerto bc) {
        this.bc = bc;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            bc.Aterrizar();
            System.out.println(Thread.currentThread().getName() + " Esta Aterrizando");
            try {
                sleep(1000);
            } catch (InterruptedException ex) {

            }
        }

    }

}

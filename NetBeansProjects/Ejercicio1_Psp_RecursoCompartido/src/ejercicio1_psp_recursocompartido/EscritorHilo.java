package ejercicio1_psp_recursocompartido;

public class EscritorHilo extends Thread implements Runnable {

    BuzonCorreo bc;
    String nombre;

    public EscritorHilo() {

    }

    EscritorHilo(String nombre, BuzonCorreo bc) {
        this.bc = bc;
        this.nombre = nombre;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            bc.almacena(nombre);
            System.out.println(Thread.currentThread().getName() + " Esta Escribiendo..." + nombre);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {

            }
        }

    }

}

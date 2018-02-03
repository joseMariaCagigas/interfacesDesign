package ejercicio1_psp_recursocompartido;

public class BuzonCorreo {

    private String mensaje="";
    boolean lleno = false;

    public BuzonCorreo() {

    }

    public synchronized void almacena(String men) {
            while (lleno) {
                try {wait();} catch (InterruptedException ex) {}
                System.out.println(Thread.currentThread().getName() + " No Puede Escribir Porque Esta Lleno");
            }
            if (lleno == false) {
                System.out.println(Thread.currentThread().getName()+" Ya ha escrito");
                lleno = true;
                notify();
                
            
            }
    }

    public synchronized String lee() {
            while (!lleno) {
                try {wait();} catch (InterruptedException ex) {}
                System.out.println(Thread.currentThread().getName() + " No Puede Leer Porque Esta Vacio");
            }
            lleno = true;
            notify();
            return mensaje;
        }
}

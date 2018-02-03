package ejercicio1_psp_recursocompartido;

public class Main {

    public static void main(String[] args) {
        BuzonCorreo buzon = new BuzonCorreo();
        
        EscritorHilo escribir;
        LectorHilo leer;
        
        for (int i = 0; i < 5; i++) {
            escribir = new EscritorHilo("mensaje",buzon);
            escribir.start();
            leer = new LectorHilo(buzon);
            leer.start();
        }
    }
    
}

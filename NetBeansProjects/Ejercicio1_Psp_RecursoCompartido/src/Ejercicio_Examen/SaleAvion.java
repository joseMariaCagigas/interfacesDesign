package Ejercicio_Examen;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SaleAvion extends Thread {

    Aeropuerto bc;

    public SaleAvion(Aeropuerto bc) {
        this.bc = bc;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            bc.Despegar();
            System.out.println(this.getName() + " Ha Despegado");
            try {
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SaleAvion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}

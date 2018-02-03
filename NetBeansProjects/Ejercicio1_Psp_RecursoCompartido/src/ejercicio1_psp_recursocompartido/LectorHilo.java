/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_psp_recursocompartido;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LectorHilo extends Thread {

    BuzonCorreo bc;

    public LectorHilo(BuzonCorreo bc) {
        this.bc = bc;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName() + " Ha Leido: " + bc.lee());
            try {
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LectorHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}

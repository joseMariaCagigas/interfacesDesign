/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojchristianmuñozason;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.Timer;


public class Reloj extends JLabel implements Serializable {

    Alarma despertador = new Alarma();
    
    Calendar cal;
    boolean Formato24H;
    
    String  MinutoSaltaAlarma,HoraSaltaAlarma, HoraMinutoCompleta;
    int calendarioHora012, calendarioMinuto, calendarioSegundo, calendarioHora24;
    AlarmaListener alarmaListener;

    public Reloj() {
        
        this.setSize(300, 100);
        
        Timer temporizador = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                cal = Calendar.getInstance();

                calendarioHora012 = cal.get(Calendar.HOUR);
                calendarioHora24 = cal.get(Calendar.HOUR_OF_DAY);

                calendarioMinuto = cal.get(Calendar.MINUTE);
                calendarioSegundo = cal.get(Calendar.SECOND);

                if (Formato24H == true) {
                    HoraMinutoCompleta = "["+calendarioHora012 + " : " + calendarioMinuto + " : " + calendarioSegundo+"]";
                } else {
                    HoraMinutoCompleta = "["+calendarioHora24 + " : " + calendarioMinuto + " : " + calendarioSegundo+"]";
                }
                setText(HoraMinutoCompleta);

                HoraSaltaAlarma = String.valueOf(cal.get(Calendar.HOUR_OF_DAY));
                MinutoSaltaAlarma = String.valueOf(cal.get(Calendar.MINUTE));
                
                if (HoraSaltaAlarma.equals(despertador.getHora()) && MinutoSaltaAlarma.equals(despertador.getMinuto())) {
                    alarmaListener.Alarma();
                }
            }
        });

        temporizador.start();

    }

    public boolean isHorario() {
        return Formato24H;
    }

    public void setHorario(boolean Formato24H) {
        this.Formato24H = Formato24H;
    }

    public Alarma getDespertador() {
        return despertador;
    }

    public void setDespertador(Alarma despertador) {
        this.despertador = despertador;
    }

    public void addAlarmaListener(AlarmaListener alarmaListener) {
        this.alarmaListener = alarmaListener;
    }

    public void removeArrastreListener() {
        this.alarmaListener = null;
    }

}

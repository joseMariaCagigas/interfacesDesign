package reloj_javabean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Reloj_Javabean extends JLabel implements Serializable {

    boolean formato24H;
    int hora, minuto, segundo;
    String mensajeAlarma;

    public Reloj_Javabean() {
        String Horareloj = "00:00:00";
        setText(Horareloj);
        setSize(200, 50);
        declaracionCalendario();
    }

    public void declaracionCalendario() {
        GregorianCalendar calen = new GregorianCalendar();
        Timer temporizador = new Timer(1000, (java.awt.event.ActionEvent ae) -> {
            Date now = new Date();
            calen.setTime(now); 
            hora = calen.get(Calendar.HOUR_OF_DAY);
            minuto = calen.get(Calendar.MINUTE);
            segundo = calen.get(Calendar.SECOND);
            
            if (formato24H && hora >= 12) {
                hora -= 12;
            }
            
            String relojillo = String.format("%02d : %02d : %02d", hora, minuto, segundo);

            setText(relojillo);
        });
        temporizador.start();
    }


    public boolean isFormato24H() {
        return formato24H;
    }

    public void setFormato24H(boolean formato24H) {
        this.formato24H = formato24H;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }





    public String getMensajeAlarma() {
        return mensajeAlarma;
    }

    public void setMensajeAlarma(String mensajeAlarma) {
        this.mensajeAlarma = mensajeAlarma;
    }
    
    
}

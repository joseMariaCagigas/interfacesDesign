package relojchristianmuñozason;

import java.io.Serializable;

public class Alarma implements Serializable{
     String hora,minuto;
    
public Alarma(){
}
    public Alarma(String hora, String minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

}

package clases_maquina;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidades {
    
    String stringFormatoDate,dateFormato;
    Date date;

    public Utilidades() {
        
    }
    
    public String conseguirFechaHoraAnnoConDate() {
        date = new Date();
        stringFormatoDate = "hh:mm:ss a";
        DateFormat dateFormat = new SimpleDateFormat(stringFormatoDate);
        dateFormato = dateFormat.format(date);
        return dateFormato;
    }
    
}

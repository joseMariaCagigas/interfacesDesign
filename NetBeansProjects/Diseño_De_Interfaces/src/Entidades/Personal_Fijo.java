package Entidades;

import java.util.GregorianCalendar;

public class Personal_Fijo extends Personal{

    Double Sueldo_Fijo=1000.0,Porcentaje;
    int Annos_Trabajados;
    
    public Personal_Fijo() {
        
    }

    public Personal_Fijo(String Nombre,String Apellidos, String Dni,  GregorianCalendar FechaIngreso, Double Sueldo_Fijo,int Annos_Trabajados) {
                        //Nombre,Apellidos,Dni,Dia_Ingreso, Sueldo_Fijo,Annos_Trabajados);
        super(Nombre, Dni, Apellidos);
        this.Sueldo_Fijo = Sueldo_Fijo;
    }
    
    public double Calcular_Sueldo_Fijo(){
        
        int annos  = this.getAnnos_Trabajados();
        
        if (annos> -1 & annos <= 3){
            Porcentaje= 1.05;
        }else if (annos> 4 & annos <= 7){
            Porcentaje= 1.1;
        }else if (annos > 4 & annos < 7){
            Porcentaje= 1.15;
        }else if (annos < 15){
            Porcentaje = 1.2;
        }
        
        double Sueldo_Fijo = 1000.0 * Porcentaje;
        
        return Sueldo_Fijo; 
    }

    public int getAnnos_Trabajados() {
        return Annos_Trabajados;
    }

    public void setAnnos_Trabajados(int Annos_Trabajados) {
        this.Annos_Trabajados = Annos_Trabajados;
    }

    public Double getSueldo_Fijo() {
        return Sueldo_Fijo;
    }

    public void setSueldo_Fijo(Double Sueldo_Fijo) {
        this.Sueldo_Fijo = Sueldo_Fijo;
    }

    @Override
    public String toString() {
        return super.toString()+"Sueldo_Fijo=" + Sueldo_Fijo + ", Años_Trabajados=" + Annos_Trabajados;
    }



    
    
}

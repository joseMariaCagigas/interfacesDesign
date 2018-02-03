package Ejercicio_Examen;

public class Main {

    public static void main(String[] args) {
        Aeropuerto buzon = new Aeropuerto();
        
        EntraAvion escribir;
        SaleAvion leer;
        
        for (int i = 0; i < 5; i++) {

            leer = new SaleAvion(buzon);
            leer.start();
            
            escribir = new EntraAvion(buzon);
            escribir.start();
            
        }
    }
    
}

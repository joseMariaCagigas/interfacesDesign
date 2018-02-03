package psp_ejercicios_hilos_3;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(); //creo objeto museo
        
        //hago entrar a 10 hilos
        for (int i =1; i<=50; i++){
            HiloEntrada dentro;
            dentro = new HiloEntrada(" " +i, garage);
            dentro.start();
        }
        //hago salir a 5 hilos
        for (int i=1; i<=70; i++){
            HiloSalida fuera;
            fuera = new HiloSalida (" " +i, garage);
            fuera.start();
        }
    }
    
}

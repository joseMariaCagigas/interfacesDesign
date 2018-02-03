package psp_ejercicios_hilos_3;

public class Garage {
    //clase que simula el museo con las entradas y salidas
    private int cuenta; //para contar las entradas y salidas del museo
    public Garage (){
        cuenta = 100;
    }
    public void IncrementaCuenta (){
        System.out.println ("Hilo " +Thread.currentThread().getName() +
                " ENTRA en el museo");
        //incremento la cuenta 
        cuenta ++;
        System.out.println ("Personas en el museo = " + cuenta);
        
    }
    
    public void DecrementaCuenta (){
        System.out.println ("Hilo " + Thread.currentThread().getName() +
                " SALE del mueso");
        cuenta --;
        System.out.println ("Personas en el museo = " + cuenta);
    }
}
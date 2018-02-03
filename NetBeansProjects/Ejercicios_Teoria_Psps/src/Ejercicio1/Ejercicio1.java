package Ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
                Runtime rt = Runtime.getRuntime(); //Objeto runtime asociado a la aplicacion
        String comando = "notepad"; // comando 
        Process p; //Para el objeto proceso
        
        try {
            p = rt.exec(comando); 
        }catch (Exception e){
            System.out.println ("Error al ejecutar el comnado: " + comando);
            e.printStackTrace(); //para que me printe error estandar
    }
    
}
}

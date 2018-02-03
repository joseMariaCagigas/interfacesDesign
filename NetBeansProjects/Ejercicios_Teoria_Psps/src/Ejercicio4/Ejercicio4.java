package Ejercicio4;


public class Ejercicio4 {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime(); 
        String comando = "CMD /C java C:\\Users\\MaQuiNa1995\\Documents\\NetBeansProjects\\Ejercicios_Teoria_Psps\\src\\Ejercicio1.java ";
        Process p; 
        
        try {
            p = rt.exec(comando); 
        }catch (Exception e){
            System.out.println ("Error al ejecutar el comnado: " + comando);
            e.printStackTrace(); 
    }
    
}
}

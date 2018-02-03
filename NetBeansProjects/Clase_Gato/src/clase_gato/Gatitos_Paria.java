package clase_gato;

// Clase nueva extends de la clase que quieras heredar sus atributos
public class Gatitos_Paria extends Gatos{
    
    // Final Para Constantes
    final private boolean Paria = true;
    
    
    Gatitos_Paria() {
        
    }
    
    Gatitos_Paria(String nombre, int Energia, boolean Vivo, boolean Paria ) {
        super(nombre , Energia , Vivo);
        this.Energia = 0;
    }
    
    @Override
    public String toString() {
        return "El Gatito Se Llama " + nombre + " y Tiene " + Energia + " KW De Energía Y "+ "Paria Es: "+Paria;
    }

}

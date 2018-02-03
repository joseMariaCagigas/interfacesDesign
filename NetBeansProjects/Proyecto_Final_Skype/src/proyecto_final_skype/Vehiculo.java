package proyecto_final_skype;

public abstract class Vehiculo {
    private Conductor conductor;
    private String Matricula;

    public Vehiculo(Conductor conductor, String Matricula) {
        this.conductor = conductor;
        this.Matricula = Matricula;
    }
    
    void verFicha(){
        
    }
    
    
}

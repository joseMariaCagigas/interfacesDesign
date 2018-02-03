package Entidades;

public class Personal_Eventual extends Personal{

    int Sueldo_Eventual,Clientes_Captados;
    
    public Personal_Eventual() {
        
    }

    public Personal_Eventual(String Nombre, String Dni, String Apellidos,int Clientes_Captados) {
        super(Nombre, Dni, Apellidos);
        this.Clientes_Captados=Clientes_Captados;
    }
    
    public int Calcular_Sueldo_Eventual(int Clientes_Captados){
        Sueldo_Eventual = Clientes_Captados * 130;
        return Sueldo_Eventual;    
    }

    public int getSueldo_Eventual() {
        return Sueldo_Eventual;
    }

    public void setSueldo_Eventual(int Sueldo_Eventual) {
        this.Sueldo_Eventual = Sueldo_Eventual;
    }

    @Override
    public String toString() {
        return super.toString() +"Sueldo_Eventual=" + Sueldo_Eventual;
    }

}

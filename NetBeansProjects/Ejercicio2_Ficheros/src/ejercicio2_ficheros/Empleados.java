package ejercicio2_ficheros;

public class Empleados implements java.io.Serializable{
    
    String Nombre;
    int Sueldo;
    int Antiguedad;
    
    Empleados(){
        
    }
    
    Empleados(String Nombre,int Sueldo, int Antiguedad){
        
    }
    
    // -------------- Metodos Get Setter ------------------------

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }
    
    // ------------ Metodos Maquina -----------------

    @Override
    public String toString() {
        return "Empleados{" + "Nombre=" + Nombre + ", Sueldo=" + Sueldo + ", Antiguedad=" + Antiguedad + '}';
    }
    
    
    
}

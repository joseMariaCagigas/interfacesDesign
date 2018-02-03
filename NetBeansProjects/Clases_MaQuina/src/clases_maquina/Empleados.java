package clases_maquina;

import java.io.Serializable;

public class Empleados implements Serializable {

    int Codigo;
    String Nombre,Departamento;
    
    public Empleados() {
        
    }

    public Empleados(int Codigo, String Nombre, String Departamento) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Departamento = Departamento;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    @Override
    public String toString() {
        return "Empleados{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + ", Departamento=" + Departamento + '}';
    }
    
    
    
}

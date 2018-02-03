package Ejercicio4;

import Ejercicio3.*;

public class Usuario{
    
    String pais , nombre;

    public Usuario() {
    }
    
    public Usuario(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario: Pais=" + pais + ", Nombre=" + nombre;
    }
    
    
}


import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Alumno {
    
    String NIF,Nombre,Telefono,Curso;
    
    Alumno (){
        
    }

    public Alumno(String NIF, String Nombre, String Telefono, String Curso) {
        this.NIF = NIF;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Curso = Curso;
    }

    public String getNIF() {
        return NIF;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCurso() {
        return Curso;
    }

    @Override
    public String toString() {
        return "Alumno: " + "NIF: " + NIF + ", Nombre: " + Nombre + ", Telefono: " + Telefono + ", Curso: " + Curso + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.NIF);
        return hash;
    }

//    @Override
//    public boolean equals(Object obj) {
//        return NIF.equalsIgnoreCase((Alumno)obj).NIF);
//    }
//    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.NIF, other.NIF)) {
            return false;
        }
        return true;
    }
    
    
}

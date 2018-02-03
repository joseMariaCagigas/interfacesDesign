/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatosud5;

public class Departamento {

    private int p_departamento;
    private String nombre;
    private String loc;

    public Departamento() {
    }

    public Departamento(int p_departamento, String nombre, String loc) {
        this.p_departamento = p_departamento;
        this.nombre = nombre;
        this.loc = loc;
    }

    public int getP_departamento() {
        return p_departamento;
    }

    public void setP_departamento(int p_departamento) {
        this.p_departamento = p_departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}

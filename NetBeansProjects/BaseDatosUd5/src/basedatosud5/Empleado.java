package basedatosud5;

import java.util.Date;

public class Empleado {

    int p_empleado;
    Departamento a_departamento;
    String apellidos, oficio;
    Date fecha_alta;
    float salario;
    float comision;

    public Empleado() {
    }

    public Empleado(int p_empleado, Departamento a_departamento, String apellidos,
            String oficio, Date fecha_alta, float salario, float comision) {
        this.p_empleado = p_empleado;
        this.a_departamento = a_departamento;
        this.apellidos = apellidos;
        this.oficio = oficio;
        this.fecha_alta = fecha_alta;
        this.salario = salario;
        this.comision = comision;
    }

    public int getP_empleado() {
        return p_empleado;
    }

    public void setP_empleado(int p_empleado) {
        this.p_empleado = p_empleado;
    }

    public Departamento getA_departamento() {
        return a_departamento;
    }

    public void setA_departamento(Departamento a_departamento) {
        this.a_departamento = a_departamento;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

public class Operaciones extends Vista {

    Vista calculadora = new Vista();

    double numero1, numero2, numero_resultado;

    public Operaciones(double numero1, double numero2, double numero_resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero_resultado = numero_resultado;
    }

    public String sumar(double operando1,double operando2) {
        resultado = operando1 + operando2;
        return String.valueOf(resultado);
    }

    public String restar(double operando1,double operando2) {
        resultado = operando1 - operando2;
        return String.valueOf(resultado);
    }
    
    public String multiplicar(double operando1,double operando2) {
        resultado = operando1 * operando2;
        return String.valueOf(resultado);
    }
    
    public String dividir(double operando1,double operando2) {

        if ((operando1 == 0) || (operando2 == 0)) {
            return "Como Quieres Dividir Con Un 0 De Operando ¬¬";
        } else {

            resultado = operando1 / operando2;
            return String.valueOf(resultado);
        }
        
        
        
    }
}

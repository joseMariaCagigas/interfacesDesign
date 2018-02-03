package ejercicio1_junit;

public class Ejercicio1_Junit {

    float salarioBase, primas, ventasMes, horasExtra;
    String tipo;
    boolean tipoEmpleado = false, repetirVentas = true;
    float sueldo,total;
    

    public Ejercicio1_Junit() {

    }

    float calculaSalarioBruto(String tipo, float ventasMes, float horasExtra) throws BRException {

        if (tipo == null || ventasMes < 0 || horasExtra < 0) {
            throw new BRException();
        }


            if (tipo.equalsIgnoreCase("empleado")) {
                this.salarioBase = 1000;
                tipoEmpleado = true;
            }

            if (tipo.equalsIgnoreCase("encargado")) {
                this.salarioBase = 1500;
                tipoEmpleado = true;
            }
        
        if (ventasMes >= 1000) {
            if (ventasMes >= 1500) {
                salarioBase = salarioBase + 200;
            } else {
                salarioBase = salarioBase + 100;
            }

        } else {
            throw new BRException();
        }

        salarioBase = salarioBase + 20 * horasExtra;

        return salarioBase;

    }
    
    float calculaSalarioNeto(float salarioBruto) throws BRException{
        //Si el salario bruto es menor de 1000 euros, no se aplicará ninguna retención
        if (salarioBruto<1000) {
            throw new BRException();
            
        }else if((salarioBruto>=1000)&&(salarioBruto<=1500)){
            sueldo=0.16f;
            
            
        }else if(salarioBruto>1500){
            sueldo=0.18f;
            
        }
        total=salarioBruto*(1-sueldo);
        
        
        return total;
    }

}

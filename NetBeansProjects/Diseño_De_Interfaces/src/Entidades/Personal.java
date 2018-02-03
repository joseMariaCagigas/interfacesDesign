package Entidades;

import Datos.Array;
import Presentacion.PedirDatos_Statica;
import java.io.IOException;
import java.util.GregorianCalendar;

public class Personal {

    // Atributos
    String Nombre, Dni, Apellidos;
    GregorianCalendar FechaIngreso;
    
    Array array = new Array();

    // Constructor
    public Personal() {

    }

    public Personal(String Nombre, String Dni, String Apellidos) {
        this.Nombre = Nombre;
        this.Dni = Dni;
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Nombre=" + Nombre + ", Dni=" + Dni + ", Apellidos=" + Apellidos + ", FechaIngreso=" + FechaIngreso + '}';
    }

    public Personal Crear_Empleado() throws IOException {

        Personal_Fijo persona = new Personal_Fijo();
        Personal_Eventual persona2 = new Personal_Eventual();

        Nombre = Presentacion.PedirDatos_Statica.Leer_String_Sin_Numeros("Introduce El Nombre Del Empleado: ");
        Apellidos = PedirDatos_Statica.Leer_String_Sin_Numeros("Introduce Los Apellidos Del Empleado: ");
        Dni = PedirDatos_Statica.Leer_String("Introduce El DNI Del Empleado: ");

        String Tipo = PedirDatos_Statica.Leer_String("¿ Que Tipo De Empleado Es ? ");

        if (Tipo.equalsIgnoreCase("Fijo")) {

            // Parte Calendario
            int Dia = PedirDatos_Statica.Numero_Int("Introduce El Dia Del Registro: ");
            int Mes = PedirDatos_Statica.Numero_Int("Introduce Numero Del Mes Del Registro: ");
            int Anno = PedirDatos_Statica.Numero_Int("Introduce El Año Del Registro: ");

            GregorianCalendar Dia_Ingreso = new GregorianCalendar(Anno, Mes - 1, Dia);
            GregorianCalendar Dia_Actual = new GregorianCalendar();

            int Anno_Ingreso = Dia_Ingreso.get(GregorianCalendar.YEAR);
            int Anno_Actual = Dia_Actual.get(GregorianCalendar.YEAR);

            int Mes_Ingreso = Dia_Ingreso.get(GregorianCalendar.MONTH);
            int Mes_Actual = Dia_Actual.get(GregorianCalendar.MONTH);

            int Annos_Trabajados = Anno_Actual - Anno_Ingreso;

            if (Mes_Actual < Mes_Ingreso) {
                Annos_Trabajados = Annos_Trabajados - 1;
            }
            double Sueldo_Fijo_Calculado = persona.Calcular_Sueldo_Fijo();
            
            //Personal empleado1 = new Personal_Fijo("Christian", "Munoz", "123", Dia_Ingreso, Sueldo_Fijo_Calculado, 5);
            Personal empleado1 = new Personal_Fijo(Nombre, Apellidos, Dni, Dia_Ingreso, Sueldo_Fijo_Calculado, Annos_Trabajados);
            //array.Annadir_Empleado_Fijo(empleado1);
            return empleado1;
        } else {
            int Clientes_Captados = PedirDatos_Statica.Numero_Int("Cuantos Clientes Han Contratado El Servicio De Este Empleado: ");
            int Sueldo_Eventual_Calculado = persona2.Calcular_Sueldo_Eventual(Clientes_Captados);
            //Personal empleado2 = new Personal_Eventual("Christian", "123", "munoz", Sueldo_Eventual_Calculado);
            Personal empleado2 = new Personal_Eventual(Nombre, Dni, Apellidos, Sueldo_Eventual_Calculado);
            //array.Annadir_Empleado_Fijo(empleado2);
            return empleado2;
        }
        
    }

}

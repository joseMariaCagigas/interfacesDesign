/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases_de_datos_relacionales;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MaQuiNa1995
 */
public class Consulta_Templeado {

    public static void main(String[] args) {

        try {
// Connection conexion = Conexiones.conexionPostgresql();
//Preparar la consulta
            try (Connection conexion = Conexion_PostgreSql.conexionPostgresql(); // Connection conexion = Conexiones.conexionPostgresql();
//Preparar la consulta
                    Statement sentencia = conexion.createStatement()) {
                ResultSet result = sentencia.executeQuery(
                        "SELECT e.p_empleado,(e.a_departamento).p_departamento,"
                                + "e.apellidos,e.oficio,e.fecha_alta,e.salario,e.comision"
                                + " FROM templeado e");
// ResultSet result = sentencia.executeQuery("SELECT * FROM templeado");
//Se hace un bucle y mientras haya registros se van visualizando
                System.out.println("\nN_EMP N_DPTO APELLIDOS OFICIO"
                        + " FECHA ALTA SALARIO COMISION ");
                while (result.next()) {
                    System.out.println(" " + result.getInt(1) + " "
                            + result.getInt(2) + " "
                            + result.getString(3) + " "
                            + result.getString(4) + " "
                            + result.getDate(5) + " "
                            + result.getFloat(6) + " "
                            + result.getFloat(7) + " "
                    );
                }
            }
        } catch (SQLException e) {
        }
    }
}

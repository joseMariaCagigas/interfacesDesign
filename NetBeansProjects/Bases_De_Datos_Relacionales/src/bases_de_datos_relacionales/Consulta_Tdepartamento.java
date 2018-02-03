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

public class Consulta_Tdepartamento {

    public static void main(String[] args) {
        try {
            //Preparar la consulta
            try (Connection conexion = Conexion_Oracle.conexionOracle(); //Preparar la consulta
                    Statement sentencia = conexion.createStatement()) {
                ResultSet result = sentencia.executeQuery("SELECT * FROM CAT");
                //Se hace un bucle y mientras haya registros se van visualizando
                System.out.println("\n N_DPTO. NOMBRE LOC");
                while (result.next()) {
                    System.out.println(" " + result.getInt(1) + " "
                            + result.getString(2) + " "
                            + result.getString(3) + " "
                    );
                }
            }
        } catch (SQLException e) {
        }
    }
}

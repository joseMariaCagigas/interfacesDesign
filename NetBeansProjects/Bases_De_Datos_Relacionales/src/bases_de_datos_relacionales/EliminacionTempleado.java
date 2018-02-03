/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases_de_datos_relacionales;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MaQuiNa1995
 */
public class EliminacionTempleado {

    public static void main(String[] args) {
        try {
//Realizar la conexion
            Connection conexion = Conexion_PostgreSql.conexionPostgresql();
//Preparamos la consulta
            String sql = "delete from templeado where P_EMPLEADO=91";
            System.out.println(sql);
            Statement sentencia = conexion.createStatement();
            int filas = sentencia.executeUpdate(sql);
            System.out.println("Filas afectadas :" + filas);
            sentencia.close();
            conexion.close();
        } catch (SQLException e) {
        }
    }
}

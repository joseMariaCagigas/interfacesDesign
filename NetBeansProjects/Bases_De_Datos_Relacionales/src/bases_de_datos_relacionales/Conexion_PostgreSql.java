/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases_de_datos_relacionales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MaQuiNa1995
 */
public class Conexion_PostgreSql {

    public static Connection conexionPostgresql() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con
                    = DriverManager.getConnection("jdbc:postgresql://localhost/departamentos_o","postgres", "system");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
        }
        return null;
    }
}

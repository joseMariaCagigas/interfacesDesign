package bases_de_datos_relacionales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion_Oracle {

    public static Connection conexionOracle() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system", "system");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
                return null;
        }
        
    }
}



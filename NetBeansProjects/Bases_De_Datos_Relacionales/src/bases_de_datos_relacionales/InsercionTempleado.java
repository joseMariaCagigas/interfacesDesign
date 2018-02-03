package bases_de_datos_relacionales;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsercionTempleado {

    public static void main(String[] args) {
        try {
            //Preparamos la consulta
            try ( //Realizar la conexion
                    Connection conexion = Conexion_PostgreSql.conexionPostgresql()) {
                //Preparamos la consulta
                String sql = "insert into tdepartamento values(90,'ENOLOGIA','LOGROÑO')";
                System.out.println(sql);
                try (Statement sentencia = conexion.createStatement()) {
                    int filas = sentencia.executeUpdate(sql);
                    System.out.println("Filas afectadas :" + filas);
                }
            }
        } catch (SQLException e) {
        }
    }
}

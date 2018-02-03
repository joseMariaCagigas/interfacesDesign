/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases_de_datos_relacionales;

/**
 *
 * @author MaQuiNa1995
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Oracle: ");
        Conexion_Oracle.conexionOracle();
        System.out.println("Postgresql: ");
        Conexion_PostgreSql.conexionPostgresql();
        
        
    }
    
}

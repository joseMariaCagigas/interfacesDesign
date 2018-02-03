/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos_interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VideoclubModelo {

    private Connection conexion;

    public VideoclubModelo() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/ejerciciosbd";
            conexion = DriverManager.getConnection(url, "root", "root");
        } catch (Exception e) {
            System.out.println("Error al conectar a la BD" + e.getMessage());
        }
    }

    public void nuevaPelicula(Pelicula pelicula) {
        PreparedStatement sentenciaSQL = null;
        try {
            String consultaSQL
                    = "INSERT INTO peliculas(titulo,director,genero,prestada) VALUES(?,?,?,?)";
            sentenciaSQL = conexion.prepareStatement(consultaSQL);
            sentenciaSQL.setString(1, pelicula.getTitulo());
            sentenciaSQL.setString(2, pelicula.getDirector());
            sentenciaSQL.setString(3, pelicula.getGenero());
            sentenciaSQL.setBoolean(4, pelicula.isPrestada());
            int resultado = sentenciaSQL.executeUpdate();
            pelicula.setId(numeroPeliculas());
        } catch (Exception e) {
            System.out.println("Error insertando " + pelicula.getTitulo());
        }
    }

    public void guardaPelicula(Pelicula pelicula) {
        PreparedStatement sentenciaSQL = null;
        try {
            String consultaSQL
                    = "UPDATE peliculas SET titulo=?, director=?,genero=?,prestada=? WHERE id=?";
            sentenciaSQL = conexion.prepareStatement(consultaSQL);
            sentenciaSQL.setString(1, pelicula.getTitulo());
            sentenciaSQL.setString(2, pelicula.getDirector());
            sentenciaSQL.setString(3, pelicula.getGenero());
            sentenciaSQL.setBoolean(4, pelicula.isPrestada());
            sentenciaSQL.setInt(5, pelicula.getId());
            int resultado = sentenciaSQL.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error modificando " + pelicula.getTitulo());
        }
    }

    public void borraPelicula(Pelicula pelicula) {
        PreparedStatement sentenciaSQL = null;
        try {
            String consultaSQL = "DELETE FROM peliculas WHERE id=?";
            sentenciaSQL = conexion.prepareStatement(consultaSQL);
            sentenciaSQL.setInt(1, pelicula.getId());
            int resultado = sentenciaSQL.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error borrando " + pelicula.getTitulo());
        }
    }

    public int numeroPeliculas() {
        PreparedStatement sentenciaSQL = null;
        ResultSet resultado = null;
        Pelicula pelicula = null;
        try {
            String consultaSQL = "SELECT * FROM peliculas ";
            sentenciaSQL = conexion.prepareStatement(consultaSQL);
            resultado = sentenciaSQL.executeQuery();
            return numeroResultados(resultado);
        } catch (Exception e) {
            System.out.println("Consulta por título: ERROR");
            return 0;
        }
    }

    public Pelicula getPelicula(String titulo) {
        PreparedStatement sentenciaSQL = null;
        ResultSet resultado = null;
        Pelicula pelicula = null;
        try {
            String consultaSQL = "SELECT * FROM peliculas WHERE titulo LIKE ?";
            sentenciaSQL = conexion.prepareStatement(consultaSQL);
            sentenciaSQL.setString(1, titulo);
            resultado = sentenciaSQL.executeQuery();
            if (resultado.next()) {
                pelicula = new Pelicula();
                pelicula.setId(resultado.getInt("id"));
                pelicula.setTitulo(titulo);
                pelicula.setDirector(resultado.getString("director"));
                pelicula.setGenero(resultado.getString("genero"));
                pelicula.setPrestada(resultado.getBoolean("prestada"));
            }
            return pelicula;
        } catch (Exception e) {
            System.out.println("Consulta por título: ERROR");
            return null;
        }
    }

    public Pelicula[] getPeliculas() {
        Pelicula[] peliculas;
        PreparedStatement sentenciaSQL = null;
        ResultSet resultado = null;
        try {
            String consultaSQL = "SELECT * FROM peliculas";
            sentenciaSQL = conexion.prepareStatement(consultaSQL);
            resultado = sentenciaSQL.executeQuery();
            int numeroPeliculas = numeroResultados(resultado);
            peliculas = new Pelicula[numeroPeliculas];
            while (resultado.next()) {
                peliculas[resultado.getRow() - 1] = new Pelicula();
                peliculas[resultado.getRow() - 1].setId(resultado.getInt("id"));
                peliculas[resultado.getRow() - 1].setTitulo(resultado.getString("Titulo"));
                peliculas[resultado.getRow() - 1].setDirector(resultado.getString("Director"));
                peliculas[resultado.getRow() - 1].setGenero(resultado.getString("Genero"));
                peliculas[resultado.getRow() - 1].setPrestada(resultado.getBoolean("Prestada"));
            }
            return peliculas;
        } catch (Exception e) {
            System.out.println("Recuperación de títulos: ERROR");
            return null;
        }
    }

    private int numeroResultados(ResultSet resultado) {
        try {
            resultado.last();
            int numero = resultado.getRow();
            resultado.beforeFirst();
            return numero;
        } catch (Exception e) {
            return 0;
        }
    }

    void cierraConexion() {
        try {
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error al cerrar la conexión");
        }
    }
    
}



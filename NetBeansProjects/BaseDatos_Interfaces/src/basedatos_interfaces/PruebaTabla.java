/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos_interfaces;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PruebaTabla extends JFrame{

    VideoclubModelo modelo = new VideoclubModelo();
    JTable tabla;
    
    public void rellenarTabla() {
        DefaultTableModel dtm = new DefaultTableModel();
        Pelicula[] peliculas = modelo.getPeliculas();
        
        //creamos las columnas de la tabla
        dtm.addColumn("Id");
        dtm.addColumn("Titulo");
        dtm.addColumn("Director");
        dtm.addColumn("Genero");
        dtm.addColumn("Prestada");
        
        //rellenamos las filas con las peliculas
        for (Pelicula pelicula : peliculas) {
            String[] fila = new String[5];
            fila[0] = Integer.toString(pelicula.getId());
            fila[1] = pelicula.getTitulo();
            fila[2] = pelicula.getDirector();
            fila[3] = pelicula.getGenero();
            if (pelicula.isPrestada()) {
                fila[4] = "Si";
            } else {
                fila[4] = "No";
            }
            dtm.addRow(fila);
        }
        tabla.setModel(dtm);
    }
    
    public PruebaTabla(){
        tabla = new JTable();
        rellenarTabla();
        add(tabla);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        pack();
    }

    
    public static void main(String[] args) {
        PruebaTabla tabla= new PruebaTabla();
    }
}

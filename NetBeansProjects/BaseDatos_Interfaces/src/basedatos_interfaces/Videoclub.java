/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos_interfaces;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

public class Videoclub extends javax.swing.JFrame {

    String nuevo="/Resources_32x32/new-icon.png",
           abrir="/Resources_32x32/open-icon.png",
           modificar="/Resources_32x32/modify-icon.png",
           borrar="/Resources_32x32/delete-icon.png",
    
           nuevoSmall="/Resources_16x16/new-icon.png",
           abrirSmall="/Resources_16x16/open-icon.png",
           modificarSmall="/Resources_16x16/modify-icon.png",
           borrarSmall="/Resources_16x16/delete-icon.png",
           
           fondo="/Resources_32x32/pelicula.png";
   
    public Videoclub() {
        initComponents();
        DefinirVentana();
        DefinirMenus();
        DefinirFondo();
        pack();
        
    }

    public void DefinirVentana() {
        this.setTitle("Videoclub");
        setLayout(new BorderLayout());
    }
    
    public void DefinirFondo() {
        
        
        URL url = this.getClass().getResource(fondo);  
        ImageIcon icon = new ImageIcon(url);
        
        JLabel fondoLabel = new JLabel();
       
        
        
        add(fondoLabel);
        
        fondoLabel.setIcon(icon);
        
        
        
        fondoLabel.setPreferredSize(new Dimension(icon.getIconWidth(),icon.getIconHeight()));
        
        
        
    }
    
    public void DefinirMenus() {
        
        VideoclubControlador controlador = new VideoclubControlador(this);
        
        ImageIcon iconNuevoBig = new ImageIcon(getClass().getResource(nuevo));
        ImageIcon iconAbrirBig = new ImageIcon(getClass().getResource(abrir));
        ImageIcon iconModificarBig = new ImageIcon(getClass().getResource(modificar));
        ImageIcon iconBorrarBig = new ImageIcon(getClass().getResource(borrar));
        
        ImageIcon iconNuevoSmall = new ImageIcon(getClass().getResource(nuevoSmall));
        ImageIcon iconAbrirSmall = new ImageIcon(getClass().getResource(abrirSmall));
        ImageIcon iconModificarSmall = new ImageIcon(getClass().getResource(modificarSmall));
        ImageIcon iconBorrarSmall = new ImageIcon(getClass().getResource(borrarSmall));
        
        //Barra de herramientas
        JToolBar barraHerramientas = new JToolBar();
        
        JButton btnNuevo = new JButton(iconNuevoBig);
        JButton btnAbrir = new JButton(iconAbrirBig);
        JButton btnModificar = new JButton(iconModificarBig);
        JButton btnBorrar = new JButton(iconBorrarBig);
        
        
        btnNuevo.setActionCommand("Nuevo");
        btnAbrir.setActionCommand("Abrir");
        btnModificar.setActionCommand("Modificar");
        btnBorrar.setActionCommand("Borrar");
        
        btnNuevo.addActionListener(controlador);
        btnAbrir.addActionListener(controlador);
        btnModificar.addActionListener(controlador);
        btnBorrar.addActionListener(controlador);
        
        barraHerramientas.add(btnNuevo);
        barraHerramientas.add(btnAbrir);
        barraHerramientas.add(btnModificar);
        barraHerramientas.add(btnBorrar);
        
        //add(barraHerramientas, BorderLayout.NORTH);
        add(barraHerramientas, BorderLayout.NORTH);
        
        //Menu superior
        JMenuItem miNuevo = new JMenuItem("Nuevo", iconNuevoSmall);
        JMenuItem miAbrir = new JMenuItem("Abrir", iconAbrirSmall);
        JMenuItem miModificar = new JMenuItem("Modificar", iconModificarSmall);
        JMenuItem miBorrar = new JMenuItem("Borrar", iconBorrarSmall);
        
        miNuevo.addActionListener(controlador);
        miAbrir.addActionListener(controlador);
        miModificar.addActionListener(controlador);
        miBorrar.addActionListener(controlador);
        
        JMenu menuArchivo = new JMenu("Archivo");
        
        menuArchivo.add(miNuevo);
        menuArchivo.add(miAbrir);
        menuArchivo.add(miModificar);
        menuArchivo.add(miBorrar);
        
        JMenuBar menu = new JMenuBar();
        
        menu.add(menuArchivo);
    
        this.setJMenuBar(menu);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Videoclub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Videoclub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Videoclub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Videoclub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Videoclub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

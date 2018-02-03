package Ejercicio3;

import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Comprobador extends javax.swing.JFrame implements ActionListener{

        JButton boton1;
        JTextArea textarea1;
    
    public void creacionVentana() {
        this.setTitle("Comprobador");
        this.setSize(500, 500);
        this.setLocation(500, 300);
        FlowLayout admin = new FlowLayout();
        this.setLayout(admin);
        
    }
    
    public void creacionBoton1() {
        boton1 = new JButton();
        boton1.setText("Aceptar");

        this.getContentPane().add(boton1);
        boton1.addActionListener(this);
    }
    
    public void creacionTextarea1(){
        textarea1 = new JTextArea();
        
        textarea1.setPreferredSize(new Dimension(400,100));
        this.getContentPane().add(textarea1);
    }
    
    public Comprobador() {
        initComponents();
        creacionVentana();
        creacionTextarea1();
        creacionBoton1();
    }

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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comprobador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==boton1) {
            String contiene = textarea1.getText();
            
            if (contiene.matches("[A-Za-z]*Santander[A-Za-z]*") == true) {
                JOptionPane.showMessageDialog(null, "El texto contiene Santander", "Validaciones",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El texto no contiene Santander", "Validaciones",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
    }
}

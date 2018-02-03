package Ejercicio4;

import Ejercicio3.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaSecundaria extends javax.swing.JFrame implements ActionListener{

    GridLayout admin = new GridLayout(4, 1,0,0);
    Output_Box caja = new Output_Box();

    
    
    JPanel fila1,fila2,fila3;
    JComboBox comboBox1;
    JLabel label1;
    JTextField input1;
    String Paises[] = {"argentina","españa","francia","brasil","rusia"},nombre,pais;
    JButton boton1,boton2;
    
    
    
    
    public VentanaSecundaria() {
        initComponents();
        creacionVentana();
        creacionFila1();
        creacionFila2();
        creacionFila3();
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


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSecundaria().setVisible(true);
            }
        });
    }

    public void creacionVentana() {
        this.setLayout(admin);
        this.setTitle("Usuario");
        this.setLocation(500, 300);
    }
    
    public void creacionFila1() {
        fila1 = new JPanel();
        input1 = new JTextField(10);
        label1 = new JLabel("Usuario: ");   
        fila1.add(label1);
        fila1.add(input1);
        this.add(fila1);
    }
    
    public void creacionFila2() {
        fila2 = new JPanel();
        comboBox1 = new JComboBox();
        for (int i = 0; i < 5; i++) {
            comboBox1.addItem(Paises[i]);
        }
        
        fila2.add(comboBox1);
        this.add(fila2);
    }
    
    public void creacionFila3() {
        fila3 = new JPanel();
        
        boton1= new JButton("Confirmar");
        boton2= new JButton("Cancelar");
        
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        
        fila3.add(boton1);
        fila3.add(boton2);
        
        this.add(fila3);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == boton1) {
            
            nombre = input1.getText();
            pais = comboBox1.getSelectedItem().toString();
            Usuario usuario = new Usuario(nombre, pais);
            
            caja.Cuadro_Vacio("Objeto", usuario.toString());
        }
        
        if (ae.getSource() == boton2) {
            this.setVisible(false);
        }
        
    }


}

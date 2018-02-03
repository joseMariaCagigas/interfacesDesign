/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author MaQuiNa1995
 */
public class Ejercicio8 extends javax.swing.JFrame implements ActionListener {

    GridLayout admin = new GridLayout(1, 2);
    JPanel columna1, columna2;
    JRadioButton botonRadio1, botonRadio2, botonRadio3, botonRadio4, botonRadio5;
    ButtonGroup grupo1;
    JLabel label1;
    ImageIcon imagen1,imagen2;
    String pais;

    public Ejercicio8() {
        initComponents();
        creacionVentana();
        creacionColumna1();
        creacionColumna2();

    }

    public void creacionVentana() {
        this.setLayout(admin);
        this.setTitle("Banderitas");
        this.setLocation(500, 300);
    }

    public void creacionColumna1() {
        columna1 = new JPanel(new GridLayout(5, 1));
        grupo1 = new ButtonGroup();

        botonRadio1 = new JRadioButton("Brasil");
        botonRadio2 = new JRadioButton("Francia");
        botonRadio3 = new JRadioButton("Italia");
        botonRadio4 = new JRadioButton("Japon");
        botonRadio5 = new JRadioButton("España");

        botonRadio1.addActionListener(this);
        botonRadio2.addActionListener(this);
        botonRadio3.addActionListener(this);
        botonRadio4.addActionListener(this);
        botonRadio5.addActionListener(this);

        grupo1.add(botonRadio1);
        grupo1.add(botonRadio2);
        grupo1.add(botonRadio3);
        grupo1.add(botonRadio4);
        grupo1.add(botonRadio5);

        columna1.add(botonRadio1);
        columna1.add(botonRadio2);
        columna1.add(botonRadio3);
        columna1.add(botonRadio4);
        columna1.add(botonRadio5);

        this.add(columna1);
    }

    public void creacionColumna2() {
        columna2 = new JPanel(new GridLayout());
        label1 = new JLabel("");
        columna2.add(label1);
        this.add(columna2);
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
                new Ejercicio8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
@Override
    public void actionPerformed(ActionEvent ae) {
        
        if (botonRadio1.isSelected()) {
            
            pais = "/Banderas/brazil.jpg";
        }

        if (botonRadio2.isSelected()) {
            pais = "/Banderas/france.jpg";
        }

        if (botonRadio3.isSelected()) {
            pais = "/Banderas/italy.jpg";
        }

        if (botonRadio4.isSelected()) {
            pais = "/Banderas/japan.jpg";
        }

        if (botonRadio5.isSelected()) {
            pais = "/Banderas/spain.jpg";
        }
        
        
        imagen1 = new ImageIcon(getClass().getResource(pais));
        label1.setIcon(imagen1);
        
        imagen2 = new ImageIcon(getClass().getResource(pais));

        this.setIconImage(imagen2.getImage());
        

    }
}

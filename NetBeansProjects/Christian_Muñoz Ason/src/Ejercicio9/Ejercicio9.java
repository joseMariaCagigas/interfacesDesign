package Ejercicio9;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejercicio9 extends javax.swing.JFrame implements ChangeListener, ActionListener {

    int celsius, farenhait;
    float farenhaitCalculados, celsiusCalculados;
    JLabel label1, label2, label3, label4;
    JSlider barra1, barra2;
    JPanel panel1, panel2;
    JMenuBar menu;
    JMenu menuOpciones;
    JMenuItem menuItems, menuItems2;

    GridLayout admin = new GridLayout(2, 1);

    public Ejercicio9() {
        initComponents();
        creacionVentana();
        creacionMenu();
        creacionFila1();
        creacionFila2();
    }

    public void creacionMenu() {
        menu = new JMenuBar();
        menuOpciones = new JMenu("Modo");
        menuItems = new JMenuItem("Celsius");
        menuItems2 = new JMenuItem("Farenhait");
        
        menuItems.setEnabled(false);

        setJMenuBar(menu);
        menu.add(menuOpciones);

        menuItems.setActionCommand("Celsius");
        menuItems2.setActionCommand("Farenhait");

        menuOpciones.add(menuItems);
        menuOpciones.add(menuItems2);

        //problema
        menuItems.addActionListener(this);
        menuItems2.addActionListener(this);

    }

    public void creacionVentana() {
        this.setLayout(admin);
        this.setTitle("Temperaturas");
        this.setLocation(500, 300);
    }

    public void creacionFila1() {
        panel1 = new JPanel(new FlowLayout());

        label1 = new JLabel("Temperatura(Cº): ");
        label2 = new JLabel("0");

        panel1.add(label1);
        panel1.add(label2);

        // orientacion, valor min, valor max, valor default
        barra1 = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        barra1.setMajorTickSpacing(20);

        barra1.setPaintTicks(true);
        barra1.setPaintLabels(true);

        barra1.addChangeListener(this);

        barra1.setEnabled(true);

        panel1.add(barra1);

        this.add(panel1);
    }

    public void creacionFila2() {
        panel2 = new JPanel(new FlowLayout());

        label3 = new JLabel("Temperatura(Fº): ");
        label4 = new JLabel("32");

        panel2.add(label3);
        panel2.add(label4);

        barra2 = new JSlider(JSlider.HORIZONTAL, 32, 212, 32);

        barra2.setMajorTickSpacing(36);
        barra2.setPaintTicks(true);
        barra2.setPaintLabels(true);    

        barra2.setEnabled(false);

        panel2.add(barra2);

        this.add(panel2);
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
                new Ejercicio9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void stateChanged(ChangeEvent ce) {
        if (ce.getSource() == barra1) {
            celsius = barra1.getValue();
            label2.setText(String.valueOf(celsius));

            farenhaitCalculados = celsius * 1.8f + 32;

            label4.setText(String.valueOf(farenhaitCalculados));
            barra2.setValue((int) farenhaitCalculados);
        } 
        
        if (ce.getSource() == barra2) {
            farenhait = barra2.getValue();
            label4.setText(String.valueOf(farenhait));

            celsiusCalculados = (farenhait - 32) * 0.55f;
            
            label2.setText(String.valueOf(celsiusCalculados));
            barra1.setValue((int) celsiusCalculados);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equalsIgnoreCase("Celsius")) {
            barra2.setEnabled(false);
            barra1.setEnabled(true);

            barra2.removeChangeListener(this);
            barra1.addChangeListener(this);

            
            menuItems.setEnabled(false);
            menuItems2.setEnabled(true);
        }

        if (ae.getActionCommand().equalsIgnoreCase("Farenhait")) {
            barra1.setEnabled(false);
            barra2.setEnabled(true);

            barra1.removeChangeListener(this);
            barra2.addChangeListener(this);
            
            menuItems.setEnabled(true);
            menuItems2.setEnabled(false);
        }
    }
}

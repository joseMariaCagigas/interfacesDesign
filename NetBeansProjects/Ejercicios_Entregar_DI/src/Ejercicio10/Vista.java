package Ejercicio10;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista extends javax.swing.JFrame implements ActionListener {

    GridLayout admin = new GridLayout(4, 1);
    
    ImageIcon icon;
    Listener escuchador;
    double operando1, operando2, resultado;
    
    JLabel label1, label2, label3, label4;
    JTextField input1, input2, input3;
    JButton boton1, boton2, boton3, boton4, boton5;
    JPanel panel1, panel2, panel3, panel4;

    public Vista() {
        initComponents();
        creacionVentana();
        creacionFila1();
        creacionFila2();
        creacionFila3();
        creacionFila4();
    }

    public void creacionVentana() {
        this.setLayout(admin);
        this.setTitle("Colores");
        this.setLocation(500, 300);
        icon = new ImageIcon(getClass().getResource("/Resource/Crazy.png"));
        this.setIconImage(icon.getImage());
    }

    public void creacionFila1() {
        panel1 = new JPanel(new FlowLayout());

        label1 = new JLabel("Operando1: ");
        input1 = new JTextField(10);

        panel1.add(label1);
        panel1.add(input1);

        label2 = new JLabel("Operando2: ");
        input2 = new JTextField(10);

        panel1.add(label2);
        panel1.add(input2);

        this.add(panel1);
    }

    public void creacionFila2() {
        panel2 = new JPanel(new FlowLayout());

        boton1 = new JButton("+");
        boton2 = new JButton("-");
        boton3 = new JButton("*");
        boton4 = new JButton("/");
        boton5 = new JButton("Limpiar");

        boton1.addActionListener(escuchador);
        boton2.addActionListener(escuchador);
        boton3.addActionListener(escuchador);
        boton4.addActionListener(escuchador);
        boton5.addActionListener(escuchador);

        panel2.add(boton1);
        panel2.add(boton2);
        panel2.add(boton3);
        panel2.add(boton4);
        panel2.add(boton5);

        this.add(panel2);
    }

    public void creacionFila3() {
        panel3 = new JPanel(new FlowLayout());

        label3 = new JLabel("Resultado");
        input3 = new JTextField(10);

        panel3.add(label3);
        panel3.add(input3);

        this.add(panel3);
    }

    public void creacionFila4() {
        panel4 = new JPanel(new FlowLayout());

        label4 = new JLabel("");
        label4.setForeground(Color.red);

        panel4.add(label4);

        this.add(panel4);
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        escuchador = new Listener(ae);
        escuchador.actionPerformed(ae);
        
    }

}

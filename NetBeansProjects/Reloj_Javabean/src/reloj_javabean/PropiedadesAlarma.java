/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj_javabean;

/**
 *
 * @author MaQuiNa1995
 */
public class PropiedadesAlarma extends javax.swing.JPanel {

            
            
    public PropiedadesAlarma() {
        initComponents();
        declararvariables();
    }
    
    public Reloj_Javabean declararvariables(){
        
      
        int hora = Integer.parseInt(horaText.getText());
        int minuto = Integer.parseInt(minutoText.getText());
        
        Reloj_Javabean reloj = new Reloj_Javabean();
        
        return reloj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        horaText = new javax.swing.JTextField();
        minutoText = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Hora:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setText("Minuto:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, 40, -1));
        add(horaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 60, -1));
        add(minutoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 60, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField horaText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField minutoText;
    // End of variables declaration//GEN-END:variables
}

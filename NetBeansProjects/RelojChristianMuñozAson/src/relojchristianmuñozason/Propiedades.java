package relojchristianmuñozason;

public class Propiedades extends javax.swing.JPanel {

    String hora,min;
    public Propiedades() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textMinuto = new javax.swing.JTextField();
        textHora = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Hora:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 14, -1, -1));

        jLabel2.setText("Minutos:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        textMinuto.setText(" ");
        add(textMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 49, -1));
        add(textHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 49, -1));
    }// </editor-fold>//GEN-END:initComponents

public Alarma getSelectedValue(){
    
    hora=String.valueOf(textHora.getText());
    min=String.valueOf(textMinuto.getText());

    Alarma despertador=new Alarma(hora,min);
    return despertador;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField textHora;
    private javax.swing.JTextField textMinuto;
    // End of variables declaration//GEN-END:variables
}

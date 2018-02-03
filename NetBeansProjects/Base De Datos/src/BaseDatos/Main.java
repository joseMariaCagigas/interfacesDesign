package BaseDatos;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Main extends javax.swing.JFrame {

    String clave, nombre, edad, sueldo;
    boolean todoOkey = true;
    
    FileReader leerFichero;
    FileOutputStream fos;

    Output_Box caja = new Output_Box();

    String fichero = "BaseDatos.txt";
    File archivo = new File(fichero);

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel6121 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada De Registros"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Clave:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 40, -1));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, -1));

        jLabel3.setText("Edad:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 40, -1));

        jLabel4.setText("Sueldo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 50, -1));

        jButton1.setText("Grabar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 60, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 60, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 60, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 60, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 160, 370));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 460, 30));

        jLabel5.setText("Indice Ultilizado:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 110, 20));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado De Registros"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Datos Secuenciales");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, -1));

        jButton3.setText("Índices Secuenciales");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, -1));

        jButton4.setText("Índices- Datos Secuenciales");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, -1));

        jButton5.setText("Ordenar Índice");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 230, 190));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 250, 340));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda De Registro"));
        jPanel5.setToolTipText("");
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Clave a Buscar:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        jPanel5.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 130, -1));

        jButton6.setText("Índice Sin Ordenar");
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 60, 130, -1));

        jButton7.setText("Índice Ordenado");
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jButton8.setText("Búsqueda Ditonómica");
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jPanel6121.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Encontrado"));
        jPanel6121.setToolTipText("");
        jPanel6121.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Sueldo:");
        jPanel6121.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 40, -1));
        jPanel6121.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 60, -1));
        jPanel6121.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 60, -1));

        jLabel9.setText("Edad:");
        jPanel6121.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 40, -1));

        jLabel8.setText("Nombre:");
        jPanel6121.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, -1));
        jPanel6121.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 60, -1));
        jPanel6121.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 60, -1));

        jLabel7.setText("Clave:");
        jPanel6121.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 40, -1));

        jLabel11.setText("Registros Leidos: ");
        jPanel6121.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, -1));
        jPanel6121.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 60, -1));

        jPanel5.add(jPanel6121, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 200, 220));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 250, 390));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 710, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Clave
        clave = jTextField1.getText();

        if (clave.length() > 8) {
            clave = clave.substring(0, 8);
        } else {
            while (clave.length() < 9) {
                clave = clave + '$';
            }
        }

        // Nombre
        nombre = jTextField2.getText();

        if (nombre.length() > 15) {
            nombre = nombre.substring(0, 14);
        } else {

            while (nombre.length() < 15) {
                nombre = nombre + '$';
            }
        }
        // Edad
        edad = jTextField3.getText();

        if (edad.length() > 4) {
            edad = edad.substring(0, 3);
        } else {

            while (edad.length() < 4) {
                edad = edad + '$';
            }
        }

        // Sueldo
        sueldo = jTextField4.getText();

        if (sueldo.length() > 4) {
            sueldo = sueldo.substring(0, 3);
        } else {

            while (sueldo.length() < 4) {
                sueldo = sueldo + '$';
            }
        }

        // Validaciones
        if (todoOkey == true) {
            try {
                FileOutputStream fos = new FileOutputStream(archivo, true);
                DataOutputStream dos = new DataOutputStream(fos);

                dos.writeChars(clave);
                dos.writeChars(nombre);
                dos.writeChars(edad);
                dos.writeChars(sueldo);

                dos.close();
                fos.close();
            } catch (Exception e) {

            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            char arrayClave[] = new char[18];
            char arrayNombre[] = new char[30];
            char arrayEdad[] = new char[8];
            char arraySueldo[] = new char[8];

            leerFichero = new FileReader(fichero);

            leerFichero.read(arrayClave, 0, 18);
            String clave1="";
            for (int i = 0; i < 18; i++) {
                clave1=clave1+arrayClave[i];
            }
 
            leerFichero.read(arrayNombre, 0, 30);
            String nombre1 = "";
            for (int i = 0; i < 30; i++) {
                nombre1=nombre1+arrayNombre[i];
            }

            leerFichero.read(arrayEdad, 0, 8);
            String edad1 = "";
            for (int i = 0; i < 8; i++) {
                edad1=edad1+arrayEdad[i];
            }

            leerFichero.read(arraySueldo, 0, 8);
            String sueldo1 = "";
            for (int i = 0; i < 8; i++) {
                sueldo1=sueldo1+arraySueldo[i];
            }

            jTextArea1.append(clave1 + ',' + nombre1 + ',' + edad1 +',' + sueldo1);

            leerFichero.close();
        } catch (IOException e) {
            System.out.println("-.-");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        File indice = new File(jTextField5.getText());
        FileReader indiceLeer;
        try {
            indiceLeer = new FileReader(indice);
        } catch (FileNotFoundException ex) {

        }
        
//        if (!indice.exists()) {
//            try {
//                indiceLeer.read();
//            } catch (IOException ex) {
//                
//            }
//        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6121;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}

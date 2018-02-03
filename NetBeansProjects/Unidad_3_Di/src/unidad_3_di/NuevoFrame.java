/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad_3_di;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NuevoFrame extends FrameMedida implements ActionListener {

    BotonMedida btnPulsa;
    LabelMedida lblTexto;

    public NuevoFrame() {
        btnPulsa = new BotonMedida("Púlsame");
        btnPulsa.addActionListener(this);
        lblTexto = new LabelMedida("Etiqueta");
        add(btnPulsa);
        add(lblTexto);
        setSize(300, 75);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        lblTexto.setText("Hola otra vez");
    }

    public static void main(String[] args) {
        new NuevoFrame().muestra();
    }
    
}

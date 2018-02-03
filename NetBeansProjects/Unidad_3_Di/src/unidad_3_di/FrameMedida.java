/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad_3_di;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class FrameMedida extends JFrame {

    public FrameMedida() {
        super("Componentes a medida");
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void muestra() {
        setVisible(true);
    }
}

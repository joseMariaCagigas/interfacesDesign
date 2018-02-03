/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener extends Vista implements ActionListener {

    ActionEvent ae;
                    
    Operaciones calculos = new Operaciones(operando1, operando2, resultado);
    public Listener(ActionEvent ae) {
        this.ae = ae;
    }
    
    @Override
    
    public void actionPerformed(ActionEvent ae) {
        System.out.println("paso por aqui");
        label4.setText(null);
        input3.setText(null);

        if (ae.getSource() == boton5) {
            input1.setText(null);
            input2.setText(null);
            input3.setText(null);
            label4.setText(null);
        } else {

            try {
                if ((input1.getText().length() == 0) || (input2.getText().length() == 0)) {
                    super.label4.setText("Falta Algún Operando");
                } else {
                    operando1 = Double.parseDouble(input1.getText());
                    operando2 = Double.parseDouble(input2.getText());
                    
                    

                    if (ae.getSource() == boton1) {
                        calculos.sumar(operando1, operando2);
                    }

                    if (ae.getSource() == boton2) {
                        calculos.restar(operando1, operando2);
                    }

                    if (ae.getSource() == boton3) {
                        calculos.multiplicar(operando1, operando2);
                    }

                    if (ae.getSource() == boton4) {
                        calculos.dividir(operando1, operando2);
                    }
                    
                    if (ae.getSource() == boton5) {
                        super.input1 = null;
                        super.input2 = null;
                        super.input3 = null;
                    }

                }
            } catch (NumberFormatException e) {
                label4.setText("No Me Metas Letras ¬¬");
                input3.setText(null);
            }
        }
    }

    
}

package ejercicio1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {

    JPanel panelArriba, panelAbajo;
    
    Boolean hecho;
    
    JTextField textResultado;
    
    JButton arrayBotones[];
    
    JButton botonSumar, botonRestar, botonMultiplicar, botonDividir, boton0,
            boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8,
            boton9, botonBorrar, botonResultado;
    
    double primerNumero = 0, segundoNumero = 0;
    
    String tipoOperacion = "";
    
    boolean nuevaOperacion = true;

    public Calculadora() {
        declararPropiedadesVentana();
        declararTodo();
    }
    
    public void declararPropiedadesVentana(){
        setTitle("Calculadora");
        setSize(300, 300);
        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagen/calc.ico"));
        setIconImage(icon);
        
        
    }

    public void declararTodo() {
        panelArriba = new JPanel();
        panelArriba.setLayout(new BorderLayout());

        textResultado = new JTextField();
        textResultado.setEditable(false);
        panelArriba.add("North", textResultado);
        
        panelAbajo = new JPanel();
        panelAbajo.setLayout(new GridLayout(4, 4, 1, 1));

        arrayBotones = new JButton[16];

        String[] arrayNombreBotones = {"7", "8", "9", "+", "6", "5", "4", "-", "3", "2",
            "1", "*", "0", "C", "=", "/"};

        String[] arrayToolTipText = {"Siete", "Ocho", "Nueve", "Sumar", "Seis",
            "Cinco", "Cuatro", "Restar", "Tres", "Dos", "Uno", "Multiplicar",
            "Cero", "Borrar", "Resultado", "Dividir"};

        for (int i = 0; i < arrayBotones.length; i++) {
            arrayBotones[i] = new JButton(arrayNombreBotones[i]);
            arrayBotones[i].addActionListener(this);
            arrayBotones[i].setToolTipText(arrayToolTipText[i]);
            arrayBotones[i].doClick();
            panelAbajo.add(arrayBotones[i]);
        }

        panelArriba.add("Center", panelAbajo);
        add(panelArriba);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        hecho = false;

        if (e.getActionCommand().equals("+")) {
            tipoOperacion = "suma";
            try {
                if (primerNumero != 0) {
                    primerNumero = primerNumero + Double.parseDouble(textResultado.getText());
                } else {
                    primerNumero = Double.parseDouble(textResultado.getText());
                }

                textResultado.setText("");

            } catch (Exception err) {
            }
            hecho = true;
            
        }

        if (e.getActionCommand().equals("-")) {
            tipoOperacion = "resta";
            try {
                if (primerNumero != 0) {
                    primerNumero = primerNumero - Double.parseDouble(textResultado.getText());
                } else {
                    primerNumero = Double.parseDouble(textResultado.getText());
                }

                textResultado.setText("");
            } catch (Exception err) {
            }
            hecho = true;
        }

        if (e.getActionCommand().equals("*")) {
            tipoOperacion = "multiplicacion";
            try {
                if (primerNumero != 0) {
                    primerNumero = primerNumero * Double.parseDouble(textResultado.getText());
                } else {
                    primerNumero = Double.parseDouble(textResultado.getText());
                }

                textResultado.setText("");
            } catch (Exception err) {
            }
            hecho = true;
        }

        if (e.getActionCommand().equals("/")) {
            tipoOperacion = "division";
            try {
                if (primerNumero != 0) {
                    primerNumero = primerNumero / Double.parseDouble(textResultado.getText());
                } else {
                    primerNumero = Double.parseDouble(textResultado.getText());
                }

                textResultado.setText("");
                System.out.println("llego");
            } catch (Exception err) {
            }
            hecho = true;
        }

        //IGUAL
        if (e.getActionCommand().equals("=")) {
            try {
                segundoNumero = Double.parseDouble(textResultado.getText());
            } catch (Exception err) {
            }
            if (tipoOperacion.equals("suma")) {
                double res = primerNumero + segundoNumero;
                textResultado.setText(String.valueOf(res));
                primerNumero = segundoNumero = 0;
                tipoOperacion = "";
            } else if (tipoOperacion.equals("resta")) {
                double res = primerNumero - segundoNumero;
                textResultado.setText(String.valueOf(res));
                primerNumero = segundoNumero = 0;
                tipoOperacion = "";
            } else if (tipoOperacion.equals("multiplicacion")) {
                double res = primerNumero * segundoNumero;
                textResultado.setText(String.valueOf(res));
                primerNumero = segundoNumero = 0;
                tipoOperacion = "";
            } else if (tipoOperacion.equals("division")) {
                double res = primerNumero / segundoNumero;
                textResultado.setText(String.valueOf(res));
                primerNumero = segundoNumero = 0;
                tipoOperacion = "";
            }
            nuevaOperacion = true;
            hecho = true;
        }

        //CE
        if (e.getActionCommand().equals("C")) {
            textResultado.setText("");
            primerNumero = segundoNumero = 0;
            tipoOperacion = "";
            hecho = true;
        }
        
        if (hecho == false) {
            eventosTeclaNumero(e.getActionCommand());
        }

    }

    public void eventosTeclaNumero(String nombreBoton) {
        
        if (nuevaOperacion) {
            textResultado.setText("");
            nuevaOperacion = false;
        }
        textResultado.setText(textResultado.getText() + nombreBoton);
    }
    
//    private void metodoPulsacion(ActionEvent e2) { 
//        arrayBotones[e2.getSource().].doClick();
//    }

}
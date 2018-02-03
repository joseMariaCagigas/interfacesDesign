/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos_interfaces;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import sun.awt.im.InputMethodJFrame;

/**
 *
 * @author MaQuiNa1995
 */
public class PeliculaDialog extends JDialog implements ActionListener {

    JPanel panelTotal;
    JButton btnGuardar, btnCancelar;
    JTextField textfieldTitulo, textfieldDirector;
    JComboBox jcomboboxGenero;
    JRadioButton radioButtonSi, radioButtonNo;

    VideoclubModelo modeloVideoclub = new VideoclubModelo();

    Videoclub videoclub = new Videoclub();
    Pelicula pelicula = new Pelicula();
    //VideoclubControlador videoclubControlador = new VideoclubControlador(videoclub);

    public PeliculaDialog(Videoclub videoclub, boolean modal) {
        setSize(new Dimension(200, 200));
        muestra();

    }

    public void muestra() {

        JPanel panelTodo = new JPanel();
        panelTodo.setLayout(new GridLayout(5, 2));

        // Parte izquierda 
        JLabel labelTitulo = new JLabel("Titulo: "),
                labelDirector = new JLabel("Director: "),
                labelGenero = new JLabel("Genero: "),
                labelPrestada = new JLabel("Prestada: ");

        JPanel panelTitulo = new JPanel(),
                panelDirector = new JPanel(),
                panelGenero = new JPanel(),
                panelPrestada = new JPanel();

        panelTitulo.add(labelTitulo);
        panelDirector.add(labelDirector);
        panelGenero.add(labelGenero);
        panelPrestada.add(labelPrestada);

        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(this);
        JPanel panelGuardar = new JPanel();

        panelGuardar.add(btnGuardar);

        //Parte derecha
        textfieldTitulo = new JTextField();
        textfieldTitulo.setPreferredSize(new Dimension(75, 25));
        textfieldDirector = new JTextField();
        textfieldDirector.setPreferredSize(new Dimension(75, 25));
        jcomboboxGenero = new JComboBox();
        jcomboboxGenero.addItem("Accion");
        jcomboboxGenero.addItem("Comedia");
        jcomboboxGenero.addItem("Ficcion");

        JPanel radioButtonsPanel = new JPanel();
        radioButtonsPanel.setLayout(new FlowLayout());

        radioButtonSi = new JRadioButton("Si");
        radioButtonNo = new JRadioButton("No");

        ButtonGroup grupoPrestado = new ButtonGroup();

        radioButtonsPanel.add(radioButtonSi);
        radioButtonsPanel.add(radioButtonNo);

        grupoPrestado.add(radioButtonSi);
        grupoPrestado.add(radioButtonNo);

        JPanel panelCancelar = new JPanel();
        btnCancelar = new JButton("Cancelar");
        panelCancelar.add(btnCancelar);
        btnCancelar.addActionListener(this);

        JPanel panelTitulo2 = new JPanel();
        panelTitulo2.add(textfieldTitulo);
        JPanel panelDirector2 = new JPanel();
        panelDirector2.add(textfieldDirector);

        JPanel panelGenero2 = new JPanel();
        panelGenero2.add(jcomboboxGenero);

        panelTodo.add(panelTitulo);
        panelTodo.add(panelTitulo2);

        panelTodo.add(panelDirector);
        panelTodo.add(panelDirector2);

        panelTodo.add(panelGenero);
        panelTodo.add(panelGenero2);

        panelTodo.add(panelPrestada);
        panelTodo.add(radioButtonsPanel);

        panelTodo.add(panelGuardar);
        panelTodo.add(panelCancelar);

        add(panelTodo);
    }

    public void muestraNueva() {
        setTitle("Nueva Pelicula");
        setVisible(true);
        // Que id se pone al crear un objeto 
//        Pelicula peliNueva = new Pelicula(WIDTH, null, null, rootPaneCheckingEnabled)
        
        modeloVideoclub.nuevaPelicula(pelicula);
    }

    public void muestraAbrir() {
        Pelicula pelis = generaPeliculas();

        btnGuardar.setVisible(false);
        btnCancelar.setText("Okey");

        textfieldTitulo.setText(pelis.getTitulo());
        textfieldDirector.setText(pelis.getDirector());
        jcomboboxGenero.setSelectedItem(pelis.getGenero());

        
        
        if (pelis.isPrestada()) {
            radioButtonSi.setSelected(true);
        } else {
            radioButtonNo.setSelected(true);
        }
        
        
        radioButtonNo.setEnabled(false);
        radioButtonSi.setEnabled(false);
        textfieldDirector.setEnabled(false);
        textfieldTitulo.setEnabled(false);
        jcomboboxGenero.setEnabled(false);
        
        setVisible(true);
        

        

    }

    public void muestraModificar() {
        Pelicula pelis = generaPeliculas();

        textfieldTitulo.setText(pelis.getTitulo());
        textfieldDirector.setText(pelis.getDirector());
        jcomboboxGenero.setSelectedItem(pelis.getGenero());

        if (pelis.isPrestada()) {
            radioButtonSi.setSelected(true);
        } else {
            radioButtonNo.setSelected(true);
        }
        
        // aquiii
        modeloVideoclub.borraPelicula(pelicula);
        
        setVisible(true);

    }

    public void muestraBorrar() {
        Pelicula pelis = generaPeliculas();
        
        
        int opcion = JOptionPane.showConfirmDialog(
                this,
                "Desea Borrar De Verdad La Pelicula",
                "Confirma La Accion",
                JOptionPane.YES_NO_OPTION);
        
        System.out.println(opcion);
        
        if (opcion==0) {
            modeloVideoclub.borraPelicula(pelis);
        } else{
            this.setVisible(false);
        }
    }

    public Pelicula generaPeliculas() {

        Pelicula pedirPelis = (Pelicula) JOptionPane.showInputDialog(
                this,
                "Selecciona Una Pelicula",
                "peliculas",
                JOptionPane.QUESTION_MESSAGE,
                null,
                modeloVideoclub.getPeliculas(),
                modeloVideoclub.getPeliculas()[0]
        );
        return pedirPelis;

    }

//    public void muestraBorrar(){
//        int seleccion = JOptionPane.showOptionDialog(
//        unComponentePadre,
//        "Seleccione opcion", 
//        "Selector de opciones",
//        JOptionPane.YES_NO_CANCEL_OPTION,
//        JOptionPane.QUESTION_MESSAGE,
//        unIcono,    // null para icono por defecto.
//        new Object[] 
//    }
            @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        
        switch (comando) {
            
            case "Okey":
                this.setVisible(false);
                break;
                
            case "Cancelar":
                this.setVisible(false);
                break;

        }
    }
}

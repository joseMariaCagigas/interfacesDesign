/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos_interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VideoclubControlador implements ActionListener {

    private Videoclub videoclub;

    public VideoclubControlador(Videoclub videoclub) {
        this.videoclub = videoclub;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        PeliculaDialog dPelicula = new PeliculaDialog(videoclub,true);
        switch (comando) {
            case "Nuevo":
                dPelicula.muestraNueva();
                break;
            case "Abrir":
                dPelicula.muestraAbrir();
                break;
            case "Modificar":
                dPelicula.muestraModificar();
                break;
            case "Borrar":
                dPelicula.muestraBorrar();
                break;
        }
    }
}

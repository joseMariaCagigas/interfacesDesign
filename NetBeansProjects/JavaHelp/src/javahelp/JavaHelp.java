/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahelp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author El_Ma
 */
public class JavaHelp {

    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException {
        // Carga el fichero de ayuda
        File fichero = new File("/help/help_set.hs");
        URL hsURL = fichero.toURI().toURL();
        // Crea el HelpSet
        HelpSet helpset;
        helpset = new HelpSet(getClass().getClassLoader(), hsURL);

        HelpBroker hb = helpset.createHelpBroker();

        // Ayuda al hacer click en el JMenuItem itemAyuda. 
        hb.enableHelpOnButton(itemAyuda, "aplicacion", helpset);
        // Ayuda al pulsar F1 sobre la ventana principal 
        hb.en ableHelpKey
        (principal.getContentPane(), "ventana_principal", helpset
        );
        // Ayuda al pulsar F1 sobre la ventana secundaria 
        hb.enableHelpKey(secundaria.getContentPane(), "ventana_secundaria", helpset);
    }

}

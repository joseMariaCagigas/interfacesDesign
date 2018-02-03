package Parte_Grafica;

import javax.swing.JFrame;

public class Ventanas extends JFrame {
    
    
    public void creacionVentana(String titulo,int sizeX,int sizeY){  
        // Titulo de ventana
        this.setTitle(titulo);
        // Tamaño
        this.setSize(sizeX, sizeY);
        // Posicion en pantalla
        this.setLocation(200, 200);
    }
    
    
}

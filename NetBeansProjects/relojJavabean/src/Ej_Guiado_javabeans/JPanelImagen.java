package Ej_Guiado_javabeans;

import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelImagen extends JPanel implements Serializable {

    private ImagenFondo imagenFondo;

    public JPanelImagen() {
    }

    public ImagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(ImagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagenFondo.getRutaImagen() != null
                && imagenFondo.getRutaImagen().exists()) {
            ImageIcon imageIcon
                    = new ImageIcon(imagenFondo.getRutaImagen().getAbsolutePath());
            g.drawImage(imageIcon.getImage(), 0, 0, null);
        }

    }
}

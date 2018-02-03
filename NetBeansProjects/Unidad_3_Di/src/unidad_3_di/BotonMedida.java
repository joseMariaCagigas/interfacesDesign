package unidad_3_di;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

public class BotonMedida extends JButton implements MouseListener{


    public BotonMedida() {
        super();
        estableceAspecto();
    }

    public BotonMedida(String texto) {
        super(texto);
        estableceAspecto();
    }

    private void estableceAspecto() {
        setFont(new Font("Cooper Black", Font.PLAIN, 14));
        setForeground(Color.WHITE);
        setBackground(new Color(235, 204, 28));
        setBorderPainted(false);
        setFocusPainted(false);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        setBackground(new Color(255, 217, 3));
    }

    @Override
    public void mouseExited(MouseEvent me) {
        setBackground(new Color(235, 204, 28));
    }
    }
    


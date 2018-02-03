/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad_3_di;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

public class OtroBotonMedida extends JComponent implements MouseListener {

    private final Dimension medidas = new Dimension(90, 30);
    private final String texto;
    private boolean ratonDentro;

    public OtroBotonMedida(String texto) {
        this.texto = texto;
        addMouseListener(this);
    }

    @Override
    public Dimension getPreferredSize() {
        return medidas;
    }

    @Override
    public Dimension getMaximumSize() {
        return medidas;
    }

    @Override
    public Dimension getMinimumSize() {
        return medidas;

    }

    @Override
    protected void paintComponent(Graphics g) {
        if (ratonDentro) {
            g.setColor(Color.black);
            g.fillRect(0, 0, medidas.width, medidas.height);
            g.setColor(new Color(255, 217, 3));
            g.fillRect(3, 3, medidas.width - 6, medidas.height - 6);
            g.setColor(Color.white);
            setFont(new Font("Cooper Black", Font.PLAIN, 14));
            g.drawString(texto, 20, 20);
        } else {
            g.setColor(Color.black);
            g.fillRect(0, 0, medidas.width, medidas.height);
            g.setColor(new Color(235, 204, 28));
            g.fillRect(2, 2, medidas.width - 4, medidas.height - 4);
            g.setColor(Color.white);
            setFont(new Font("Cooper Black", Font.PLAIN, 14));
            g.drawString("Pulsar", 20, 20);
        }
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
        ratonDentro = true;
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent me) {
        ratonDentro = false;
        repaint();
    }
}

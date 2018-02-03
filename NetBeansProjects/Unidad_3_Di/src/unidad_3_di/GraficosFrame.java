package unidad_3_di;

import javax.swing.JFrame;

public class GraficosFrame extends JFrame {

    public GraficosFrame() {
        super("Graficos");
        add(new GraficosPanel());
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        GraficosFrame graficos = new GraficosFrame();
    }
}

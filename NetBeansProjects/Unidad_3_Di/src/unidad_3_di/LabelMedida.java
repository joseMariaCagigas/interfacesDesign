package unidad_3_di;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class LabelMedida extends JLabel {

    public LabelMedida(String texto) {
        super(texto);
        estableceAspecto();
    }

    public LabelMedida() {
        super();
        estableceAspecto();
    }

    private void estableceAspecto() {
        setFont(new Font("Cooper Black", Font.PLAIN, 14));
        setForeground(new Color(235, 204, 28));
    }
}

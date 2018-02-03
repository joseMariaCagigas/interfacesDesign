package relojchristianmuñozason;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

public class AlarmaPropertyEditorSupport extends PropertyEditorSupport {
    Propiedades panelalarma=new Propiedades();
    
    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return panelalarma;
    }

    @Override
    public String getJavaInitializationString() {
        
        Alarma alarma=panelalarma.getSelectedValue();
        return "new relojdigital.Alarma(\""+alarma.getHora()+"\",\""+alarma.getMinuto()+"\")";
    }

    @Override
    public Object getValue() {
       return panelalarma.getSelectedValue();
    }
    
}

package ejercicio_colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ejercicio_Colecciones {
    
    public static void main(String[] args) {
        
        String nombre;
        int ent;
        
        Collection colec1=new ArrayList();
        Iterator iterator=colec1.iterator();
        
        hijo obj;
        colec1.add(new hijo("Lara",32));
        colec1.add(new hijo("Ivan",32));
        colec1.add(new hijo("Vanessa",27));
        colec1.add(new hijo("Noelia",26));
        colec1.add(new hijo("Gustavo",35));

        
        Collection colec2=new ArrayList();
        Iterator iterator2=colec2.iterator();

        colec2.add(new hijo("Luis",32));
        colec2.add(new hijo("Jose",32));
        colec2.add(new hijo("Vanessa",27));
        colec2.add(new hijo("Gustavo",35));
        colec2.add(new hijo("Alvaro",26));
        
        while ((iterator.hasNext()== true )&&(iterator2.hasNext()== true)){
            
        }
    }
    
}

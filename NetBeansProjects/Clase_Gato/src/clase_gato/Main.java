package clase_gato;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws IOException {
        String nombre = null;
        boolean Seguir = false, Error1 = false;
        int opc = 1;
        
        // Nuevo Random
        // Numero Entre 1 y 100
        //el 100 es porque el math.random da valores comprendidos entre 1,00 y 0.00
        int x = (int) (Math.random() * 100);
        
        // Buffer Reader Obligatorio Ponerlo
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);

        //Arraylist
        ArrayList<Gatos> Array_Gatito = new ArrayList();
        
        while (Seguir == false) {
        
        System.out.println("--------------------Menu----------------------");
        System.out.println("Dale a Una Opcion: ");
        System.out.println("\t 1. Crear Gatito");
        System.out.println("\t 2. Crear Gato Paria");
        System.out.println("\t 3. Matar Gatito");
        System.out.println("\t 4. Dar De Comer");
        System.out.println("\t 5. Consultar Base De Datos De Gatitos Vivos");
        System.out.println("\t 6. Jugar Con Un Gatete");
        System.out.println("\t 7. Salir De La Aplicacion");
        System.out.println("-----------------------------------------------");

            
            //------------------------Ejemplo Excepciones---------------------------
            // NumberFormatException = Se esperaba numero y metiste letra
            // 
            //----------------------------------------------------------------------
            
            do {
                // meter variable Error1 Que es control SIEMPRE dentro del try porque da un error chungo y se pasa
                // por el forro lo que le pongas debajo del do y arriba del catch 
            try {
                opc = Integer.parseInt(teclado.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Pon Solo Numeros ¬¬");
                Error1 = true;
                
            }
                }while (Error1 == true);   
        

            switch (opc) {
                // ---------------------------Acabado-------------------------
                case 1:
                    // Crear un arraylist que ya esta creado xD
                    // Que contenga 0 gatos y al meterse en este apartado le cree/meta 1
                    // En el array y asi sucesivamente
                    
                    System.out.println("Como Se Va a Llamar El Gatito");
                    try {
                        nombre = teclado.readLine();
                    } catch (IOException e) {

                    }

                    //Objeto.add (new Archivo_Externo.java(Atributos En ORDEN))
                    Array_Gatito.add(new Gatos(nombre, 3, true));

                    break;

                case 2:
                    //Empleado empleado3 = new Empleado(empleado2);
                    System.out.println("Como Se Va a Llamar El Gatito");
                    try {
                        nombre = teclado.readLine();
                    } catch (IOException e) {

                    }
                    
                    Array_Gatito.add(new Gatitos_Paria(nombre, 3, true, true));
                    
                    // Ejemplo For Each
                    // for (Objeto que meti al array) lo de new [[[GATOS]]] Variable Donde se guarda lo que saca : Nombre_Array)
                    break;
                    
                case 3: // Meter parametro False Para representar que esta muerto

                    System.out.println("¿ A Que Gatito Quieres Matar ? :(");
                    try {
                        nombre = teclado.readLine();
                    } catch (IOException e) {

                    }
                    
                    // for (Objeto que meti al array) lo de new [[[GATOS]]] Variable Donde se guarda lo que saca : Nombre_Array)
                    
                    for (Gatos Objeto_Sacado1 : Array_Gatito) {
                        
                        // if (Variable.metodo().es igual a variable
                        //if (Objeto_Sacado1.getVivo()== true){  Esta Seria la forma de hacerlo con booleanos
                        
                        if (Objeto_Sacado1.getNombre().equals(nombre)) {
                            Objeto_Sacado1.MatarMinino();
                            System.out.println("El Gatito: " + Objeto_Sacado1.getNombre() + " Murio D;");
                        }
                    }
                    
                    break;

                case 4:
                    // Setear Energia + 3 a un gato elegido

                    System.out.println("¿ Como Se Llama El Gatito Que Quieres Dar De Comer ?");
                    try {
                        nombre = teclado.readLine();
                    } catch (IOException error) {

                    } 
                    
                    
                    //-----------Forma Pro-------------
                    // For Each
                    // for (Objeto que meti al array) lo de new [[[GATOS]]] Variable Donde se guarda lo que saca : Nombre_Array)
                    
                    for (Gatos Objeto_Sacado : Array_Gatito) {

                        //if (Variable( <-- Objeto_Sacado).metodo().es igual a variable)
                        
                        if (Objeto_Sacado.getNombre().equals(nombre)) {
                            Objeto_Sacado.Dar_De_Comer();
                            Objeto_Sacado.Agradecer();
                        }
                    }
                    
                    // -----------Forma Rapida------------
                    // Nombre Array.get(Posicion Array).Metodo();
                    // Array_Gatito.get(0).Dar_De_Comer();
                    
                    break;
                    
                case 5: // Mostrar los nombres de todos los gatos actualmente vivos
                    
                    //-----------For (Cats Approved)--------------
                    // Le Falta Lo Del if Pero Asi Sería 
                    // if (Variable.metodo().es igual a variable
                    //if (Objeto_Sacado1.getVivo()== true){  Esta Seria la forma de hacerlo con booleanos
                    //for (int i = 0 ; i < Array_Gatito.size();i++ ){
                    //    System.out.println(Array_Gatito.get(i));
                    //}
                    
                    //---------------iterator (Cats Approved)---------------
                    //Iterator<Gatos> Recoredor_De_Listas2=Array_Gatito.iterator();
                        // nombre iterator.next Para que pase a la siguiente posicion
                        // if (Variable.metodo().es igual a variable
                    //if (Objeto_Sacado1.getVivo()== true){  Esta Seria la forma de hacerlo con booleanos
                    
                    
                    // for (Objeto que meti al array) lo de new [[[GATOS]]] Variable Donde se guarda lo que saca : Nombre_Array)
                    
                    for (Gatos Objeto_Sacado3 : Array_Gatito) {
                        if (Objeto_Sacado3.getVivo() == true) {
                            System.out.println(Objeto_Sacado3.toString());
                        }
                    }
                    
                    break;
                    
                case 6: // Jugar Con un Gatito Seleccionado y que le quite 1 de Energia
                    System.out.println("¿ Con Que Gatito Quieres Jugar :D ?");
                    
                    // while (Error = true){
                    
                    
                    try {
                        nombre = teclado.readLine();
                    } catch (IOException error) {
                    
                    } 
                    
                    
                    
                    for (Gatos Objeto_Sacado3 : Array_Gatito) {
                        if (Objeto_Sacado3.getNombre().equals(nombre)) {
                            if (Objeto_Sacado3.getEnergia() < 2){
                                Objeto_Sacado3.TieneHambre();
                            }else{
                            Objeto_Sacado3.Jugar();
                            }
                        }
                    }

                    break;

                case 7:// Salir
                    Seguir = true;

                    break;
            }// Fin Switch
        }// Fin While
            
        // Salir Del programa
        Gatos.Salir();
    }

}
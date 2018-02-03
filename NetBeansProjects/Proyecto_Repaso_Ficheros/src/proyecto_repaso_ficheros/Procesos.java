package proyecto_repaso_ficheros;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Procesos {

    public Procesos() {

    }

    static void Alta_Empleados() throws IOException {
        FileOutputStream fos;
        ObjectOutputStream oos;

        String Nombre_Archivo = "Empleados.txt";
        File archivo = new File(Nombre_Archivo);

        int Codigo = PedirDatos_Statica.Numero_Int("Introduce El Codigo Del Empleado: ");
        String Nombre = Validar_Nombre();
        String Departamento = Validar_Dep();

        Empleados empleado = new Empleados(Codigo, Nombre, Departamento);

        if (archivo.length() != 0) {
            fos = new FileOutputStream(archivo, true);
            oos = new MiObjectOutputStream(fos);
            oos.writeObject(empleado);
        } else {
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(empleado);
        }

        fos.close();
        oos.close();
    }

    static String Validar_Dep() throws IOException {

        String Departamento;
        boolean Seguir = false;

        do {
            Departamento = PedirDatos_Statica.Leer_String("Introduce El Departamento: ");
            if (Departamento.equalsIgnoreCase("Ventas") || Departamento.equalsIgnoreCase("Administracion")|
                    Departamento.equalsIgnoreCase("Produccion")) {
                
                Seguir = true;
            } else {
                System.err.println("Nombre De Departamento No Valido");
                Seguir = false;
            }

        } while (Seguir == false);

        return Departamento;
    }
    
    static String Validar_Nombre() throws IOException{
        String Nombre;
        boolean Seguir = false;
        
        do{
        Nombre = PedirDatos_Statica.Leer_String("Introduce El Nombre Del Empleado: ");
        
        if (Nombre.matches("[A-Z]{1}[a-z]*")){
            Seguir = true;
        } else{
            System.err.println("El Nombre Del Empleado Es Incorrecto Debe Empezar Por Una Mayuscula");
        }
        
        
        
        } while (Seguir == false);
        
        return Nombre;
    }

    static void Listar_Empleados() throws IOException, ClassNotFoundException {
        File archivo = new File("Empleados.txt");

        if (archivo.exists() == false) {
            System.out.println("No Existe El Fichero...");
        } else {

            ObjectInputStream ois;

            FileInputStream fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            try {
                while (true) {
                    Empleados empleado = (Empleados) ois.readObject();
                    System.out.println(empleado.toString());
                }

            } catch (EOFException eof) {

            }

            ois.close();
        }
    }

    static void Buscar_Empleados() throws IOException, ClassNotFoundException {
        boolean Encontrado = false;

        PedirDatos leer = new PedirDatos();

        File archivo = new File("Empleados.txt");

        String Departamento = PedirDatos_Statica.Leer_String("Introduce El Departamento: ");

        if (archivo.exists() == false) {
            System.out.println("No Existe El Fichero...");
        } else {

            ObjectInputStream ois;

            FileInputStream fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            try {
                while (true) {
                    Empleados empleado = (Empleados) ois.readObject();

                    if (Departamento.equalsIgnoreCase(empleado.getDepartamento())) {
                        System.out.println(empleado.toString());
                        Encontrado = true;
                    }
                }

            } catch (EOFException eof) {

            }

            ois.close();

            if (Encontrado == false) {
                System.out.println("No se Encontraron Departamentos Con Ese Nombre.");
            }
        }

    }

    static void Borrar_Empleado() throws FileNotFoundException, IOException, ClassNotFoundException {
        int Codigo;
        Boolean encontrado = false;
        File archivo = new File("Empleados.txt");
        File archivo2 = new File("Empleados2.txt");

        if (archivo.exists()) {

            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);

            FileOutputStream fos;
            ObjectOutputStream oos;

            Codigo = PedirDatos_Statica.Numero_Int("Introduce codigo del empleado a borrar");

            try {
                while (true) {
                    Empleados empleado = (Empleados) ois.readObject();

                    if (empleado.getCodigo() != Codigo) {

                        if (archivo2.exists()) {
                            fos = new FileOutputStream(archivo2, true);
                            oos = new MiObjectOutputStream(fos);
                        } else {
                            fos = new FileOutputStream(archivo2);
                            oos = new ObjectOutputStream(fos);
                        }

                        oos.writeObject(empleado);
                        oos.close();
                        fos.close();

                    } else {
                        System.out.println("Empleado borrado");
                        encontrado = true;
                    }
                }

            } catch (EOFException eof) {
                ois.close();
                fis.close();
            }

            if (encontrado == false) {
                System.out.println("No existe empleado con ese codigo");
            }

            archivo.delete();
            archivo.renameTo(archivo2);
        } else {
            System.err.println("No existe fichero de datos");
        }
    }

    static String Borrar_Fichero() throws IOException {

        String archivo = PedirDatos_Statica.Leer_String("Introduce El Nombre y Extension Del Fichero a Borrar: ");

        File Archivo_borrar = new File(archivo);

        if (Archivo_borrar.exists()) {
            Archivo_borrar.delete();
            return "Fichero " + archivo + " Borrado Satisfactoriamente ";
        } else {
            return "Fichero No Encontrado";
        }
    }

    static void Salir() {
        System.exit(0);
    }
}

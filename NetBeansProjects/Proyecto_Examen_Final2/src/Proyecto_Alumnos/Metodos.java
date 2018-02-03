package Proyecto_Alumnos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Metodos {

    Alumno Alumno_Standar, Alumno_Doctorado;

    public Metodos() {

    }

    Alumno Anadir_Alumno() throws IOException {

        String Nombre = PedirDatos_Statica.Leer_String_Sin_Numeros("Nombre Del Alumno: ");
        String Apellido = PedirDatos_Statica.Leer_String_Sin_Numeros("Apellido Del Alumno: ");
        String Codigo_alumno = PedirDatos_Statica.Leer_String("Codigo Del Alumno: ");

        String Tipo_Alumno = PedirDatos_Statica.Leer_String_Sin_Numeros("¿ Que Tipo De Alumno Desea Anadir ? Doctorado o Standar: ");

        if (Tipo_Alumno.equalsIgnoreCase("Doctorado")) {

            int Cuantos_Cursos = PedirDatos_Statica.Numero_Int("Cuantos Cursos Matriculados: ");
            Alumno alumno = new Alumno_Doctorado(new Identidad(Nombre, Apellido), Codigo_alumno, Cuantos_Cursos);
            return alumno;

        } else {

            String Num_Curso = PedirDatos_Statica.Leer_String("Curso Que Va a Hacer 1º,2º,3º,4º ");
            Alumno alumno = new Alumno_Standar(new Identidad(Nombre, Apellido), Codigo_alumno, Num_Curso);
            return alumno;
        }

    }

    public void Listar_Alumnos(ArrayList<Alumno> Array_Alumno) {
        if (Array_Alumno.isEmpty()) {
            System.err.println("No Hay Ningun Alunmno ¬¬");
        } else {

            for (Alumno Objeto_Sacado : Array_Alumno) {
                System.out.println(Objeto_Sacado.toString());
            }
        }
    }

    public void Consultar_Tasa(ArrayList<Alumno> Array_Alumno) throws IOException {
        if (Array_Alumno.isEmpty()) {
            System.err.println("No Hay Ningun Alunmno ¬¬");
        } else {

            String Codigo = PedirDatos_Statica.Leer_String("Introduce El Codigo Del Alumno Que Desea Buscar");

            for (Alumno Objeto_Sacado : Array_Alumno) {
                if (Objeto_Sacado.getCodigoAlumno().equals(Codigo)) {
                    System.out.println("La Tasa Del Alumno: " + Objeto_Sacado.getId() + " Son: " + Objeto_Sacado.calcularTasas());
                }
            }
        }
    }

    public void Borrar_Alumno(ArrayList<Alumno> Array_Alumno) throws IOException {
        if (Array_Alumno.isEmpty()) {
            System.out.println("No Hay Ningun Alunmno ¬¬");
        } else {
            String Nombre = PedirDatos_Statica.Leer_String("Que alumno Quieres Borrar: ");
            Alumno al = new Alumno_Doctorado(new Identidad(Nombre, ""), "", 0);

            if (Array_Alumno.contains(al)) {
                Array_Alumno.remove(al);
            }

        }
    }

    public void Mostrar_Ingresos(ArrayList<Alumno> Array_Alumno) {
        if (Array_Alumno.isEmpty()) {
            System.out.println("No Hay Ningun Alunmno ¬¬");
        } else {
            double Tasas = 0;
            for (Alumno Objeto_Sacado : Array_Alumno) {
                Tasas = Tasas + Objeto_Sacado.calcularTasas();
            }
            System.out.println("Ingresos: " + Tasas);
        }

    }

    public void Salir() {

        System.exit(0);
    }

//    public void Guardar_Array(ArrayList<Alumno> Array_Alumno){
//        
//        Array_Alumno.
//    }
    //ArrayList<Alumno> Array_Alumno
//    static void Leer_Fichero(String Nombre_Archivo) throws IOException, FileNotFoundException, ClassNotFoundException{
//                File archivo = new File(Nombre_Archivo);
//        if (archivo.exists())
//            Leer_Fichero_Existe(Nombre_Archivo);
//        else {
//
//        }
//        }
//    }
    static ArrayList<Alumno> Leer_Fichero_Existe(String Nombre_Archivo) throws FileNotFoundException, IOException, ClassNotFoundException {

        File archivo = new File(Nombre_Archivo);

        FileInputStream fis = new FileInputStream(archivo);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Alumno> Array_Alumno = (ArrayList<Alumno>) ois.readObject();

        fis.close();
        ois.close();

        return Array_Alumno;
    }

    static ArrayList<Alumno> Leer_Fichero_No_Existe(String Nombre_Archivo) {
        ArrayList<Alumno> Array_Alumno = new ArrayList<Alumno>();
        return Array_Alumno;
    }

    static void Guardar_Fichero(String Nombre_Archivo, ArrayList<Alumno> Array_Alumno) throws FileNotFoundException, IOException {

        File archivo = new File(Nombre_Archivo);
        FileOutputStream fos = new FileOutputStream(archivo);
        ObjectOutputStream oss = new ObjectOutputStream(fos);

        oss.writeObject(Array_Alumno);

        fos.close();
        oss.close();

    }

}

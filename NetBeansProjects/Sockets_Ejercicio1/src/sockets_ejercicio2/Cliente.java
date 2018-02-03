package sockets_ejercicio2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Cliente {

    public static void main(String[] args) throws IOException {
        //Socket
        Socket canalComunicacion = null;
        canalComunicacion = new Socket("127.0.0.1", 1500);

        // Salida De Datos
        OutputStream bufferSalida;
        DataOutputStream datosSalida;

        bufferSalida = canalComunicacion.getOutputStream();
        datosSalida = new DataOutputStream(bufferSalida);

        String archivoRecibir = PedirDatos_Statica.Leer_String("Introduce La Ruta Del Archivo a Recibir: ");

        datosSalida.writeUTF(archivoRecibir);

        // Entrada De Datos
        InputStream bufferEntrada;
        DataInputStream datosEntrada;

        bufferEntrada = canalComunicacion.getInputStream();
        datosEntrada = new DataInputStream(bufferEntrada);

        System.out.println("Contenido Del Archivo:");
        String stringEntrante;
        try {
            while (!(stringEntrante=datosEntrada.readUTF()).equalsIgnoreCase("Acabe")) {
                System.out.println(stringEntrante);
            }
        } catch (Exception e) {
        }

        bufferEntrada.close();
        datosEntrada.close();
        
        bufferSalida.close();
        datosSalida.close();

    }
}

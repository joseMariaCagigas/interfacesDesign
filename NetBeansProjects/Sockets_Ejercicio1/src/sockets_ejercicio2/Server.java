package sockets_ejercicio2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import sun.security.pkcs11.wrapper.Constants;

public class Server {

    public static void main(String[] args) {

        try {
            String ficheroPedido;
            
            byte[] bytesArchivo = new byte[1024];
            int in;
            
            //Socket
            ServerSocket puerto = null;
            Socket canalComunicacion = null;

            puerto = new ServerSocket(1500);
            canalComunicacion = puerto.accept();

            // Entrada De Datos
            InputStream bufferEntrada;
            DataInputStream datosEntrada;

            bufferEntrada = canalComunicacion.getInputStream();
            datosEntrada = new DataInputStream(bufferEntrada);
            
            // Salida De Datos


            ficheroPedido=datosEntrada.readUTF();
            
            File archivo = new File(ficheroPedido);
            
            OutputStream bufferSalida;
            DataOutputStream datosSalida;
            
            bufferSalida = canalComunicacion.getOutputStream();
            datosSalida = new DataOutputStream(bufferSalida);
            
            
            
            
                    // Deficinion De Variables
        String Strings_Dentro;

        // Creamos El Objeto Para Leer De Ficheros
        BufferedReader leer_fichero = new BufferedReader(new FileReader(archivo));

        try {
            // Mientras La siguiente linea no sea nula sacamos la String 
            while ((Strings_Dentro = leer_fichero.readLine()) != null) {
                // Imprimimos en pantalla la String Sacada
                datosSalida.writeUTF(Strings_Dentro);
            }
            datosSalida.writeUTF("Acabe");

            // Capturamos Excepciones
        } catch (IOException error) {
            System.out.println("Hubo Un Error De Escritura O_o");
        }

        // Cerramos flujos
        leer_fichero.close();
            
        bufferEntrada.close();
        bufferSalida.close();
        
        datosEntrada.close();
        datosSalida.close();
            

        } catch (IOException ex) {

        }
    }

}

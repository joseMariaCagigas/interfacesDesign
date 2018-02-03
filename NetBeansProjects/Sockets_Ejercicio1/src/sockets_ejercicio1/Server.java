package sockets_ejercicio1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {

    public static void main(String[] args) {

        boolean acertado = false;
        try {

            //Socket
            ServerSocket puerto = null;
            Socket canalComunicacion = null;
            
            puerto = new ServerSocket(2000);
            canalComunicacion = puerto.accept();
            
            // Entrada De Datos
            InputStream bufferEntrada;
            DataInputStream datosEntrada;
            
            bufferEntrada = canalComunicacion.getInputStream();
            datosEntrada = new DataInputStream(bufferEntrada);
            
            // Salida De Datos
            OutputStream bufferSalida;
            DataOutputStream datosSalida;
            
            bufferSalida = canalComunicacion.getOutputStream();
            datosSalida = new DataOutputStream(bufferSalida);

            // Numero Random
            Random random = new Random();
            int numeroSecreto = random.nextInt(9) + 1;

            while (acertado == false) {
                int datosRecibidos = datosEntrada.readInt();

                //menor
                if (datosRecibidos < numeroSecreto) {
                    datosSalida.writeUTF("El Numero Secreto es Mayor De: "+datosRecibidos);
                }
                //mayor
                if (datosRecibidos > numeroSecreto) {
                    datosSalida.writeUTF("El Numero Secreto es Menor De: "+datosRecibidos);
                }
                
                // Acertaste
                if (datosRecibidos == numeroSecreto) {
                    datosSalida.writeUTF("Acertaste El Numero !!");
                    acertado=true;
                }
                
                
                
            }
            
            datosEntrada.close();
            bufferEntrada.close();
            
            datosSalida.close();
            bufferSalida.close();
            canalComunicacion.close();
        } catch (IOException ex) {

        }
    }

}

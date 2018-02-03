package sockets_ejercicio1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;



public class Cliente {

    public static void main(String[] args) {
        
        try {
            //Varibales
            String ganado;
            boolean salir=false;
            
            //Socket
            Socket canalComunicacion = null;
            String Javi="192.168.37.10",miOrde="127.0.0.1";
            
            canalComunicacion = new Socket(miOrde, 2000);
            
            // Salida De Datos
            OutputStream bufferSalida;
            DataOutputStream datosSalida;
            
            bufferSalida = canalComunicacion.getOutputStream();
            datosSalida = new DataOutputStream(bufferSalida);
            
            // Entrada De Datos
            InputStream bufferEntrada;
            DataInputStream datosEntrada;
            
            bufferEntrada = canalComunicacion.getInputStream();
            datosEntrada = new DataInputStream(bufferEntrada);
            
            do {
                
                int mensaje = PedirDatos_Statica.Numero_Int("Introduce El Numero Secreto: ");
                
                datosSalida.writeInt(mensaje);
                
                ganado = datosEntrada.readUTF();
                
                if (ganado.equalsIgnoreCase("Acertaste El Numero !!")) {
                    salir = true;
                    
                } 
                System.out.println(ganado);
                
            } while (!salir);
            
            
            
            
            
            datosSalida.close();
            datosEntrada.close();
            
            bufferSalida.close();
            canalComunicacion.close();
        } catch (UnknownHostException ex) {
           System.out.println("Error");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}

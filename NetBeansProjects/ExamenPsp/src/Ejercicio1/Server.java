package Ejercicio1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rocio
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            final int PORT = 6666;
            ServerSocket svr; // Habilita conexión servidor
            Socket sc; // Guarda conexión/direccion cliente
            svr = new ServerSocket(PORT);

            while (true) {

                System.out.println("Servidor espera petición conexión del cliente");
                sc = svr.accept();
                System.out.println("Conexión entrante aceptada");
                new ConexClient(sc).start();

            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static class ConexClient extends Thread {

        DataInputStream in;
        DataOutputStream out;

        public ConexClient(Socket sc) {
            try {
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void run() {
            doSomeThing();
        }

        public void doSomeThing() {

            try {
                while (true) {
                    out.writeUTF(in.readUTF().toUpperCase());
                }
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
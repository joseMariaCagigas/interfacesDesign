package Ejercicio1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rocio
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final String HOST = "localhost";
        final int PORT = 6666;
        final Socket sc;
        DataOutputStream out;
        DataInputStream in;
        BufferedReader board = new BufferedReader(new InputStreamReader(System.in));
        try {
            sc = new Socket(HOST, PORT);
            out = new DataOutputStream(sc.getOutputStream());
            in = new DataInputStream(sc.getInputStream());
            while (sc.isConnected()) {
                System.out.println("Introduzca texto:");
                String str = board.readLine();
                out.writeUTF(str);
                System.out.println(in.readUTF());
            }
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
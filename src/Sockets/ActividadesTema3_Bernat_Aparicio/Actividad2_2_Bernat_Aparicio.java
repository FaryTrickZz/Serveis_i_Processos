package Sockets.ActividadesTema3_Bernat_Aparicio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Actividad2_2_Bernat_Aparicio {

    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket(5555);

            InetSocketAddress addr = new InetSocketAddress("localhost", 5555);

            Socket newSocket = serverSocket.accept();

            InputStream is = newSocket.getInputStream();

            OutputStream os = newSocket.getOutputStream();

            byte[] missatge = new byte[25];

            is.read(missatge);

            String str = new String(missatge);

            System.out.println(str);

            newSocket.close();

            serverSocket.close();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}

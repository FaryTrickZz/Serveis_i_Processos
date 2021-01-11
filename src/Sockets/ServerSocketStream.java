package Sockets;

import java.io.*;

import java.net.*;

 class ServeridorSocketStream {

    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket();

            InetSocketAddress addr = new InetSocketAddress("localhost", 5555);

            Socket newSocket = serverSocket.accept();

            InputStream is = newSocket.getInputStream();

            OutputStream os = newSocket.getOutputStream();

            byte[] missatge = new byte[25];

            is.read(missatge);

            newSocket.close();

            serverSocket.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
package Sockets;
import java.io.*;

import java.net.*;

class ClienteSocketStream {

    public static void main(String[] args) {

        try {

            Socket clientSocket = new Socket();

            InetSocketAddress addr = new InetSocketAddress("localhost", 5555);

            clientSocket.connect(addr);

            InputStream is = clientSocket.getInputStream();

            OutputStream os = clientSocket.getOutputStream();

            String missatge = "missatge des del client";

            os.write(missatge.getBytes());

            clientSocket.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
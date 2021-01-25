package Sockets.ActividadesTema3_Bernat_Aparicio;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Actividad1_Bernat_Aparicio {

    public static void main(String[] args) {

        try {

            FileReader fr = new FileReader("/home/alumnes/2001/baparicio/IdeaProjects/Serveis_i_Processos/src/Sockets/ActividadesTema3_Bernat_Aparicio/Actividad1");


            Socket clientSocket = new Socket();

            InetSocketAddress addr = new InetSocketAddress("localhost", 5555);

            clientSocket.connect(addr);

            InputStream is = clientSocket.getInputStream();

            OutputStream os = clientSocket.getOutputStream();

            int i;
            int x = 0;
            char[] mensajeArray = new char[20];
            while ((i=fr.read()) != -1){
                mensajeArray[x] = (char) i;
                x++;
            }

            String mensaje = String.valueOf(mensajeArray);

            os.write(mensaje.getBytes());

            clientSocket.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}

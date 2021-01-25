package Sockets.ActividadesTema3_Bernat_Aparicio;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Actividad2_Bernat_Aparicio {

    public static void conexion(String pregunta) {
        try {

            Socket clientSocket = new Socket();

            InetSocketAddress addr = new InetSocketAddress("localhost", 5555);

            clientSocket.connect(addr);

            InputStream is = clientSocket.getInputStream();

            OutputStream os = clientSocket.getOutputStream();

            String mensaje = pregunta;

            os.write(mensaje.getBytes());

            clientSocket.close();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        conexion("Com et dius?");
        //conexion("Quantes linies de codi tens?");
        //conexion("Cuantos años tienes?");

    }

}

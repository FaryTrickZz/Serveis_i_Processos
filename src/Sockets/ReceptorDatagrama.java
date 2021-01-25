package Sockets;

import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceptorDatagrama {

    public static void main(String[] args){

            try {

                //Creamo el datagramSocket
                DatagramSocket datagramSocket = new DatagramSocket(5555);

                //Creamos la variable que almacenará la peticion
                byte[] bufer = new byte[1000];

                while (true) {

                    // Construimos el DatagramPacket para recibir peticiones
                    DatagramPacket peticion = new DatagramPacket(bufer, bufer.length);

                    // Leemos una petición del DatagramSocket
                    datagramSocket.receive(peticion);

                    System.out.print("Datagrama recibido del host: " + peticion.getAddress());

                    System.out.println(" \ndesde el puerto remoto: " + peticion.getPort());

                    // Construimos el DatagramPacket para enviar la respuesta
                    DatagramPacket respuesta = new DatagramPacket(peticion.getData(), peticion.getLength(), peticion.getAddress(), peticion.getPort());

                    // Enviamos la respuesta, que es un eco
                    datagramSocket.send(respuesta);
                    }
                } catch (SocketException e) {
                System.out.println("Socket: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("IO: " + e.getMessage());
            }


    }
}

package Sockets;

import java.io.*;

import java.net.*;

public class EmisorDatagrama {

    public static void main(String[] args){

        try {

            //Creamos el dataGramSocket que enviara el mensaje
            DatagramSocket datagramSocket = new DatagramSocket();

            //Creamos el mensaje
            String missatge = "missatge desde el emisor";

            //Creamos la addr del server que recibira el mensaje
            InetAddress addr = InetAddress.getByName("localhost");

            //Creamos el datgrama
            DatagramPacket datagrama = new DatagramPacket(missatge.getBytes(), missatge.getBytes().length, addr, 5555);

            //Lo enviamos
            datagramSocket.send(datagrama);

            //Finalmente recibimos el mensaje de nuevo
            datagramSocket.receive(datagrama);

            datagramSocket.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}

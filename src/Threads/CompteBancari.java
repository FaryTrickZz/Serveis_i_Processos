package Threads;

import java.util.concurrent.Semaphore;

public class CompteBancari extends Thread {
    //Variabels
    private static int compteBancari = 1000;
    private int usuari;

    //Constructor
    public CompteBancari(int usuari) {
        this.usuari = usuari;
    }

    //Llamamos al metodo para actualizar la cuenta bancaria
    @Override
    public void run() {
        actualizarCompte(usuari);
    }

    //Mediante el synchronized los hilos se ejecutan de 1 en 1
    private void actualizarCompte(int usuari) {
        if (usuari == 1) {
            compteBancari = compteBancari - 20;
        } else if (usuari == 2) {
            compteBancari = compteBancari - 50;
        } else if (usuari == 3) {
            compteBancari = compteBancari - 100;
        } else if (usuari == 4) {
            compteBancari = compteBancari + 20;
        } else if (usuari == 5) {
            compteBancari = compteBancari + 50;
        } else if (usuari == 6) {
            compteBancari = compteBancari + 100;
        }
        System.out.println(compteBancari);
    }


    public static void main(String[] args){
        //Creacion de hilos y ejecucion de estos mismos
        CompteBancari u1 = new CompteBancari(1);
        CompteBancari u2 = new CompteBancari(2);
        CompteBancari u3 = new CompteBancari(3);
        CompteBancari u4 = new CompteBancari(4);
        CompteBancari u5 = new CompteBancari(5);
        CompteBancari u6 = new CompteBancari(6);

        u1.start();
        u2.start();
        u3.start();
        u4.start();
        u5.start();
        u6.start();
    }

}

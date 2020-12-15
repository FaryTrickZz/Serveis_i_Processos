package Threads;

import java.util.concurrent.Semaphore;

public class SumaResta extends Thread{
    public static int numero = 10;
    public String tipo = "";
    static Semaphore semaphore = new Semaphore(1);
    static SumaResta[] array = new SumaResta[20];

    public SumaResta(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            switch (tipo) {
                case "suma":
                    numero++;
                    System.out.println(numero);
                case "resta":
                    numero--;
                    System.out.println(numero);
            }
            semaphore.release();
        } catch (InterruptedException e) {
            semaphore.release();
        }


    }


    public static void main(String args[]) {
        for(int i = 0;i < 20; i++) {
            if(i%2 == 0){
                SumaResta objeto = new SumaResta("suma");
                array[i] = objeto;
            } else {
                SumaResta objeto = new SumaResta("resta");
                array[i] = objeto;
            }

        }
        array[0].start();
        array[1].start();
        array[2].start();
        array[3].start();
        array[4].start();
        array[5].start();
        array[6].start();
        array[7].start();
        array[8].start();
        array[9].start();
        array[10].start();
        array[11].start();
        array[12].start();
        array[13].start();
        array[14].start();
        array[15].start();
        array[16].start();
        array[17].start();
        array[18].start();
        array[19].start();

    }
}

package Threads;

public class FilNumerosLletres implements Runnable{
    //Creaccion de variable
    private int tipo;

    //Contrusctor
    public FilNumerosLletres(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        //Mediante un switch dependiendo del tipo que se haya creado el Hilo, printearemos del 0 al 30 o de la A/Z
        switch(tipo) {
            case 1:
                for(int i=0;i<=30;i++) {
                    System.out.println(i);
                }
                break;
            case 2:
                for(char i = 'a';i<='z';i++) {
                    System.out.println(i);
                }
                break;
        }
    }

    public static void main(String[] args) {
        //Instanciamos dos objetos, con el tipo 1 o 2
        FilNumerosLletres lletres = new FilNumerosLletres(1);
        FilNumerosLletres numeros = new FilNumerosLletres(2);

        //Instanciamos dos hilos y los llamamos
        Thread filLletres = new Thread(lletres);
        Thread filNums = new Thread(numeros);

        filLletres.start();
        filNums.start();

    }
}


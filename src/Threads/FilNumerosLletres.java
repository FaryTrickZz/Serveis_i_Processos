package Threads;

public class FilNumerosLletres implements Runnable{

    private int tipo;

    public FilNumerosLletres(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
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
        FilNumerosLletres lletres = new FilNumerosLletres(1);
        FilNumerosLletres numeros = new FilNumerosLletres(2);

        Thread filLletres = new Thread(lletres);
        Thread filNums = new Thread(numeros);

        filLletres.start();
        filNums.start();

    }
}


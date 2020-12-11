import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Mayusculas_Bernat_Aparicio {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Process hijo = new ProcessBuilder("/home/alumnes/2001/baparicio/Escriptori/aMayusculas").start();
        BufferedReader br = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
        PrintStream ps = new PrintStream(hijo.getOutputStream());

        //Mediante un scanner le pasamos la palabra al hijo
        ps.println(sc.nextLine());
        //Limpiamos el buffer
        ps.flush();

        //En un print utilizamos el metodo br.readLine() para leer la salido del hijo
        System.out.println(br.readLine());

        System.out.println("El programa va a finalizar");

        //Destruimos el hijo al cabar el programa
        hijo.destroy();
    }
}

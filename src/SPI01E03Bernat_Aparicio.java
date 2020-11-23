import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class SPI01E03Bernat_Aparicio {

    public static void main(String[] args) throws IOException {
        String line ="";
        Scanner sc = new Scanner(System.in);
        Process hijo = new ProcessBuilder("C://Users//imoji//OneDrive//Escritorio 1//Aleatoris.exe").start();
        BufferedReader br = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
        PrintStream ps = new PrintStream(hijo.getOutputStream());

        String espacio = "";
        do {

            espacio = sc.nextLine();

            ps.println();
            ps.flush();
            line = br.readLine();
            System.out.println(line);

        } while (!line.equals("4"));
        System.out.println("El programa va a finalizar");
        hijo.destroy();
    }
}

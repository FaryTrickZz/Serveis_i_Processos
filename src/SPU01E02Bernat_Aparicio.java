import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class SPU01E02Bernat_Aparicio {

    public static void ejecutarHijo(String ruta) throws IOException {
        Process hijo = new ProcessBuilder(ruta).start();
        BufferedReader br = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
        PrintStream ps = new PrintStream(hijo.getOutputStream());
        ps.println(); //No es necesario escribir nada
        ps.flush(); // Asegura que los datos se han enviado
        String line = br.readLine();
        System.out.println(line);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String x = " ";
        do {
            ejecutarHijo("C://Users//imoji//OneDrive//Escritorio 1//Aleatoris.exe");
            x = sc.nextLine();

        } while (!x.equals("fi"));
    }
}

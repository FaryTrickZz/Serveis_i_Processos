import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class SPU01E02_fillBernat_Aparicio {
    public static void ejecutarFill(String ruta){
        try{
            Runtime aplicacion = Runtime.getRuntime();
            Process p = aplicacion.exec(ruta);
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            PrintStream ps = new PrintStream(p.getOutputStream());
            ps.flush();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SPU01E02_fillBernat_Aparicio lp = new SPU01E02_fillBernat_Aparicio();
        String aux = "";
        do {
            aux = sc.nextLine();
            lp.ejecutarFill("/home/alumnes/2001/baparicio/Escriptori/Aleatori");

        } while (aux != "fi");
    }

}

import java.io.IOException;

public class TestKahoot {

    public static void main(String[] args) {
        if (args.length <= 0) {
            System.err.println("Se necessita un programa a executar");
            System.exit(-1);
        }

        Runtime runtime = Runtime.getRuntime();
        try {
            Process process = runtime.exec("clac.exe");
            process.destroy();
        }catch(IOException ex){
            System.err.println("Excepció de E/S!!");
            System.exit(-1);
        }
    }
}






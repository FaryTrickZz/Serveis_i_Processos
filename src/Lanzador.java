import java.io.File;

public class Lanzador {
    public void lanzadorSumador(Integer num1, Integer num2, String fichResultado) {
        String clase = "/home/alumnes/2001/baparicio/IdeaProjects/Serveis_y_Procesos/src/Sumador.java";
        ProcessBuilder pb;
        try {
            pb = new ProcessBuilder("java", clase, num1.toString(), num2.toString());
            pb.redirectError(new File("errores.txt"));
            pb.redirectOutput(new File(fichResultado));
            pb.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Lanzador l = new Lanzador();
        l.lanzadorSumador(1,4,"resultado1.txt");
        l.lanzadorSumador(1,4,"resultado2.txt");
        System.out.println("Ok");
    }
}

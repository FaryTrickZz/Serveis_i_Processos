
public class Sumador {
    private static int sumar(int num1, int num2) {
        System.out.println(num1 +", "+ num2);
        int resultado = 0;
        for(int i = num1; i <= num2; i++ ) {
            resultado = i+resultado;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Sumador s=new Sumador();
        int n1=Integer.parseInt(String.valueOf(2));
        int n2=Integer.parseInt(String.valueOf(7));
        int resultado=s.sumar(n1, n2);
        System.out.println(resultado);

    }
}



import java.io.IOException;
import java.util.Scanner;
//URI 1002

public class AreaCirculo {
    public static void main(String[] args) throws IOException{
        Scanner teclado = new Scanner(System.in);
        double n = 3.14159;
        double raio = teclado.nextDouble();
        double area = n * (raio * raio);
        System.out.println(String.format("A=%.4f", area));
    }

}

import java.io.IOException;
import java.util.Scanner;
//URI 1001

public class ExtremamenteBasico {
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int soma = a + b;
        System.out.println("X = "+ soma);
    }
}

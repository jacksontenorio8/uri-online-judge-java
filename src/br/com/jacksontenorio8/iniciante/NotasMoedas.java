package br.com.jacksontenorio8.iniciante;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

/* URI | 1021
Notas e Moedas

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir,
calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas
são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a
relação de notas necessárias.

Entrada

O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
Saída

Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
@jacksontenorio8
*/


public class NotasMoedas {
    public static void main(String[] args)  throws IOException{

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        double dinheiroFornecido = teclado.nextDouble();
        int valor = 0;


        System.out.println("NOTAS:");
        valor = (int) dinheiroFornecido / 100;
        System.out.printf("%d nota(s) de R$ 100.00%n", valor);
        dinheiroFornecido = dinheiroFornecido % 100.0;

        valor = (int) dinheiroFornecido / 50;
        System.out.printf("%d nota(s) de R$ 50.00%n", valor);
        dinheiroFornecido = dinheiroFornecido % 50.0;

        valor = (int) dinheiroFornecido / 20;
        System.out.printf("%d nota(s) de R$ 20.00%n", valor);
        dinheiroFornecido = dinheiroFornecido % 20.0;

        valor = (int) dinheiroFornecido / 10;
        System.out.printf("%d nota(s) de R$ 10.00%n", valor);
        dinheiroFornecido = dinheiroFornecido % 10.0;

        valor = (int) dinheiroFornecido / 5;
        System.out.printf("%d nota(s) de R$ 5.00%n", valor);
        dinheiroFornecido = dinheiroFornecido % 5.0;

        valor = (int) dinheiroFornecido / 2;
        System.out.printf("%d nota(s) de R$ 2.00%n", valor);
        dinheiroFornecido = dinheiroFornecido % 2.0;

        dinheiroFornecido = dinheiroFornecido * 100;

        System.out.printf("MOEDAS:%n");

        valor = (int) dinheiroFornecido / 100;
        System.out.printf("%d moeda(s) de R$ 1.00%n", valor);
        dinheiroFornecido = dinheiroFornecido % 100.0;

        valor = (int) dinheiroFornecido / 50;
        System.out.printf("%d moeda(s) de R$ 0.50%n", valor);
        dinheiroFornecido = dinheiroFornecido % 50.0;

        valor = (int) dinheiroFornecido / 25;
        System.out.printf("%d moeda(s) de R$ 0.25%n", valor);
        dinheiroFornecido = dinheiroFornecido % 25.0;

        valor = (int) dinheiroFornecido / 10;
        System.out.printf("%d moeda(s) de R$ 0.10%n", valor);
        dinheiroFornecido = dinheiroFornecido % 10.0;

        valor = (int) dinheiroFornecido / 5;
        System.out.printf("%d moeda(s) de R$ 0.05%n", valor);
        dinheiroFornecido = dinheiroFornecido % 5.0;

        valor = (int) dinheiroFornecido / 1;
        System.out.printf("%d moeda(s) de R$ 0.01%n", valor);
        dinheiroFornecido = dinheiroFornecido % 1.0;
    }
}



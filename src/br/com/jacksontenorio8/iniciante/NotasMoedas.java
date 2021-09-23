package br.com.jacksontenorio8.iniciante;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.round;

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
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        double N =  s.nextDouble();
        int[] money = {100, 50, 20, 10, 5, 2};
        double[] coin = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};

        double note;
        System.out.println("NOTAS:");
        for (int i = 0; i < money.length; i++) {
            note = N / money[i];
            System.out.println((int)note + " nota(s) de R$ " + money[i] + ".00");
            N = N % money[i];
        }
        System.out.println("MOEDAS:");
        for (int i = 0; i < coin.length-1; i++) {
            note = (double) (N / coin[i]);
            System.out.println((int)note + " moeda(s) de R$ "+String.format("%.2f",coin[i]));
            N = (double)(N % coin[i]);
        }
        note = (double) (N / coin[coin.length-1]);
        System.out.println(round(note) + " moeda(s) de R$ "+String.format("%.2f",coin[coin.length-1]));
    }
}


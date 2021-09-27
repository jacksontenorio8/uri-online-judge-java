package br.com.jacksontenorio8.iniciante;
import java.io.IOException;
import java.util.Scanner;

/* URI | 1036
Fórmula de Bhaskara

Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de
Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente
“Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada

Leia três valores de ponto flutuante (double) A, B e C.

Saída

Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel
calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o
ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o
final de linha após cada mensagem.


Exemplos de Entrada 	Exemplos de Saída

10.0 20.1 5.1            R1 = -0.29788
                         R2 = -1.71212

0.0 20.0 5.0             Impossivel calcular

10.3 203.0 5.0           R1 = -0.02466
                         R2 = -19.68408

10.0 3.0 5.0             Impossivel calcular

@jacksontenorio8
*/

public class FormulaBaskara {
    public static void main (String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);
        double r1 = (- b + Math.sqrt(delta)) / (2 * a);
        double r2 = (- b - Math.sqrt(delta)) / (2 * a);

        if ( delta > 0) {
            System.out.println(String.format("R1 = %.5f", r1));
            System.out.println(String.format("R2 = %.5f", r2));
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}

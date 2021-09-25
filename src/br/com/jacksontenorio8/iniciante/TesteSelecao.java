package br.com.jacksontenorio8.iniciante;
import java.io.IOException;
import java.util.Scanner;
/* URI | 1035
Teste de Seleção 1

Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C
com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a
mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

Entrada

Quatro números inteiros A, B, C e D.

Saída

Mostre a respectiva mensagem após a validação dos valores.
@jacksontenorio8
*/
public class TesteSelecao {
    public static void main (String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();
        int soma1 = c + d;
        int soma2 = a + b;

        if (b > c && d > a && soma1 > soma2 && c > 0 && d > 0 && a%2 == 0 ){

            System.out.println("Valores aceitos");

        } else {
            System.out.println("Valores nao aceitos");
        }
    }

}

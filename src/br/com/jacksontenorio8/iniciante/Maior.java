package br.com.jacksontenorio8.iniciante;
import java.io.IOException;
import java.util.Scanner;
/* URI 1013
O Maior

Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem
“eh o maior”. Utilize a fórmula:

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário
para chegar no resultado esperado.

Entrada

O arquivo de entrada contém três valores inteiros.

Saída

Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/
public class Maior {
    public static void main(String[] args) throws IOException{
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorABC =(maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maiorABC + " eh o maior");

    }
}

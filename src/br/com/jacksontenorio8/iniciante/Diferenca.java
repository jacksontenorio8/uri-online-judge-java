package URI_Inicinate;
import java.io.IOException;
import java.util.Scanner;
/*URI 1007
* Diferença

Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto
de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

* Entrada

O arquivo de entrada contém 4 valores inteiros.

* Saída

Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco
antes e depois da igualdade.
*/
public class Diferenca {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();
        int diferenca = ( (a * b) - (c * d));
        System.out.println("DIFERENCA = " + diferenca);

    }
}

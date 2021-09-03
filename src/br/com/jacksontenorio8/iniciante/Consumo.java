package br.com.jacksontenorio8.iniciante;
import java.io.IOException;
import java.util.Scanner;

/* URI 1014 - Consumoo
* @jacksontenorio
*

Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total
de combustível gasto (em litros).

* Entrada

O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km),
e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída

Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula,
seguido da mensagem "km/l".
*/

public class Consumo {
    public static void main(String[] args) throws IOException {
        int d;
        double c;
        try (Scanner teclado = new Scanner(System.in)) {

            d = teclado.nextInt();
            c = teclado.nextDouble();
        }
        double media = d / c;
        System.out.printf("%.3f km/l%n", media);
    }
}

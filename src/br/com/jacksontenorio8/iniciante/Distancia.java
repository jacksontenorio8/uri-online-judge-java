package br.com.jacksontenorio8.iniciante;
import java.io.IOException;
import java.util.Scanner;

/*URI 1016
Distância

Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade
constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro
X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y
tomar essa distância do outro carro.

*/
public class Distancia {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        int km = teclado.nextInt();
        int min = (60 * km ) / 30;
        System.out.println(min + " minutos");

    }
}

package br.com.jacksontenorio8.iniciante;
/* URI | 1019
Converssão de Tempo

Leia um valor inteiro, que é o tempo de duração em segundos de um determinado
evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada

O arquivo de entrada contém um valor inteiro N.

Saída

Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:
minutos:segundos, conforme exemplo fornecido.

@jacksontenorio8
*/
import java.io.IOException;
import java.util.Scanner;

public class ConversorTempo {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int tempoInserido = teclado.nextInt();
        int tempoHoras = tempoInserido/3600;
        tempoInserido -= tempoHoras * 3600;
        int tempoMin = tempoInserido/60;
        tempoInserido -= tempoMin * 60;
        int tempoSeg = tempoInserido;

        System.out.println(tempoHoras+":"+tempoMin+":"+tempoSeg);



    }
}

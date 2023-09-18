package io.github.lucianodacunha.aula03.adivinhacao;

import java.util.Scanner;
import java.util.Random;

/**
 * Crie um programa que simula um jogo de adivinhação, que deve gerar um número
 * aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número,
 * em até 5 tentativas. A cada tentativa, o programa deve informar se o número
 * digitado pelo usuário é maior ou menor do que o número gerado.
 *
 * Dicas: *
 *     Para gerar um número aleatório em Java: new Random().nextInt(100);
 *     Utilize o Scanner para obter os dados do usuário;
 *     Utilize uma variável para contar as tentativas;
 *     Utilize um loop para controlar as tentativas;
 *     Utilize a instrução break; para interromper o loop.
 */
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroInformado = 0;
        boolean acertou = false;
        int tentativas = 1;
        int numeroAleatorio = new Random().nextInt(100);

        while(tentativas <= 5) {
            System.out.println("Tente adivinhar o número gerado aleatoriamente");
            System.out.printf("%s %d%s",
                            "Digite seu número escolhido [1-100], tentativa",
                            tentativas, "/5: ");
            numeroInformado = input.nextInt();

            if (numeroInformado < numeroAleatorio) {
                System.out.println("Informe um número maior");
            } else if (numeroInformado > numeroAleatorio) {
                System.out.println("Informe um número menor");
            } else {
                System.out.printf(
                        "%s%d%s%d.",
                        "Parabéns, você acertou! O número era ",
                        numeroAleatorio, ". Você informou ", numeroInformado);
                acertou = true;
                break;
            }

            tentativas++;
        }
        if (!acertou) {
            System.out.println("Você perdeu. O número era " + numeroAleatorio);
        }

        input.close();
    }
}

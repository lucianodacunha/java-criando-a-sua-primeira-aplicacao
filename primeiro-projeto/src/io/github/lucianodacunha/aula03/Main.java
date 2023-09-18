package io.github.lucianodacunha.aula03;

import java.util.Random;
import java.util.Scanner;

/**
 * Nessa aula você aprendeu:
 * A configurar uma aplicação para que ela escolha entre executar uma ação ou
 * outra baseada em algum elemento;
 * Comparações para as condicionais: igual, diferente, maior, menor;
 * A usar a leitura do teclado com a classe Scanner;
 * Trabalhar com alternativas para as condicionais e escolher a ideal para o
 * caso escolhido;
 * A utilizar estruturas de repetição com for e while.
 * */
public class Main {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        if (numeroAleatorio > 50) {
            System.out.printf("%s %d %s", "Número", numeroAleatorio, "maior que 50.");
        } else {
            System.out.printf("%s %d %s", "Número", numeroAleatorio, "menor que 50.");
        }

        System.out.println();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com um valor inteiro: ");
        int valorLimite = entrada.nextInt();
        System.out.println("O valor informado é " + valorLimite);

        for(int i = 1; i <= valorLimite; i++){
            System.out.printf("%d ", i);
        }
        System.out.println("");
        int contador = 1;
        while (contador < numeroAleatorio) {
            if (contador % 10 == 0) {
                System.out.printf("%d ", contador);
                contador++;
            }
        }

    }
}


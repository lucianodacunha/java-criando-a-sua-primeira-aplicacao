package io.github.lucianodacunha.aula02.converter;

import java.util.Locale;
import java.util.Scanner;

/**
 * Escreva um programa que converta uma temperatura em graus Celsius para
 * Fahrenheit. Utilize variáveis para representar os valores das temperaturas e
 * imprima no console o valor convertido de Celsius para Fahrenheit.
 *
 * Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit
 * é: (temperatura * 1.8) + 32.
 *
 * Depois de finalizar, testar e conferir que seu programa foi executado com
 * sucesso, crie uma variável inteira para exibir a temperatura em Fahrenheit
 * sem casas decimais. Lembre-se que provavelmente você precisará fazer um
 * casting de valores.
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Conversor de Temperatura (Celsius para Fahrenheit)");
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com a tempoeratura em Celsius: ");
        double celsiusTemp = input.nextDouble();
        int fahTemp = (int) converterCelsiusToFah(celsiusTemp);
        System.out.printf("Celsius: %.2f => Fahrenheit: %d", celsiusTemp, fahTemp);
        input.close();
    }

    static double converterCelsiusToFah(double celsiusTemp){
        return (celsiusTemp * 1.8) + 32;
    }
}

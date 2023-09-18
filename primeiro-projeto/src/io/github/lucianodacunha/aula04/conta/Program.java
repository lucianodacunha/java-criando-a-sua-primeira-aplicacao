package io.github.lucianodacunha.aula04.conta;

import java.util.Locale;
import java.util.Scanner;

/**
 * A ideia é controlarmos nossa conta bancária virtual e nomearemos os métodos
 * como recebeTransferencia(), fazTransferencia(), enviaPix() ou recebePix(),
 * por exemplo. Mas poderemos nomear como acharmos melhor.
 *
 * A proposta é iniciarmos os dados do cliente como um extrato, e em seguida,
 * teremos quatro opções de operações com a linha para inserir a opção desejada:
 *
 * ***********************
 * Dados iniciais do cliente:
 *
 * Nome: Jacqueline Oliveira
 * Tipo conta: Corrente
 * Saldo inicial: R$ 2500,00
 * ***********************
 *
 * Operações
 *
 * 1- Consultar saldos
 * 2- Receber valor
 * 3- Transferir valor
 * 4- Sair
 *
 * Digite a opção desejada:
 */
public class Program {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        // Define as variáveis.
        entrada = new Scanner(System.in);
        int opcaoMenu = 0;
        String nomeDoCliente = "Java";
        String tipoDeConta = "Corrente";
        double saldoDaConta = 2500.00;

        exbideDadosDaConta(tipoDeConta, nomeDoCliente, saldoDaConta);
        exibeMenuDeOperacoes(opcaoMenu, saldoDaConta);
        entrada.close();
    }

    static void exibeMenuDeOperacoes(int opcaoMenu, double saldoDaConta) {
        while(opcaoMenu != 4) {
            exibeOperacoes();
            opcaoMenu = entrada.nextInt();

            switch (opcaoMenu) {
                case 1:
                    consutlarDados(saldoDaConta);
                    break;
                case 2:
                    saldoDaConta = receberValor(saldoDaConta);
                    break;
                case 3:
                    saldoDaConta = transferirValor(saldoDaConta);
                    break;
                case 4:
                    System.out.println("\nObrigado. Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    static void exbideDadosDaConta(String tipoDeConta, String nomeDoCliente,
                                   double saldoDaConta){
        System.out.println("DADOS DA CONTA:");
        System.out.println("Tipo de Conta: " + tipoDeConta);
        System.out.println("Nome do Cliente: " + nomeDoCliente);
        System.out.println("Saldo Inicial: R$ " + saldoDaConta);
    }

    static void exibeOperacoes(){
        System.out.print("""
                    \nDIGITE A OPÇÃO DESEJADA::
                    1 - Consultar saldos
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    """);
        System.out.print("> ");
    }

    static void consutlarDados(double saldoDaConta){
        System.out.println("\nSaldo atual R$ " + saldoDaConta);
    }

    static double receberValor(double saldoDaconta){
        System.out.print("\nEntre com o valor a ser depositado: ");
        entrada = new Scanner(System.in);
        double valorRecebido = entrada.nextDouble();
        return saldoDaconta + valorRecebido;
    }

    static double transferirValor(double saldoDaconta){
        System.out.print("\nEntre com o valor a ser transferido: ");
        entrada = new Scanner(System.in);
        double valorTrasnferido = entrada.nextDouble();
        return saldoDaconta - valorTrasnferido;
    }
}

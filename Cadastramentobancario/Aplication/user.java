package Atividadepratica05.Aplication;

import Atividadepratica05.Entites.ContaBancaria;
import java.util.Locale;
import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Número da Conta: ");
        int numConta = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha

        System.out.print("Nome do Titular: ");
        String nome = sc.nextLine();

        System.out.print("Depósito Inicial (S/N): ");
        char opcao = sc.next().charAt(0);

        ContaBancaria conta; // Correção: tipo ContaBancaria
        if (opcao == 'S' || opcao == 's') {
            System.out.print("Depósito Inicial: ");
            double depInicial = sc.nextDouble();
            conta = new ContaBancaria(numConta, nome, depInicial); // Correção: ordem dos parâmetros
        } else {
            conta = new ContaBancaria(numConta, nome); // Correção: ordem dos parâmetros
        }

        System.out.println("Dados Bancários:");
        System.out.println(conta);

        System.out.print("Valor do Depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito); // Assumindo que ContaBancaria tem depositar()
        System.out.println("Dados Atualizados:");
        System.out.println(conta);

        System.out.print("Valor do Saque: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque); // Assumindo que ContaBancaria tem sacar()
        System.out.println("Dados da Conta Atualizados:");
        System.out.println(conta);

        sc.close();
    }
}
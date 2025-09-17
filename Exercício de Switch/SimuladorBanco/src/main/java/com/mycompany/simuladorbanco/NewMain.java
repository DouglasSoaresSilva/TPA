package com.mycompany.simuladorbanco;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        double saldo = 1000.00; // saldo fictício inicial
        
        
            System.out.println("|=== Menu de Atendimento Bancário ===|");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar dinheiro");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Encerrar atendimento");
            System.out.print("Escolha uma opção: ");
            
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = input.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("Novo saldo: R$ " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = input.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println("Novo saldo: R$ " + saldo);
                    break;

                case 4:
                    System.out.println("Atendimento encerrado. Obrigado!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
                    
               
    }
}
}
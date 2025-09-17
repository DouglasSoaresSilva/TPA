package com.mycompany.bilhete;
import java.util.Scanner;

public class Bilhete {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha o tipo de transporte:");
        System.out.println("1 - Ônibus urbano");
        System.out.println("2 - Metrô");
        System.out.println("3 - Trem Intermunicipal");
        System.out.println("4 - Ônibus Rodoviário");
        
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Ônibus Urbano - R$4,40");
                break;
            case 2:
                System.out.println("Metrô - R$5,00");
                break;
            case 3:
                System.out.println("Trem Intermunicipal - R$6,50");
                break;
            case 4:
                System.out.println("Ônibus Rodoviário - R$12,00");
                break;
            default:
                System.out.println("Transporte inexistente!");
                input.close();
                return;
        }

        System.out.println("Digite a quantidade de bilhetes que deseja comprar: ");
        int qtd = input.nextInt();

        double valor = 0;

        if (opcao == 1) {
            valor = 4.40;
        } else if (opcao == 2) {
            valor = 5.00;
        } else if (opcao == 3) {
            valor = 6.50;
        } else if (opcao == 4) {
            valor = 12.00;
        }

        double valorTotal = qtd * valor;
        System.out.println("Você comprou " + qtd + " bilhete(s).");
        System.out.println("Valor total: R$ " + valorTotal);

        input.close();
    }    }


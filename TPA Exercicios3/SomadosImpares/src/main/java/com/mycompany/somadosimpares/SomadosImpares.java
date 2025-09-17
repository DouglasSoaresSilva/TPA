package com.mycompany.somadosimpares;
import java.util.Scanner;
public class SomadosImpares {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Le a entrada dovalor inicial e o valor final
        System.out.print("Digite o valor inicial: ");
        int inicio = sc.nextInt();
        System.out.print("Digite o valor final: ");
        int fim = sc.nextInt();

        // Variável para acumular a soma dos números ímpares
        int soma = 0;
        // Variável de controle que começa no valor inicial
        int numero = inicio;
        // Estrutura do...while para ir do início até o fim
        do {
            // Verifica se o número é ímpar
            if (numero % 2 != 0) {
                soma += numero; // soma se o número for ímpar
            }
            // Avança para o próximo número
            numero++;
        } while (numero <= fim); //repete até chegar no valor final

        // Exibe o resultado
        System.out.println("A soma dos números ímpares entre " + inicio + " e " + fim + " é: " + soma);
        sc.close(); //Fecha o Scanner
    }
    }


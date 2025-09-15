package com.mycompany.tabuada;
import java.util.Scanner;
//Código feito por Douglas Soares Silva - Professor Marcelo Collado
public class Tabuada {

    public static void main(String[] args) {
       // Criar o objeto Scanner para ler o número digitado pelo usuário
        Scanner sc = new Scanner(System.in);

        // Pedir para o usuário informar o número da tabuada
        System.out.print("Digite um número para exibir a tabuada dele: ");
        int numero = sc.nextInt(); // Lê a entrada do usuário

        // Variável que serve como auxiliar para multiplicar (vai de 1 até 10)
        int i = 1;

        // Estrutura de repetição do...while
        System.out.println("Tabuada do " + numero + ":");
        do {
            // Exibir o cálculo na tela
            System.out.println(numero + " x " + i + " = " + (numero * i));

            // Incrementa i para passar ao próximo cálculo
            i++;
        } while (i <= 10); // Repete enquanto i for menor ou igual a 10
        sc.close();// Fecha o Scanner
    }
}
    

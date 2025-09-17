package com.mycompany.contagemdosnumeros;
import java.util.Scanner;
//Código feito Douglas Soares Silva - Professor Marcelo Collado
public class ContagemdosNumeros {

    public static void main(String[] args) {
         // Cria o scanner
        Scanner sc = new Scanner(System.in);

        // Variável do primeiro número, que começa em 100
        int numero = 100;
        // Contador para saber quantos números foram exibidos
        int contador = 0;

        // Estrutura do...while
        System.out.println("Números entre 100 e 125:");
        do {
            // Mostra qual é o número atual
            System.out.print(numero + " ");

            // Incrementa o contador
            contador++;

            // Passa para o próximo número
            numero++;
        } while (numero <= 125); // repete até chegar em 125

        // Exibe a quantidade total de números
        System.out.println("Quantidade total de números: " + contador);

        // Fecha o Scanner
        sc.close();
    }
}
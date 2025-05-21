package com.mycompany.nprimo;
import java.util.Scanner;

public class nprimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " não é primo.");
        } else {
            boolean numPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    numPrimo = false;
                    break;
                }
            }

            if (numPrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }

        scanner.close();
    }
}
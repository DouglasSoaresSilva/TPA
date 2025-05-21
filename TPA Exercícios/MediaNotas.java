package com.mycompany.medianotas;
import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //inserção
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();
        //Calculo
        double media = nota1 + nota2 + nota3 + nota4 / 4;
        //Exibição
        System.out.print("Sua média é: " + media);

    }
}


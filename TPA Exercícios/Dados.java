package com.mycompany.dados;
import java.util.Scanner;

public class Dados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
//Insercao do usuario
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o dia que você nasceu: ");
        byte dia = scanner.nextByte();
        System.out.println("Digite o mes que você nasceu: ");
        byte mes = scanner.nextByte();
        System.out.println("Digite o ano que você nasceu: ");
        short ano = scanner.nextShort();
        scanner.nextLine();
        System.out.println("Digite sua série: ");
        String serie = scanner.nextLine();
        //Parte mais pessoal
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite seu curso: ");
        String curso = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
//Exibindo
       System.out.println("Seus dados são: ");
       System.out.println("Nome: " + nome);
       System.out.println("Data de Nascimento: " + dia + "/" + mes + "/" + ano);
       System.out.println("Curso: " + curso);
       System.out.println("Série: " + serie);
       System.out.println("Altura: " + altura + "cm");
       System.out.println("Peso: " + peso + "kg");
       scanner.close();
    }
}

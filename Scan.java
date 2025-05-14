package com.mycompany.scan;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */

public class Scan {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

//Leitura de texto
System.out.println("Digite seu nome;");
String nome = scanner.nextLine();
   
//Leitura de numero inteiro
 System.out.println("Digite sua idade:");
 int idade = scanner.nextInt();
 
 
 System.out.println("Olá" + nome +", Você tem!" + idade + "anos" );
         
  scanner.close();
    }
}
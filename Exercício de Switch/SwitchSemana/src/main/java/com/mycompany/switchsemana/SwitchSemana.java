package com.mycompany.switchsemana;
import java.util.Scanner;
public class SwitchSemana {
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite um dia da semana (1-7)");
         short dia = scanner.nextShort();
         
      switch (dia) {
          case 1:
              System.out.println("Sábado");
          case 2:
              System.out.println("Segunda-Feira");
          case 3:  
              System.out.println("Terça-Feira");
          case 4:  
              System.out.println("Quarta-Feira");
              break;
          case 5:  
              System.out.println("Quinta-Feira");
          case 6:
              System.out.println("Sexta-Feira");
              break;
          case 7: 
              System.out.println("Domingo");
              break;
          default: 
              System.out.println("Dia Inválido, Digite de 1-7");
              break;
      }
  }
}
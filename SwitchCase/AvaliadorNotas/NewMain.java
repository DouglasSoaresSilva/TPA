package com.mycompany.avaliadornotas;
import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
         System.out.println("Quantas questões você acertou? (1-10)");
         short mes = scanner.nextShort();
         
      switch (mes) {
          case 0:
          case 1:  
          case 2:
          case 3:  
          case 4:  
              System.out.println("Nota: I");
              break;
          case 5:  
          case 6:  
              System.out.println("Nota: R");
              break;
          case 7:
          case 8:  
              System.out.println("Nota: B");
              break;
          case 9:  
          case 10: 
              System.out.println("MB");
              break;
          default: 
              System.out.println("Nota Inválida, Digite de 1-10");
              break;
      }
  }
}

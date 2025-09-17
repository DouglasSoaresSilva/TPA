package com.mycompany.frutas;
import java.util.Scanner;
public class Frutas {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para cada fruta: (1-Maçã, 2-Banana e 3-Laranja)");
         short fruta = scanner.nextShort();
      switch (fruta) {
          case 1:  
              System.out.println("Maçã"); 
              break;
          case 2:
              System.out.println("Banana");
              break;
          case 3:  
                System.out.println("Laranja");
              break;
          default: 
              System.out.println("Fruta inválida");
              break;
    } 
}
}
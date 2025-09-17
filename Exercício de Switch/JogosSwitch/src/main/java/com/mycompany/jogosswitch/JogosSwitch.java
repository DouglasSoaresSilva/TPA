package com.mycompany.jogosswitch;
import java.util.Scanner;
public class JogosSwitch {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para cada jogo: (1-Minecraft, 2-UNDERTALE, 3-Terraria, 4-Call of Duty e 5-Hollow Knight)");
         short jogo = scanner.nextShort();
      switch (jogo) {
          case 1:  
              System.out.println("Minecraft"); 
              break;
          case 2:
              System.out.println("UNDERTALE");
              break;
          case 3:  
                System.out.println("Terraria");
              break;
          case 4:
                System.out.println("Terraria");
              break;
          case 5:
               System.out.println("Hollow Knight");
          default: 
              System.out.println("Jogo inválido!");
              break;
    } 
}
}
    
    


package com.mycompany.tabuada;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Inserção
        System.out.print("Digite o número: ");
        int num = scanner.nextInt();
        
        //Calculo
        int tabuada1 = num * 1;
        int tabuada2 = num * 2;
        int tabuada3 = num * 3;
        int tabuada4 = num * 4;
        int tabuada5 = num * 5;
        int tabuada6 = num * 6;
        int tabuada7 = num * 7;
        int tabuada8 = num * 8;
        int tabuada9 = num * 9;
        int tabuada10 = num * 10;
        //Exibindo
        
        System.out.println("A tabuada deste numero é: ");
        System.out.println(num + "X 1: " + tabuada1);
        System.out.println(num + "X 2: " + tabuada2);
        System.out.println(num + "X 3: " + tabuada3);
        System.out.println(num + "X 4: " + tabuada4);
        System.out.println(num + "X 5: " + tabuada5);
        System.out.println(num + "X 6: " + tabuada6);
        System.out.println(num + "X 7: " + tabuada7);
        System.out.println(num + "X 8: " + tabuada8);
        System.out.println(num + "X 9: " + tabuada9);
        System.out.println(num + "X 10: " + tabuada10);
        scanner.close();
    }
}
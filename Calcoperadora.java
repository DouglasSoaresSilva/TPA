package com.mycompany.calcoperadora;
import java.util.Scanner;

public class Calcoperadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Adição
        System.out.println("Digite o primeiro número:");
    Double num1 = scanner.nextDouble();

         System.out.println("Digite o segundo número:");
    Double num2 = scanner.nextDouble();
        //Calculo
        Double resultado = num1 + num2;
        Double resultado1 = num1 - num2;
        Double resultado2 = num1 * num2;
        Double resultado3 = num2 != 0 ? num1 / num2 : Double.NaN; //Evita divisão por zero
        //Exibição
        System.out.println("Resultado da soma é:" + resultado);
        System.out.println("Resultado da subtração é:" + resultado1);
        System.out.println("Resultado da multiplicação é:" + resultado2);
        System.out.println("Resultado da divisão: " + (num2 != 0 ? resultado3:
                "Indefinida (divisão por zero)"));
         scanner.close();
     }
    }
package com.mycompany.ConversorC;
import java.util.Scanner;

public class ConversorC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //Adição
        System.out.println("Digite os graus Celsius:");
        double Celsius = scanner.nextDouble();
        //Calculo
        double fahrenheit = Celsius * 1.8 + 32;
        double kelvin = Celsius + 273.15;

        //Exibição
        System.out.println("Fahrenheit:" + fahrenheit);
        System.out.println("Kelvin:" + kelvin);
        
         scanner.close();
     }
    }
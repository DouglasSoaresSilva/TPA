package com.mycompany.ConversorC;
import java.util.Scanner;

public class ConversorC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //Adição
        System.out.println("Digite os graus Celsius:");
        double Celsius = scanner.nextDouble();

        //Calculo
        double Fahrenheit = Celsius * 1.8 + 32;
        double Kelvin = Celsius + 273.15;

        //Exibição
        System.out.println("Fahrenheit:" + Fahrenheit);
        System.out.println("Kelvin:" + Kelvin);
         scanner.close();
     }
    }
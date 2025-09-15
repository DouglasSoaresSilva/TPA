package com.mycompany.numerospares;
import java.util.Scanner;
//Código feito por Douglas Soares Silva - Professor Marcelo Collado
public class Numerospares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 2; //Começa com dois porque o primeiro número par é 2

            System.out.println("Os números pares entre 1 e 20 são:");
            do{
                //do while garante que o código dentro do "do" será executado pelo menos uma vez antes de verificar a condição no "while"
                System.out.print(numero + " ");
                //Variável para o próximo número par
                numero += 2;
                
                
            //Enquanto "número" for menor ou igual a 20
            }while ( numero <= 20);
            sc.close(); //Fecha o Scanner
        }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisao;

/**Eu, Douglas Soares Silva estou fazendo o exercício proposto no dia 23 de abril
 *
 * @author FATEC ZONA LESTE
 */
public class Divisao {

    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 11;
        double divisao = num2 != 0 ? num1 / num2 : Double.NaN;
         System.out.println("Divisão: " + (num2 !=0 ? divisao:
                "Indefinida (divisão por zero)"));
    }
}

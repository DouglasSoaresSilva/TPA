/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoesmatematicas;

/**Eu, Douglas Soares Silva, Estou programando neste código
 *
 * @author FATEC ZONA LESTE
 */
public class OperacoesMatematicas {

    public static void main(String[] args){
        //Definição de 2 números
        double num1 = 210.5;
        double num2 = 50.2;                
        
        //Realizando Operações Matemáticas
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? num1 / num2 : Double.NaN; //Evita divisão por zero
        double resto = num1 % num2;
        
        //Exibindo os resultados
        System.out.println("Resultados das Operações");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (num2 !=0 ? divisao:
                "Indefinida (divisão por zero)"));
        System.out.println("Resto da divisão: " + resto);
    }
}

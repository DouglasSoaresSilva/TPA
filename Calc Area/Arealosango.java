/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arealosango;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Arealosango {

    public static void main(String[] args) {
    //Calculo da Area do Losango
       double diagonalmaior = 50;
       double diagonalmenor = 30;
       double area = (diagonalmenor != 0) ? (diagonalmaior * diagonalmenor) / 2.0 : Double.NaN;
    //Exibindo Resultado
     System.out.println("Area do Losango: " + area);
    }
}

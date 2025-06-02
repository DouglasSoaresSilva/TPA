package com.mycompany.salario;
import javax.swing.*;

public class Salario {
public static void main(String[] args) {
        //Inserção do salário (1SM = 1000)

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário do usuário:"));
        int qtdeSM = (int) (salario / 1000);

        //Exibição 
        JOptionPane.showMessageDialog(null, "Você ganha: " + qtdeSM + " salários mínimos.");
    }
}

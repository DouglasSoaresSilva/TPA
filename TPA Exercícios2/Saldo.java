package com.mycompany.saldo;
import javax.swing.*;

public class Saldo {
    public static void main(String[] args) {
        
double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo:"));
        double reajuste = saldo * 1.01;
        JOptionPane.showMessageDialog(null, "Saldo com reajuste: R$" + reajuste);
    }
}
package com.mycompany.antecessorsucessor;
import javax.swing.*;
public class AntecessorSucessor {
    public static void main(String[] args) {

    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
    int suce = num + 1;
    int ante = num - 1;
    JOptionPane.showMessageDialog(null, "Antecessor: " + ante);
    JOptionPane.showMessageDialog(null, "Sucessor: " + suce);
 }
}

package com.mycompany.condicionais;
import javax.swing.JOptionPane;

public class CONDICIONAIS {
    public static void main(String[] args) {
        // Exemplo com == (Igual)
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para ver se é igual a 10:"));
        if (numero == 10) {
            JOptionPane.showMessageDialog(null, "O número é igual a 10.");
        } else {
            JOptionPane.showMessageDialog(null, "O número não é igual a 10.");
        }

        // Exemplo com > (Maior)
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        if (idade > 17) {
            JOptionPane.showMessageDialog(null, "Você é maior de idade.");
        } else {
            JOptionPane.showMessageDialog(null, "Você é menor de idade.");
        }

        // Exemplo com < (Menor)
        int temperatura = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura atual:"));
        if (temperatura < 0) {
            JOptionPane.showMessageDialog(null, "Está congelando!");
        } else {
            JOptionPane.showMessageDialog(null, "A temperatura está acima de 0°C.");
        }

        // Exemplo com != (Diferente)
        String nome = JOptionPane.showInputDialog("Digite um nome:");
        if (!nome.equals("Maria")) {
            JOptionPane.showMessageDialog(null, "O nome não é Maria.");
        } else {
            JOptionPane.showMessageDialog(null, "O nome é Maria.");
        }

        // Exemplo com >= (Maior ou Igual)
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua nota:"));
        if (nota >= 6) {
            JOptionPane.showMessageDialog(null, "Você foi aprovado!");
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado.");
        }

        // Exemplo com <= (Menor ou Igual)
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens em seu estoque:"));
        if (quantidade <= 0) {
            JOptionPane.showMessageDialog(null, "Estoque esgotado.");
        } else {
            JOptionPane.showMessageDialog(null, "Ainda há produtos no estoque.");
        }

        // Exemplo combinando várias condições
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora (0-24):"));
        if (hora < 12) {
            JOptionPane.showMessageDialog(null, "Bom dia!");
        } else if (hora < 18) {
            JOptionPane.showMessageDialog(null, "Boa tarde!");
        } else if (hora >= 25) {
            JOptionPane.showMessageDialog(null, "Digite entre 0-24!!!");
        } else {
            JOptionPane.showMessageDialog(null, "Boa noite!");
        }
    }
}
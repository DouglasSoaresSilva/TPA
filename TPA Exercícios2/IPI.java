package com.mycompany.ipi;
import javax.swing.*;

public class IPI {

    public static void main(String[] args) {
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

                    double ipi = Integer.parseInt(JOptionPane.showInputDialog("Porcentagem do IPI: "));
                    double valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor unitário da Peça1: "));
                    int quant1 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade da peça 1: "));
                    double valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor unitário da Peça2: "));
                    int quant2 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade da peça 2: "));

                    double total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

                    JOptionPane.showMessageDialog(null, ("Valor total com IPI: " + total));
                }
            }
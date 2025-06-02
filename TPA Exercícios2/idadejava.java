package com.mycompany.idadejava;
import javax.swing.*;
        
public class idadejava {
    public static void main(String[] args) {
    //Inserção dos dados
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Anos: "));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Meses: "));
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Dias: "));

        int totaldedias = anos * 365 + meses * 30 + dias;
    //Exibição ("~" significa aproximadamente)
        JOptionPane.showMessageDialog(null, "Total de dias: ~" + totaldedias);
    }
}

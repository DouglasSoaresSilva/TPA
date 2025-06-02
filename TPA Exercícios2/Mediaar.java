package com.mycompany.mediaar;
import javax.swing.*;

public class Mediaar {
    public static void main(String[] args) {
    //Calculo dos dados
        double media1 = (8 + 9 + 7) / 3.0;
        double media2 = (4 + 5 + 6) / 3.0;
        double somaMedias = media1 + media2;
        double MediaDasMedias = somaMedias / 2;

    //Exibição das medias
    
        JOptionPane.showMessageDialog(null, "Média897:  " + media1);
        JOptionPane.showMessageDialog(null, "Média456:  " + media2);
        JOptionPane.showMessageDialog(null, "Soma das Médias:  " + somaMedias);
        JOptionPane.showMessageDialog(null, "Média das Médias:  " + MediaDasMedias);
    }
}

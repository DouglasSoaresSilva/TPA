package com.mycompany.switchdemointerfacegrafica;
import javax.swing.JOptionPane;
public class SwitchDemoGrafica {
    public static void main(String[] args) {
        // TODO code application logic here
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mês:"));
      
      switch (mes) {
          case 1:  
              JOptionPane.showMessageDialog(null, "O mês é Janeiro!");
              break;
          case 2:
              JOptionPane.showMessageDialog(null, "O mês é Fevereiro!");
              break;
          case 3:  
                JOptionPane.showMessageDialog(null, "O mês é Março!");
              break;
          case 4:  
              JOptionPane.showMessageDialog(null, "O mês é Abril!");
              break;
          case 5:  
              JOptionPane.showMessageDialog(null, "O mês é Maio!");
              break;
          case 6:  
              JOptionPane.showMessageDialog(null, "O mês é Junho!");
              break;
          case 7:
              JOptionPane.showMessageDialog(null, "O mês é Julho!");
              break;
          case 8:  
              JOptionPane.showMessageDialog(null, "O mês é Agosto!");
              break;
          case 9:  
              JOptionPane.showMessageDialog(null, "O mês é Setembro!");
              break;
          case 10: 
              JOptionPane.showMessageDialog(null, "O mês é Outubro!");
              break;
          case 11: 
              JOptionPane.showMessageDialog(null, "O mês é Novembro!");
              break;
          case 12: 
              JOptionPane.showMessageDialog(null, "O mês é Dezembro!");
              break;
          default: 
              JOptionPane.showMessageDialog(null, "Mês inválido");
              break;
      }
  }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio3;

/**
 *
 * @author labs
 */
import javax.swing.JOptionPane;
public class Exercicio3 {

    public static void main(String[] args) {
      JOptionPane.showMessageDialog(
       null,
    "Digite o valor do produto na próxima caixa de mensagem",
    "Informação",
    JOptionPane.INFORMATION_MESSAGE
      );
      String ProductValue = JOptionPane.showInputDialog(null,"Digite o valor do produto: ");
      float Value = Float.parseFloat(ProductValue);
      float stonk;
     
      if (Value < 20)
      {
          stonk = 0.45f;
      float sell = Value *(1+stonk);
      JOptionPane.showMessageDialog(null,"O valor da venda é: "+ sell);
      }
      else{
      stonk = 0.30f;
      float sell = Value *(1+stonk);
      JOptionPane.showMessageDialog(null,"O valor da venda é: "+ sell);
      }
        
        
        
        
        
        
        
        
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1_0;

/**
 *
 * @author labs
 */
import javax.swing.JOptionPane;
public class Exercicio1_0 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Digite um número na próxima caixa de exibição para descobrir se ele é mútiplo de 3: ");
        String n1 = JOptionPane.showInputDialog(null,"Digite o número para saber se ele é mútiplo de 3: ");
        double n = Double.parseDouble(n1);
        if(n %3 == 0)
        {
            JOptionPane.showMessageDialog(null,"è múltiplo de 3");
        }
        else{
       JOptionPane.showMessageDialog(null, "Não é mútiplo de 3");
        }
    }
}
    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio4;

/**
 *
 * @author labs
 */
import javax.swing.JOptionPane;
public class Exercicio4 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Classe Eleitoral");
        JOptionPane.showMessageDialog(null,"Digite sua idade na próxima caixa de mensagem para descobrir sua classe eleitoral: ");
        String Age =  JOptionPane.showInputDialog(null,"Digite a sua idade: ");
        int age = Integer.parseInt(Age);
        if (age <= 16 )
        {
         JOptionPane.showMessageDialog(null, "Não eleitor");
        }
        else if (age >= 18 && age<=65) 
        { JOptionPane.showMessageDialog(null, "Eleitor obrigatório");}
        else {
        JOptionPane.showMessageDialog(null, "Eleitor facultativo");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2_0;

/**
 *
 * @author labs
 */
import javax.swing.JOptionPane;
public class Exercicio2_0 {

    public static void main(String[] args) {
         JOptionPane.showMessageDialog(null, "Digite na caixa a seguir números para saber a ordem crescente desses números");
       String n_1 = JOptionPane.showInputDialog(null,"Digite o primeiro número: ");
       String n_2 = JOptionPane.showInputDialog(null,"Digite o segundo número: ");
       String n_3 = JOptionPane.showInputDialog(null,"Digite o terceiro número: ");
       double n1 = Float.parseFloat(n_1);
       double n2 = Float.parseFloat(n_2);
       double n3 = Float.parseFloat(n_3);
       
       if(n1 < n2 && n2 < n3)
       {
           JOptionPane.showMessageDialog(null, "Em ordem crescente fica assim: "+n1+" , "+n2+" , "+n3+ " ,  "+ JOptionPane.INFORMATION_MESSAGE);
       }
       else if(n1 < n3 && n3 < n2)
       {
           JOptionPane.showMessageDialog(null, "Em ordem crescente fica assim: "+n1+" , "+n3+" , "+n2+ " ,  "+ JOptionPane.INFORMATION_MESSAGE);
       }
       else if(n2 < n1 && n1 < n3)
       {
           JOptionPane.showMessageDialog(null, "Em ordem crescente fica assim: "+n2+" , "+n1+" , "+n3+ " ,  "+ JOptionPane.INFORMATION_MESSAGE);
       }
       else if(n2 < n3 && n3 < n1)
       {
           JOptionPane.showMessageDialog(null, "Em ordem crescente fica assim: "+n2+" , "+n3+" , "+n1+ " ,  "+ JOptionPane.INFORMATION_MESSAGE);
       }
       else if(n3 < n1 && n1 < n2)
       {
           JOptionPane.showMessageDialog(null, "Em ordem crescente fica assim: "+n3+" , "+n1+" , "+n2+ " ,  "+ JOptionPane.INFORMATION_MESSAGE);
       }
       else {
       JOptionPane.showMessageDialog(null, "Em ordem crescente fica assim: "+n3+" , "+n2+" , "+n1+ " ,  "+ JOptionPane.INFORMATION_MESSAGE);
       }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio5;

/**
 *
 * @author labs
 */
import javax.swing.JOptionPane;
public class Exercicio5 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Plano de saúde");
        JOptionPane.showMessageDialog(null,"Na próxima caixa digite seu nome");
        String name = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        JOptionPane.showMessageDialog(null,"Na próxima caixa digite sua idade");
        String Age = JOptionPane.showInputDialog(null, "Digite sua idade: ");
       int age = Integer.parseInt(Age);
       
       if(age <=10)
       {
           JOptionPane.showMessageDialog(null,"Seu nome é "+name+","+" Sua idade é "+age+", "+"E o total a pagar é R$30,00");
       }
       else if (age >= 10 && age<=29 ){
       JOptionPane.showMessageDialog(null,"Seu nome é "+name+","+" Sua idade é "+age+", "+"E o total a pagar é R$60,00");
       }
       else if (age >= 29 && age<=45 ){
       JOptionPane.showMessageDialog(null,"Seu nome é "+name+","+" Sua idade é "+age+", "+"E o total a pagar é R$120,00");
       }
       else if (age >= 45 && age<=59 ){
       JOptionPane.showMessageDialog(null,"Seu nome é "+name+","+" Sua idade é "+age+", "+"E o total a pagar é R$150,00");
       }
       else if (age >= 59 && age<=65 ){
       JOptionPane.showMessageDialog(null,"Seu nome é "+name+","+" Sua idade é "+age+", "+"E o total a pagar é R$250,00");
       }
       else{
           JOptionPane.showMessageDialog(null,"Seu nome é "+name+","+" Sua idade é "+age+", "+"E o total a pagar é R$400,00");
       }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}

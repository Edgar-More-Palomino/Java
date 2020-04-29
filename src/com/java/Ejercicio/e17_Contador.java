package com.java.Ejercicio;

import javax.swing.*;

public class e17_Contador {
    public static void main(String[] args) {
       int num, cont=0;
       num=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
       while (num>=0){
           System.out.println("cantidad de numero " + num);
           cont++;
           num=Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero "));

       }
        JOptionPane.showMessageDialog(null,"la cantidad es "+ cont);
    }
}

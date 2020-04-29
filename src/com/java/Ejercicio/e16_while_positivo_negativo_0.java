package com.java.Ejercicio;

import javax.swing.*;

public class e16_while_positivo_negativo_0 {
    public static void main(String[] args) {
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
        while(num!=0){
            if(num>0){
                JOptionPane.showMessageDialog(null,"es positivo");
            }else{
                JOptionPane.showMessageDialog(null,"es negativo");
            }
            num=Integer.parseInt(JOptionPane.showInputDialog("ingrese el otro numero"));
        }

    }
}

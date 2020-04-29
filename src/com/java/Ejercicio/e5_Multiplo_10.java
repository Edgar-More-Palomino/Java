package com.java.Ejercicio;

import javax.swing.*;

public class e5_Multiplo_10 {
    public static void main(String[] args) {
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if(num%10==0){
           JOptionPane.showMessageDialog(null,"el numero es multiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null,"no es multiplo de 10");
        }
    }
}

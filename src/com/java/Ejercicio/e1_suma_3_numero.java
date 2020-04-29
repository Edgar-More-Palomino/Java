package com.java.Ejercicio;

import javax.swing.*;

public class e1_suma_3_numero {
    public static void main(String[] args) {
        double n1, n2, n3, suma;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        suma = n1 + n2 + n3;
        //JOptionPane.showMessageDialog(null,"la suma es "+suma);
        System.out.println("la suma es " + suma);
    }
}

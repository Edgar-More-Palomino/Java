package com.java;

import javax.swing.*;

public class a6_Sentencia_Switch {
    public static void main(String[] args) {
        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog("escriba un numero del 1 al 5"));
        switch (dato) {
            case 1:
                JOptionPane.showMessageDialog(null, "el numero es uno");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "el numero es dos");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "el numero es tres");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "el numero es cuatro");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "el numero es cinco");
                break;

            default:
                JOptionPane.showMessageDialog(null, "el numero esta fuera del rango");


        }
    }
}

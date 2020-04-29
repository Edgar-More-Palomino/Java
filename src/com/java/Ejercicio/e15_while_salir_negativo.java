package com.java.Ejercicio;

import javax.swing.*;

public class e15_while_salir_negativo {
    public static void main(String[] args) {
        int num, cuadrado;
        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
        while (num >= 0) {
            cuadrado = (int) Math.pow(num, 2);
            JOptionPane.showMessageDialog(null, " el numero " + num + " y su cuadrado es " + cuadrado);
            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
        }
    }
}

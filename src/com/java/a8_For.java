package com.java;

import javax.swing.*;

public class a8_For {
    public static void main(String[] args) {
        int cont;
        cont = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad a mostrar"));
        for (int num = 0; num <= cont; num+=2) {
            System.out.println(num);
        }
    }
}

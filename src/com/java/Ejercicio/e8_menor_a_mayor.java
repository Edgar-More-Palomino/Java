package com.java.Ejercicio;

import javax.swing.*;

public class e8_menor_a_mayor {
    public static void main(String[] args) {
        int n1, n2, n3;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));

        if (n1 > n2 && n2 > n3) {
            System.out.println(n1 + " " + n2 + " " + n3);

        } else if (n1 > n3 && n3 > n2) {
            System.out.println(n1 + " " + n3 + " " + n2);
        } else if (n2 > n1 && n1 > n3) {
            System.out.println(n2 + " " + n1 + " " + n3);
        } else if (n2 > n3 && n3 > n1) {
            System.out.println(n2 + " " + n3 + " " + n1);
        } else if (n3 > n2 && n2 > n1) {
            System.out.println(n3 + " " + n2 + " " + n1);
        } else {
            System.out.println(n3 + " " + n1 + " " + n2);
        }


    }
}

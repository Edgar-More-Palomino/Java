package com.java.Ejercicio;

import javax.swing.*;


public class e19_Contador_Acumulador {
    public static void main(String[] args) {
        int num, cont = 0, acum = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
        while (num != 0) {
            System.out.println(num);
            acum = acum + num;
            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero"));
            cont++;

        }
        System.out.println("la cantidad es " + cont + " y la suma es " + acum);


    }
}

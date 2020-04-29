package com.java;

import javax.swing.*;

public class a7_Ciclo_While {
    public static void main(String[] args) {
        int num = 1, cont, acum=0;
        cont = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad a mostrar"));
        while (num <= cont) {
            System.out.println(num);
            acum=acum+num;
            num++;
        }
        System.out.println("la suma es "+ acum);
    }
}

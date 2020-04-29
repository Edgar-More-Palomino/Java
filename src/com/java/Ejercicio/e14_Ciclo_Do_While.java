package com.java.Ejercicio;

import javax.swing.*;

public class e14_Ciclo_Do_While {
    public static void main(String[] args) {
        int num = 1, cont;
        cont = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad a mostrar"));
        do {
            System.out.print(num + ", ");
            num += 4;

        } while (num <= cont);
    }
}

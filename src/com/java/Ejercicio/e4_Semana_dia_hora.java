package com.java.Ejercicio;

import javax.swing.*;

public class e4_Semana_dia_hora {
    public static void main(String[] args) {
        int h, sem, dia, hrs;
        h=Integer.parseInt(JOptionPane.showInputDialog("ingrese las horas"));
        sem=h/168;
        dia=(h%168)/24;
        hrs=(h%168)%24;
        System.out.println("el numero de semanas "+sem);
        System.out.println("el numero de dias "+dia);
        System.out.println("el numero de horas "+hrs);

    }
}

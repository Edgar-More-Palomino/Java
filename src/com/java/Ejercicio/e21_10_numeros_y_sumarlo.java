package com.java.Ejercicio;

import javax.swing.*;

public class e21_10_numeros_y_sumarlo {
    public static void main(String[] args) {
        int num=0,cant, acum=0;
        cant=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
        while(num<=cant){
            System.out.println(num);
            acum=acum+num;
            num++;


        }
        System.out.println("la suma total es "+acum);
    }
}

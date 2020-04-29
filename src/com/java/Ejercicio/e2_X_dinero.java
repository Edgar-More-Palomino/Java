package com.java.Ejercicio;

import javax.swing.*;

public class e2_X_dinero {
    public static void main(String[] args) {
        double gui,luis, juan,X,total;
        X=Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad de dinero"));
        gui=X;
        luis=X/2;
        juan=((X/2)+X)/2;
        total=gui+luis+juan;
       /* JOptionPane.showMessageDialog(null,"lo que tiene gui es "+gui);
        JOptionPane.showMessageDialog(null,"lo que tiene luis es "+luis);
        JOptionPane.showMessageDialog(null,"lo que tiene juan es "+juan);*/
        System.out.println("lo que tiene gui es "+gui);
        System.out.println("lo que tiene luis es "+luis);
        System.out.println("lo que tiene juan es "+juan);
        System.out.println("la suma de los 3 es "+total);
    }
}

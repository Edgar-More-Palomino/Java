package com.java.Ejercicio;

import javax.swing.*;

public class e3_Calificacion_Final {
    public static void main(String[] args) {
        double  part, pparcial, sparcial, fin, total;
        part = Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota"));
        pparcial = Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota"));
        sparcial = Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota"));
        fin = Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota"));

        part = part * 0.10;
        pparcial = pparcial * 0.25;
        sparcial = sparcial * 0.25;
        fin = fin * 0.40;
        total = part + pparcial + sparcial + fin;
        System.out.println("participacion es " + part);
        System.out.println("1er parcial es " + sparcial);
        System.out.println("2do parcial es " + sparcial);
        System.out.println("examen final es " + fin);
        System.out.println("la nota final es " + total);

    }
}

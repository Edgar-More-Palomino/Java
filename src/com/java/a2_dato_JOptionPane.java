package com.java;

import javax.swing.*;

public class a2_dato_JOptionPane {

    public static void main(String[] args) {
        String cadena;
        int numero;
        char letra;
        double decimal;
        cadena = JOptionPane.showInputDialog("ingrese una palabra");
        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        letra = JOptionPane.showInputDialog("ingrese una letra").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("ingrese un decimal"));

        //imprimiendo en ventanas----->

        /*JOptionPane.showMessageDialog(null, "la palabra es " + cadena);
        JOptionPane.showMessageDialog(null, "el numero es " + numero);
        JOptionPane.showMessageDialog(null, "la letra es " + letra);
        JOptionPane.showMessageDialog(null, "el numero decimal es " + decimal);*/

        //imprimiendo en consola------>
        System.out.println("la palabra es " + cadena);
        System.out.println("la palabra es " + numero);
        System.out.println("la palabra es " + letra);
        System.out.println("la palabra es " + decimal);


    }
}

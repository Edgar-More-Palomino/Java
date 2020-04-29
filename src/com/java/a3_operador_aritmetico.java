package com.java;

import javax.swing.*;

public class a3_operador_aritmetico {
    public static void main(String[] args) {
        double n1, n2, suma, resta, mult, div, residuo;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese 1er numero"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese 2do numero"));

        //operaciones
        suma = n1 + n2;
        resta = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;
        residuo = n1 % n2;

        //imprimiendo en consola
        System.out.println("la suma es "+suma);
        System.out.println("la resta es "+resta);
        System.out.println("la multiplicacion es "+mult);
        System.out.println("la division es "+div);
        System.out.println("la residuo es "+residuo);


    }
}

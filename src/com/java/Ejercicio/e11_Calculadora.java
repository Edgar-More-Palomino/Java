package com.java.Ejercicio;

import javax.swing.*;

public class e11_Calculadora {
    public static void main(String[] args) {
        int num1, num2, suma, resta, multi, div;
        char letra;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese primer numero"));
        letra = JOptionPane.showInputDialog("ingrese letra para una operacion").charAt(0);
        switch (letra) {
            case 's':
            case 'S':
                suma = num1 + num2;
                System.out.println("la suma es " + suma);
                break;

            case 'r':
            case 'R':
                resta = num1 - num2;
                System.out.println("la resta es " + resta);
                break;

            case 'm':
            case 'M':
                multi = num1 * num2;
                System.out.println("la multiplicacion es " + multi);
                break;

            case 'd':
            case 'D':
                div = num1 / num2;
                System.out.println("la division es " + div);
                break;
            default:
                System.out.println("se equivoco de letra, no existe");


        }
    }
}

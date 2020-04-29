package com.java.Ejercicio;

import javax.swing.*;

public class e26_tabla_multiplicar {
    public static void main(String[] args) {
        int num, multiplicacion;
        num=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
        for(int i=0;i<10;i++){
            multiplicacion=num*i;
            System.out.println(num+" * "+ i +" = "+ multiplicacion);
        }
    }
}

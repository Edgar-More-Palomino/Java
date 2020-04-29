package com.java.Ejercicio;

import javax.swing.*;

public class e7_Caracter_Mayuscula {
    public static void main(String[] args) {
        char letra;
        letra= JOptionPane.showInputDialog(null,"digite una letra").charAt(0);
        if(Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "la letra es mayuscula");
        }else{
            JOptionPane.showMessageDialog(null,"la letra es minuscula");
        }
    }
}

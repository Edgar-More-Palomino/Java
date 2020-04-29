package com.java;

import javax.swing.*;

public class a5_Condicional_If_Else {
    public static void main(String[] args) {
        int numero, dato=5;
        numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if (numero==dato){
            JOptionPane.showMessageDialog(null,"son iguales");
        }else{
            JOptionPane.showMessageDialog(null,"es diferente de 5");
        }
    }
}

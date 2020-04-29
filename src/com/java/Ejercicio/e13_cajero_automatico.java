package com.java.Ejercicio;

import javax.swing.*;

public class e13_cajero_automatico {
    public static void main(String[] args) {
        final int monto = 1000;
        int operacion;
        double deposito, retiro, saldo_actual;
        operacion = Integer.parseInt(JOptionPane.showInputDialog("ingrese la operacion a realizar \n"
                + "1. Depositar a la cuenta \n"
                + "2. Retirar de la cuenta \n"
                + "3. Salir"));
        switch (operacion) {
            case 1:
                deposito = Double.parseDouble(JOptionPane.showInputDialog("deposite la cantidad"));
                saldo_actual = monto + deposito;
                JOptionPane.showMessageDialog(null, "el saldo actual es " + saldo_actual);
                break;
            case 2:
                retiro = Double.parseDouble(JOptionPane.showInputDialog("retire de su cuenta"));
                if (monto < retiro) {
                    JOptionPane.showMessageDialog(null, "salgo insuficiente...digite otra cantidad");
                } else {
                    saldo_actual = monto - retiro;
                    JOptionPane.showMessageDialog(null, "el salgo actual es " + saldo_actual);
                }
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "numero equivocado...");

        }

    }
}

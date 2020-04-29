package com.java.Ejercicio;

import javax.swing.*;

public class e6_Salario_extra_obrero {
    public static void main(String[] args) {
        int horas, sueldoTotal;
        horas = Integer.parseInt(JOptionPane.showInputDialog("ingrese horas trabajadas"));
        if (horas <= 40) {
            sueldoTotal=horas*16;
        } else {
            sueldoTotal=(horas*16)+(horas-40)*20;
        }
        System.out.println("total a pagar es "+sueldoTotal);
    }
}

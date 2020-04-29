package com.java.Ejercicio;

import javax.swing.*;

public class e27_Aprob_Condicion_Suspenso {
    public static void main(String[] args) {
        int nota, cont_aprobado = 0, cont_condicion = 0, cont_suspendido = 0;
        for (int i = 0; i < 6; i++) {
            nota = Integer.parseInt(JOptionPane.showInputDialog("ingrese nota"));
            System.out.println("las notas ingresadas son " +nota);
            if (nota >= 0 && nota <= 3) {
                cont_suspendido++;
            } else if (nota == 4) {
                cont_condicion++;
            } else {
                cont_aprobado++;
            }
        }

        System.out.println("la cantidad de aprobado son : " + cont_aprobado);
        System.out.println("la cantidad de condicionados son : " + cont_condicion);
        System.out.println("la cantidad de suspendio son : " + cont_suspendido);
    }
}

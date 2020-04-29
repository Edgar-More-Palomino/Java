package com.java.Ejercicio;

import javax.swing.*;

public class e24_Ilimitado_Nota_Media {
    public static void main(String[] args) {
        int num, acum_nota = 0, cont_nota = 0;
        double media_nota;
        //captura la cantidad de numeros a ingresados;
        cont_nota = Integer.parseInt(JOptionPane.showInputDialog("ingresar la cantidad de numeros a promediar"));
        System.out.println("la cantidad ingresada es " + cont_nota);
        for (int i = 0; i < cont_nota; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese las notal " + i));
            //"i" se repite las veces que saldra el cuadro de texto
            System.out.println("las notas ingresadas son " + num);
            //se tiene que sumar a acumular
            //otra forma de acumular
            // acum_nota+= JOptionPane.showConfirmDialog(null, "ingrese las notas");
            acum_nota += num;
        }
        media_nota = (float) acum_nota / cont_nota;
        System.out.println("la media es " + media_nota);
    }

}

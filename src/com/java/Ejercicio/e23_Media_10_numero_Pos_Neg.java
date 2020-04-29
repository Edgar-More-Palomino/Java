package com.java.Ejercicio;

import javax.swing.*;

public class e23_Media_10_numero_Pos_Neg {
    public static void main(String[] args) {
        //las variables como acum y cont se inician de cero
        int num, acum_pos = 0, acum_neg = 0, cont_pos = 0, cont_neg = 0, cont_cero = 0;
        double media_pos, media_neg;
        //solo me piden 10 numero, utilizamos el for
        for (int i = 1; i < 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero" + i));
            //para mostrar los numeros en pantalla que voy ingresando
            System.out.print(num+" ");
            if (num == 0) {
                cont_cero++;
            } else if (num > 0) {
                acum_pos += num; //acumulador o sumando
                cont_pos++; //contador de numeros
            } else {
                acum_neg += num; //acumulador o sumando
                cont_neg++; //contador de numeros
            }
        }
        if (cont_pos == 0) {
            System.out.println("\nno se visualiza los numeros positivos");
        } else {
            media_pos = (float) acum_pos / cont_pos;
            System.out.print("\nla media de los numeros positivos es " + media_pos);
        }
        if (cont_neg == 0) {
            System.out.println("\nno se visualiza los numeros negativos");
        } else {
            media_neg = (float) acum_neg / cont_neg;
            System.out.println("\nla media de los numeros negativos es " + media_neg);
        }


        System.out.println("\nla cantidad de ceros es " + cont_cero);
        System.out.println("la suma de los numeros positivos es " + acum_pos);
        System.out.println("la cantidad de numeros positivos es " + cont_pos);
        System.out.println("la suma de los numeros negativos es " + acum_neg);
        System.out.println("la cantidad de numeros negativos es " + cont_neg);

    }
}

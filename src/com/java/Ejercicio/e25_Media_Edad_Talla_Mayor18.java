package com.java.Ejercicio;

import javax.swing.*;

public class e25_Media_Edad_Talla_Mayor18 {
    public static void main(String[] args) {
        int acum_edad = 0, cont = 0,cont_mayor18=0, edad,cont_talla=0 ;
        double talla, media_edad, media_talla, acum_talla = 0;
        cont = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de alumnos a promediar: "));
        System.out.println("la cantidad de alumnos: " + cont);
        for (int i = 1; i <= cont; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+"\ningrese la edad: "));
            System.out.println("ingrese edad: " + edad);
            acum_edad += edad;
            talla = Double.parseDouble(JOptionPane.showInputDialog("Alumno "+i+"\ningrese la talla: "));
            System.out.println("ingrese talla " + talla);
            acum_talla += talla;
            if(edad>18){
                cont_mayor18++;
            }
            if(talla>1.75){
                cont_talla++;
            }
        }
        System.out.println("la cantidad de mayores de 18: "+cont_mayor18);

        System.out.println("la cantidad que supera el 1.75: "+cont_talla);

        media_edad = (float) acum_edad / cont;
        System.out.println("la media de las edades ingresadas " + media_edad);

        media_talla = (float) acum_talla / cont;
        System.out.println("la media de las tallas ingresadas " + media_talla);
    }
}

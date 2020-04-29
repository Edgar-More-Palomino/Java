package com.java.Ejercicio;

import javax.swing.*;

public class e10_Dia_Mes_Año_correcto {
    public static void main(String[] args) {
        int dia,mes,año;
        dia=Integer.parseInt(JOptionPane.showInputDialog("ingrese dia"));
        mes=Integer.parseInt(JOptionPane.showInputDialog("ingrese mes"));
        año=Integer.parseInt(JOptionPane.showInputDialog("ingrese año"));
        if(dia>=1 && dia <=30){
            if(mes>=0 && mes<=12){
                if(año!=0){
                    System.out.println("año correcto");
                }else{
                    System.out.println("año incorrecto");
                }
                System.out.println("mes correcto");
            }else{
                System.out.println("mes incorrecto");
            }
            System.out.println("dia correcto");
        }else{
            System.out.println("dia incorrecto");
        }
    }
}

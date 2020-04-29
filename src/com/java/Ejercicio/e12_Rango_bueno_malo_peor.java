package com.java.Ejercicio;

import javax.swing.*;

public class e12_Rango_bueno_malo_peor {
    public static void main(String[] args) {
        int nota;
        nota=Integer.parseInt(JOptionPane.showInputDialog("ingrese nota"));
        if(nota>=0 && nota<=2){
            System.out.println("Insufiente");
        }else if(nota>3 && nota<=4){
            System.out.println("suficiente");
        }else if(nota>5 && nota<=6){
            System.out.println("bueno");
        }else if(nota>7 && nota<=8){
            System.out.println("notable");
        }else{
            System.out.println("sobresaliente");
        }
    }
}

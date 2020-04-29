package com.java.Ejercicio;

import javax.swing.*;

public class e18_Numero_Azar_Contador_Intentos {
    public static void main(String[] args) {
        int num, alea, cont=0;
        num=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
        alea=(int)(Math.random()*100);
        while(num!=alea){
            if(num<alea){
                System.out.println("es mayor "+ num);
            }else{
                System.out.println("es menor "+ num);
            }
            num=Integer.parseInt(JOptionPane.showInputDialog("ingrese el otro numero"));
            cont++;
        }
        System.out.println("el numero es "+num +" y de intentos fueron "+cont);

    }


}

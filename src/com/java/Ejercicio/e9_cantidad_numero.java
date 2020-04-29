package com.java.Ejercicio;

import javax.swing.*;

public class e9_cantidad_numero {
    public static void main(String[] args) {
        int cantidad;
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
        if(cantidad<10){
            System.out.println("tiene una cifra");
        }else if(cantidad>=10 && cantidad<100){
            System.out.println("tiene dos cifras");
        }else if(cantidad>=100 && cantidad<1000){
            System.out.println("tiene tres cifras");
        }else if(cantidad>=1000 && cantidad<10000) {
            System.out.println("tiene cuatro cifras");
        }else if(cantidad>=10000 && cantidad<100000) {
            System.out.println("tiene cinco cifras");
        }else{
            System.out.println("se paso el limite");
        }
    }
}

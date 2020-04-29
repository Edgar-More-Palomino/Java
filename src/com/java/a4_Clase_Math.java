package com.java;

public class a4_Clase_Math {
    public static void main(String[] args) {
        //raiz cuadrada Math.sqrt
        double num1, base = 25, exp = 2, num2 = 4.67, num3;
        num1 = Math.sqrt(37.64);
        System.out.println("la raiz cuadrada es " + num1);

        //potenciacion
        num1 = Math.pow(base, exp);
        System.out.println("la potencia es " + num1);

        //redondear
        num2 = Math.round(num2);
        System.out.println("el redondeo es " + num2);

        //numero aleatorio
        num3 = Math.random();
        System.out.println("el numero aleatorio es " + num3);
    }
}

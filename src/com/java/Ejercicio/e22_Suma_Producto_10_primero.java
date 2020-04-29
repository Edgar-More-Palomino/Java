package com.java.Ejercicio;

public class e22_Suma_Producto_10_primero {
    public static void main(String[] args) {
        int prod = 1, cont = 0, acum = 0;
        for (int num = 1; num <= 20; num += 2) {
            System.out.println(num);
            prod *= num;
            acum = acum + num;
            cont++;

        }
        System.out.println("el producto de los 10 primros numeros impares es " + prod);
        System.out.println("la suma o acumulado es " + acum);
        System.out.println("la cantidad de numeros es " + cont);

    }

}

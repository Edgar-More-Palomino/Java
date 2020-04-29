package POO.Area_Perimetro_Cuadrilatero;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //creando los objeto de la clase Cuadrilatero

        Cuadrilatero cua1;//no se que constuctor a utilizar?

        //creacion de las variables

        double lado1=Double.parseDouble(JOptionPane.showInputDialog("ingrese el lado1"));
        System.out.println("el lado que ingreso es el "+lado1);//digitar el valor de los lados
        double lado2=Double.parseDouble(JOptionPane.showInputDialog("ingrese el lado2"));
        System.out.println("el lado que ingreso es el "+lado2);//digitar el valor de los lados

        if (lado1==lado2){
            cua1=new Cuadrilatero(lado1);
        }else{
            cua1=new Cuadrilatero(lado1,lado2);
        }
        System.out.println("el perimetro del cuadrilatero es "+cua1.getPerimetro());
        System.out.println("el area del cuadrilatero es "+cua1.getArea());
    }
}

package POO;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //------------------operacion(con atributos)--------------------
        /*int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        System.out.println("el numero digitado es " + n1);
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        System.out.println("el numero digitado es " + n2);
        */
        //-------------------------------------------------

        //------------------operacion(sin atributos)---------------------
        //se crea el objeto operacion
        /*
        int num1=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        System.out.println("el numero ingreso es "+num1);
        int num2=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        System.out.println("el numero ingreso es "+num2);
        operacion op = new operacion();
        int suma=op.sumar(num1,num2);
        int resta=op.restar(num1,num2);
        int multi=op.multiplicar(num1,num2);
        int div=op.division(num1,num2);

        System.out.println("la suma es "+suma+"\nla resta es "+resta
        +"\nla multiplicacion es "+multi +"\nla division es "+div);
        */
        //---------------------------------------------------------------------

        //-----------constructor(persona)
        /*Persona p1=new Persona("edgar","more",38);*/
        //---------------------------------------------------------------------

        //------------sobrecarga de metodos-----------------------------------

        Persona pers1= new Persona("edgar",38);
        pers1.correr();

        Persona pers2= new Persona("41499639");
        pers2.correr(1000);


    }
}

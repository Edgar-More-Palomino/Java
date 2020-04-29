package POO;

public class Estatico {

    private static String letra="bienvenidos";
    private static int sumar(int num1, int num2){
        int suma=num1+num2;
        return suma;

    }

    public static void main(String[] args) {
        System.out.println(Estatico.letra);
        System.out.println("la suma es "+Estatico.sumar(4,4));

    }


}

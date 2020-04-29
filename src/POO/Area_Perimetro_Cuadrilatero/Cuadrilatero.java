package POO.Area_Perimetro_Cuadrilatero;

public class Cuadrilatero {
    //atributos
    private double lado1;
    private double lado2;

    //creacion de los constructores

    //constructor 1-----------
    public Cuadrilatero(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //constructor 2-----------
    //solo basta tener un lado para el perimetro y area: Cuadrado
    public Cuadrilatero(double lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    //creacion de los getters para mostrar los resultados

    public double getPerimetro() {
        double perimetro= 2*(lado1+lado2);
        return perimetro;
    }

    public double getArea() {
        double area= (lado1*lado2);
        return area;
    }
}

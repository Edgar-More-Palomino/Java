package POO.Herencia;

public class Estudiante extends Persona {
    //atributos
    private int codigoEstudiante;
    private double notaFinal;

    //constructor


    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, double notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
/*
        System.out.println("mi nombre es " + getNombre());
        System.out.println("mi apellido es " + getApellido());
        System.out.println("mi edad es " + getEdad());
        System.out.println("mi codigo de estudiante es " + codigoEstudiante);
        System.out.println("mi nota final es " + notaFinal);
      */
    }

    //metodo para mostrar o imprimir datos
    public void mostrarDato() {
        System.out.println("mi nombre es" + getNombre() +
                "\nmi apellido es " + getApellido() +
                "\nmi edad es " + getEdad() +
                "\nmi codigo de estudiante es " + codigoEstudiante +
                "\nmi nota final es " + notaFinal);

    }
}



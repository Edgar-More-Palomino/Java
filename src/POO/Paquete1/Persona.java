package POO.Paquete1;

public class Persona {
    //atributos
    private final String nombre;
    private final String apellido;
    private int edad;

    //constructor


    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }
    public void MostrarMensaje(){
        System.out.println("mi nombre es " + nombre);
        System.out.println("mi apellido es " + apellido);
        System.out.println("mi edad es " + edad);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

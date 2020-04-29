package POO;

public class Persona {
    /*
    //atributos
    String nombre;
    String apellido;
    int edad;

    //constructor
    public Persona(String nom, String ape, int eda){
        String nombre=nom;
        String apellido=ape;
        int edad=eda;
        System.out.println("mi nombre es "+nombre+" "+apellido+" y mi edad es "+edad);
    }
    //metodos
    */

    //===============Sobrecarga de metodos====================
    //atributos
    String nombre;
    int edad;
    String dni;

    //constructor

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    public void correr(){
        System.out.println("mi nombre es "+nombre+" y mi edad es "+edad);
    }
    public void correr(int km){
        System.out.println("los kilometros que corri fue "+km);
    }
}

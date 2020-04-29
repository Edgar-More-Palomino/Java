package POO.Polimorfismo;

public class Vehiculo {
    //atributos
    protected String matricula;
    protected String marca;
    protected String modelo;

    //constructor para inicializarlo

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    //metodo getters (mostrar los datos)

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }


    public String mostrarDatos() {
        return "matricula " + matricula + "marca " + marca + "modelo " + modelo;
    }

}

package POO.Polimorfismo;

public class vehiculoTurismo extends Vehiculo {
    //atributos

    private int numeroPuerta;

    //constructor

    public vehiculoTurismo(String matricula, String marca, String modelo, int numeroPuerta) {
        super(matricula, marca, modelo);
        this.numeroPuerta = numeroPuerta;
    }
    //metodo getters

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    //metodo mostrar datos y se sobre escribe para atributo
    @Override
    public String mostrarDatos(){
        return "matricula " + matricula + "marca " + marca + "modelo " + modelo+"numero de puertas "+numeroPuerta;
    }
}

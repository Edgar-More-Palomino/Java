package POO.Polimorfismo;

public class vehiculoDeportivo extends Vehiculo {
    //atributos
    private int cilindrada;

    //constructor para inicializar los atributos


    public vehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    //metodo getter

    public int getCilindrada() {
        return cilindrada;
    }
    //metodo mostrarDatos y se sobre escribe
    @Override
    public String mostrarDatos(){
        return "matricula " + matricula + "marca " + marca + "modelo " + modelo+"cilindros "+cilindrada;
    }
}

package POO.Polimorfismo;

public class vehiculoFurgoneta extends Vehiculo {
    //atributos
    protected int carga;

    //constructor


    public vehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    //metodo getter para mostrar los datos

    public int getCarga() {
        return carga;
    }

    //metodo mostrar datos y se sobre escribe
    @Override
    public String mostrarDatos(){
        return "matricula " + matricula + "marca " + marca + "modelo " + modelo+"carga "+carga;
    }

}

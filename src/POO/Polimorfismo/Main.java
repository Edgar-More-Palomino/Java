package POO.Polimorfismo;

public class Main {

    public static void main(String[] args) {
        //creando los objetos
        Vehiculo vehiculo1=new Vehiculo("VR567 ","toyota "," clasico ");
        System.out.println(vehiculo1.mostrarDatos());

        Vehiculo vehiculo2=new vehiculoTurismo(" FR5678 "," ferrari "," turista ",4);
        System.out.println(vehiculo2.mostrarDatos());

        Vehiculo vehiculo3=new vehiculoDeportivo(" RE2345 "," tico "," paticular ",4000);
        System.out.println(vehiculo3.mostrarDatos());

        Vehiculo vehiculo4=new vehiculoFurgoneta(" MOR1234 "," Audi "," furgoneta ",4);
        System.out.println(vehiculo4.mostrarDatos());
    }




}

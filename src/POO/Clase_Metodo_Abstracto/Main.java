package POO.Clase_Metodo_Abstracto;

public class Main {
    public static void main(String[] args) {
        Planta planta=new Planta();
        planta.alimentarse();

        animalCarnivoro animalCarnivoro=new animalCarnivoro();
        animalCarnivoro.alimentarse();

        animalHerbivoro animalHerbivoro=new animalHerbivoro();
        animalHerbivoro.alimentarse();




    }
}

package POO.Clase_Metodo_Abstracto;

public class animalCarnivoro extends Animal {
    //creacion del metodo alimentarse
    @Override
        public void alimentarse(){
            System.out.println("los animales carnivoros se alimentan de carne");
        }
}

package POO.Paquete1;

public class clase2 {
    public static void main(String[] args) {
        //se crea el objeto
        clase1 cl1 = new clase1();
        cl1.setNombre("edgar");
        cl1.setApellido("more");
        cl1.setEdad(38);

        System.out.println("mi nombre es "+cl1.getNombre());
        System.out.println("mi apellido es "+cl1.getApellido());
        System.out.println("mi edad es "+cl1.getEdad());

    }
}

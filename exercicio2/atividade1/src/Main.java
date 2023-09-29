public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Urso", 20);
        System.out.println(animal);

        Cachorro cachorro = new Cachorro("Arnaldo", 28, "Labrador");
        System.out.println(cachorro);

        Peixe peixe = new Peixe("Pacu", 10, "Recife de Coral");
        System.out.println(peixe);
    }
}

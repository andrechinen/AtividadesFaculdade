public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Andre", 19, "Masculino", 5000, "01234", "Rh");
        Vendedor vendedor = new Vendedor("Kauan", 38, "Masculino", 2500, "56789", 12000, 50);

        System.out.println("Informações do Gerente:");
        System.out.println(gerente.toString());

        System.out.println("\nInformações do Vendedor:");
        System.out.println(vendedor.toString());
    }
}

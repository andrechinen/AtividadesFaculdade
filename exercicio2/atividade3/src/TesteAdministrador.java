public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Maria", "Rua Machado", "987654321", 2, 4000, 15, 500);

        System.out.println("Informações do Administrador:");
        System.out.println(administrador);

        administrador.setSalarioBase(4500);
        administrador.setImposto(18);
        administrador.setAjudaDeCusto(600);

        System.out.println("\nInformações atualizadas do Administrador:");
        System.out.println(administrador);
    }
}

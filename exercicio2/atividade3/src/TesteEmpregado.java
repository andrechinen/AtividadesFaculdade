public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("João", "Rua Diogo Machado", "123456789", 1, 3000, 10);

        System.out.println("Informações do Empregado:");
        System.out.println(empregado);

        empregado.setSalarioBase(3500);
        empregado.setImposto(12);

        System.out.println("\nInformações atualizadas do Empregado:");
        System.out.println(empregado);
    }
}

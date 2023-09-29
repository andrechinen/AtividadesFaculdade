public class TestePessoa {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Alberto", "Rua Diogo Machado", "123456789", 5000, 2000);
        Empregado empregado = new Empregado("Bruno", "Rua Alfredo", "987654321", 1, 3000, 10);

        System.out.println("Informações do Fornecedor:");
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Saldo: " + fornecedor.obterSaldo());

        System.out.println("\nInformações do Empregado:");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Salário Líquido: " + empregado.calcularSalario());
    }
}
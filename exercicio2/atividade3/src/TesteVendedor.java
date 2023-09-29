public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Ana", "Diogo Machado", "43423432454", 4, 3000, 10, 10000, 8);

        System.out.println("Informações do Vendedor:");
        System.out.println(vendedor.toString());

        vendedor.setSalarioBase(3200);
        vendedor.setImposto(9);
        vendedor.setValorVendas(12000);
        vendedor.setComissao(10);

        System.out.println("\nInformações atualizadas do Vendedor:");
        System.out.println(vendedor.toString());

        double salarioVendedor = vendedor.calcularSalario();
        System.out.println("\nSalário do Vendedor: " + salarioVendedor);
    }
}

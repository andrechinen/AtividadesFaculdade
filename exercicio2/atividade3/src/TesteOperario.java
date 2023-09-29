public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("Carlos", "Diogo Machado", "5551235489", 3, 2500, 10, 5000, 5);

        System.out.println("Informações do Operário:");
        System.out.println(operario.toString());

        operario.setSalarioBase(2600);
        operario.setImposto(11);
        operario.setValorProducao(6000);
        operario.setComissao(6);

        System.out.println("\nInformações atualizadas do Operário:");
        System.out.println(operario.toString());

        double salarioOperario = operario.calcularSalario();
        System.out.println("\nSalário do Operário: " + salarioOperario);
    }
}

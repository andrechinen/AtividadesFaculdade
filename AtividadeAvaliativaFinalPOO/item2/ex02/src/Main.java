import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Veiculo veiculo;

            System.out.println("Escolha o tipo de veiculo (A para Carro, B para Moto): ");
            char escolha = scanner.next().charAt(0);

            if (escolha == 'A' || escolha == 'a') {
                veiculo = Carro.cadastrarCarro();
            } else if (escolha == 'B' || escolha == 'b') {
                veiculo = Moto.cadastrarMoto();
            } else {
                System.out.println("Opcao invalida");
                return;
            }

            System.out.println("\nAntes do reajuste:");
            veiculo.printDados();

            Veiculo[] veiculos = {veiculo};
            double totalAntes = Veiculo.calcularTotalPreco(veiculos);
            System.out.printf("\nPreço: %.2f\n", totalAntes);

            if (veiculo instanceof Moto) {
                Moto.reajustarPrecoMotos(new Moto[]{(Moto) veiculo});
            } else if (veiculo instanceof Carro) {
                Carro.reduzirPrecoCarros(new Carro[]{(Carro) veiculo});
            }

            System.out.println("\nApós o reajuste:");
            veiculo.printDados();

            double totalDepois = Veiculo.calcularTotalPreco(veiculos);
            System.out.printf("\nPreço: %.2f\n", totalDepois);
        }
    }
}

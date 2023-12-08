import java.util.Scanner;

public class Moto extends Veiculo {
    private int ano;

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void printDados() {
        super.printDados();
        System.out.println("Ano: " + ano);
    }

    public static Moto cadastrarMoto() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Inserindo dados da moto:");

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Preço: ");
            double preco = scanner.nextDouble();

            System.out.print("Ano: ");
            int ano = scanner.nextInt();

            return new Moto(modelo, preco, ano);
        }
    }

    public static void reajustarPrecoMotos(Moto[] motos) {
        for (Moto moto : motos) {
            if (moto.getAno() >= 2008) {
                double novoPreco = moto.getPreco() * 1.1;
                moto.setPreco(novoPreco);
            }
        }
    }
}
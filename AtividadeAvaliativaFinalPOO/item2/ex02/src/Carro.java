import java.util.Scanner;

public class Carro extends Veiculo {
    private double km;

    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public void printDados() {
        super.printDados();
        System.out.println("Quilometragem: " + km);
    }

    public static Carro cadastrarCarro() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Inserindo dados do carro:");

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Preço: ");
            double preco = scanner.nextDouble();

            System.out.print("Quilometragem: ");
            double km = scanner.nextDouble();

            return new Carro(modelo, preco, km);
        }
    }

    public static void reduzirPrecoCarros(Carro[] carros) {
        for (Carro carro : carros) {
            if (carro.getKm() > 100000) {
                double novoPreco = carro.getPreco() * 0.92; 
                carro.setPreco(novoPreco);
            }
        }
    }
}
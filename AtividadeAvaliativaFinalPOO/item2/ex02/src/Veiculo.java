public class Veiculo {
    private String modelo;
    private double preco;

    public Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void printDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço:  " + preco);
    }

    public static double calcularTotalPreco(Veiculo[] veiculos) {
        double total = 0.0;
        for (Veiculo veiculo : veiculos) {
            total += veiculo.getPreco();
        }
        return total;
    }
}
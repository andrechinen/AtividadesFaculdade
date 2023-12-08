import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return String.format("Código: %d\nNome: %s\nPreço: %.2f", codigo, nome, preco);
    }

    public void inserirDados(Scanner scanner) {
        try {
            System.out.print("Insira o código: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Erro. Por favor, insira um número.");
                scanner.next(); 
            }
            this.codigo = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Insira o nome: ");
            this.nome = scanner.nextLine();

            System.out.print("Insira o preço: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Erro. Por favor, insira um número.");
                scanner.next(); 
            }
            this.preco = scanner.nextDouble();
        } finally {
            
        }
    }

    public void printDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Detalhes:\n" + getDetalhes());
    }
}

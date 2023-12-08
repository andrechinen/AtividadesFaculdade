import java.util.Scanner;

public class CD extends Midia {
    private int nMusicas;

    public CD(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public void inserirDados(Scanner scanner) {
        super.inserirDados(scanner);
        try {
            System.out.print("Insira o número de músicas: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); 
            }
            this.nMusicas = scanner.nextInt();
        } finally {
            
        }
    }
    
    @Override
    public void printDados() {
        super.printDados();
        System.out.println("Número de Músicas: " + nMusicas);
    }
}
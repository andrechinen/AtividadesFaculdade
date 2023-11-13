import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;
    private ArrayList<Telefone> telefones = new ArrayList<>();

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void addTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        if (endereco != null) {
            System.out.println("Endereço:");
            endereco.mostrarEndereco();
        }
        if (!telefones.isEmpty()) {
            System.out.println("Telefones:");
            for (Telefone telefone : telefones) {
                telefone.mostrarTelefone();
            }
        }
    }
}
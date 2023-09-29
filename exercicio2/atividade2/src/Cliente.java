public class Cliente extends Pessoa {
    private double valorDivida;
    private String dataNascimento;

    public Cliente(String nome, int idade, String sexo, double valorDivida, String dataNascimento) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.dataNascimento = dataNascimento;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Valor da Dívida: " + valorDivida + "\n" +
               "Data de Nascimento: " + dataNascimento;
    }
}
public class Telefone {
    private String numero;
    private String tipo;
    private String ddd;

    public Telefone(String numero, String tipo, String ddd) {
        this.numero = numero;
        this.tipo = tipo;
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void mostrarTelefone() {
        System.out.println("Tipo: " + tipo);
        System.out.println("DDD: " + ddd);
        System.out.println("Número de Telefone: " + numero);
    }
}
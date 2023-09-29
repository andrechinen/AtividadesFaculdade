public class Peixe extends Animal {
    private String tipoDeHabitat;

    public Peixe(String nome, double peso, String tipoDeHabitat) {
        super(nome, peso);
        this.tipoDeHabitat = tipoDeHabitat;
    }

    public String getTipoDeHabitat() {
        return tipoDeHabitat;
    }

    public void setTipoDeHabitat(String tipoDeHabitat) {
        this.tipoDeHabitat = tipoDeHabitat;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Tipo de Habitat: " + tipoDeHabitat;
    }
}
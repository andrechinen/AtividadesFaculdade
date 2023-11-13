public class Aluno extends Pessoa {
    private double notas;
    private Curso curso;

    public Aluno(String nome, String cpf, String email, double notas) {
        super(nome, cpf, email);
        this.notas = notas;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void mostrarAluno() {
        super.apresentar();
        System.out.println("Notas: " + notas);
        if (curso != null) {
            System.out.println("Curso: " + curso.getNome());
        }
    }
}
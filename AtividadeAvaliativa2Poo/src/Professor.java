import java.util.ArrayList;

public class Professor extends Pessoa {
    private String titulacao;
    private double salario;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Professor(String nome, String cpf, String email, String titulacao, double salario) {
        super(nome, cpf, email);
        this.titulacao = titulacao;
        this.salario = salario;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }

    public void mostrarProfessor() {
        super.apresentar();
        System.out.println("Titulação: " + titulacao);
        System.out.println("Salário: " + salario);
        System.out.println("Cursos Ministrados:");
        for (Curso curso : cursos) {
            System.out.println(" - " + curso.getNome());
        }
    }
}
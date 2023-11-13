import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Professor> professores;

    public Curso(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void addProfessores(Professor professor) {
        professores.add(professor);
    }

    public void mostrarCurso() {
        System.out.println("Curso: " + nome);
        if (!professores.isEmpty()) {
            System.out.println("Professores:");
            for (Professor professor : professores) {
                System.out.println(" - " + professor.getNome());
            }
        }
    }
}
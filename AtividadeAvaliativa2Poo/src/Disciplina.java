import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Aluno> alunos;
    private List<Curso> cursos;
    private Professor professor;

    public Disciplina(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void mostrarDisciplina() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Alunos matriculados:");
        for (Aluno aluno : alunos) {
            System.out.println(" - " + aluno.getNome());
        }
        System.out.println("Cursos relacionados:");
        for (Curso curso : cursos) {
            System.out.println(" - " + curso.getNome());
        }
        if (professor != null) {
            System.out.println("Professor responsável: " + professor.getNome());
            System.out.println("Cursos Ministrados pelo Professor:");
            for (Curso curso : professor.getCursos()) {
                System.out.println(" - " + curso.getNome());
            }
        } else {
            System.out.println("Nenhum professor atribuído a esta disciplina.");
        }
    }
}
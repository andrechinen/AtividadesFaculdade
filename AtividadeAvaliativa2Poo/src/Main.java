public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("rua1", "cidade1", "DF");
        Endereco endereco2 = new Endereco("rua2", "cidade2", "DF");
        Endereco endereco3 = new Endereco("rua3", "cidade3", "DF");

        Telefone telefone1 = new Telefone("numero1", "tipo1", "61");
        Telefone telefone2 = new Telefone("numero2", "tipo2", "61");
        Telefone telefone3 = new Telefone("numero3", "tipo3", "61");

        Aluno aluno1 = new Aluno("nome1", "cpf1", "email1", 10.0);
        aluno1.setEndereco(endereco1);
        aluno1.addTelefone(telefone1);

        Aluno aluno2 = new Aluno("nome2", "cpf2", "email2", 9.0);
        aluno2.setEndereco(endereco2);
        aluno2.addTelefone(telefone2);

        Curso curso1 = new Curso("curso1");
        Curso curso2 = new Curso("curso2");

        Professor professor1 = new Professor("nome1", "cpf1", "email1", "titulacao1", 9000.0);
        professor1.setEndereco(endereco3);
        professor1.addTelefone(telefone3);

        Disciplina disciplina1 = new Disciplina("disciplina1");

        disciplina1.adicionarAluno(aluno1);
        disciplina1.adicionarAluno(aluno2);
        disciplina1.adicionarCurso(curso1);
        disciplina1.adicionarCurso(curso2);
        disciplina1.setProfessor(professor1);

        professor1.addCurso(curso1);

        disciplina1.mostrarDisciplina();

        System.out.println("\nDados do primeiro aluno:");
        aluno1.mostrarAluno();

        System.out.println("\nDados do segundo aluno:");
        aluno2.mostrarAluno();

        System.out.println("\nDados do Professor:");
        professor1.mostrarProfessor();
    }
}
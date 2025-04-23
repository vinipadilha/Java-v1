package universidade;

public class Disciplina {
    private String nomeDisciplina;
    private Professor professor;
    private Aluno aluno;

    public Disciplina(String nomeDisciplina, Professor professor, Aluno aluno) {
        this.nomeDisciplina = nomeDisciplina;
        this.professor = professor;
        this.aluno = aluno;
    }

    public void mostrarInformacoes() {
        System.out.println("Disciplina: " + nomeDisciplina);
        System.out.println("Professor: " + professor.getNome() + " | ID: " + professor.getId());
        System.out.println("Aluno: " + aluno.getNome() + " | Matrícula: " + aluno.getMatricula());
    }
}

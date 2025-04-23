package universidade;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Carlos Silva", 123);
        Aluno aluno = new Aluno("Joana Lima", 456);
        Disciplina disciplina = new Disciplina("Programação Orientada a Objetos", prof, aluno);

        disciplina.mostrarInformacoes();
    }
}
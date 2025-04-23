package exe10;
import java.util.ArrayList;


public class Disciplina {
    private String nome;
    private ArrayList <Aluno> alunos;

    public Disciplina(){
        this.nome = "POO";
        this.alunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void listarAlunos(){
        for(Aluno aluno : alunos){
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Código: " + aluno.getCodigo());
            System.out.println("----------------------");
        }
    }

}

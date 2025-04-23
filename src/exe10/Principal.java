package exe10;

public class Principal {

    public static void main(String[] args){
        Disciplina disciplina = new Disciplina();

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Vinicius");
        aluno1.setCodigo("001");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("João");
        aluno2.setCodigo("002");

        disciplina.matricularAluno(aluno1);
        disciplina.matricularAluno(aluno2);

        disciplina.listarAlunos();

    }
}

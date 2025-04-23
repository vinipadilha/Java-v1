package universidade;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        System.out.println("Aluno criado com sucesso!");
    }

    public String getNome(){
        return nome;
    }

    public int getMatricula(){
        return matricula;
    }
}

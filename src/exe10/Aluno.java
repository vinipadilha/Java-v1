package exe10;

public class Aluno {
    private String nome;
    private String codigo;

    public Aluno(){
        this.nome = "";
        this.codigo = "";
    }

    public String getNome(){
        return nome;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
}

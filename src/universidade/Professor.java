package universidade;

public class Professor {
    private String nome;
    private int id;

    public Professor(String nome, int id){
        this.nome = nome;
        this.id = id;
        System.out.println("Professor criado");
    }

    public String getNome() {
        return nome;
    }

    public int getId(){
        return id;
    }

}

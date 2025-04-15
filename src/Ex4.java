import java.util.ArrayList;

public class Ex4 {

    public static void main(String[] args){

        ArrayList<Aluno> lista =  new ArrayList<>();

        lista.add(new Aluno("Vini", 18));
        lista.add(new Aluno("Igor", 19));
        lista.add(new Aluno("Eduardo", 20));

        for (Aluno aluno : lista){
            aluno.apresentar();
        }
    }
}

class Aluno {
    String nome;
    int idade;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        System.out.println("Aluno criado");
    }

    public void apresentar(){
        System.out.println("Olá, meu nome é " +nome+" e tenho " +  idade + " anos.");

    }

}
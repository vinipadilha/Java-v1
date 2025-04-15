import java.util.ArrayList;

public class Ex4 {

    public static void main(String[] args){

        ArrayList<Aluno> lista =  new ArrayList<>();

        lista.add(new Aluno("Vini", 18));
        //O objeto é uma "cópia" da classe, com valores reais. Ele é criado a partir da classe e ocupa espaço na memória.
        lista.add(new Aluno("Igor", 19));
        lista.add(new Aluno("Eduardo", 20));

        for (Aluno aluno : lista){
            aluno.apresentar();
        }
    }
}


// a classe é o molde, a estrtura
// define como os objetos vão ser e oque vão saber fazer
class Aluno {

    //atributos
    String nome;
    int idade;


    // construtor
    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        System.out.println("Aluno criado");
    }


    //metodo
    public void apresentar(){
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");

    }

}
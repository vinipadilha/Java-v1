public class Ex3 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Vinicius", 18);
        pessoa.apresentar();

        Pessoa pessoa1 = new Pessoa("Vitor", 20);
        pessoa1.apresentar();

        Pessoa pessoa2 = new Pessoa("Murilo", 21);
        pessoa2.apresentar();
    }

}


class Pessoa{
    String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        System.out.println("Pessoa Criada!");

    }

    public void apresentar(){
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
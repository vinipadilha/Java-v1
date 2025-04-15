public class Java01 {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        p1.nome = "Vini";
        p1.idade = 10;
        System.out.println("Meu nome é " + p1.nome + " e minha idade é " + p1.idade);

    }
}

class Pessoa{
    String nome;
    int idade;

    public Pessoa() {
        System.out.println("Pessoa criada!");
    }
}
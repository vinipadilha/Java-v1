public class Java01 {
    public static void main(String[] args){
        Pessoa1 p1 = new Pessoa1();
        p1.nome = "Vini";
        p1.idade = 10;
        System.out.println("Meu nome é " + p1.nome + " e minha idade é " + p1.idade);

    }
}

class Pessoa1{
    String nome;
    int idade;

    public Pessoa1() {
        System.out.println("Pessoa criada!");
    }
}
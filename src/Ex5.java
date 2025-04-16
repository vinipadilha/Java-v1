public class Ex5 {
    public static void main(String[] args){

    }
}

class Person{
    String nome;
    int idade;

    public Person(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        System.out.println("Person criado!");

    }

    public void apresentar(){
        System.out.println("Meu nome é " + nome + " e minha idade é " + idade);

    }
}
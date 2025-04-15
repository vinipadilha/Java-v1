public class Ex1 {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.marca = "BMW";
        carro.ano = 2010;

        System.out.println("Marca: " + carro.marca + " Ano: " + carro.ano);

    }
}


class Carro {
    String marca;
    int ano;

    public Carro() {
        System.out.println("Carro criado");
    }

}
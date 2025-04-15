public class Ex1 {
    public static void main(String[] args){
        Carro123 carro = new Carro123();
        carro.marca = "BMW";
        carro.ano = 2010;

        System.out.println("Marca: " + carro.marca + " Ano: " + carro.ano);

    }
}


class Carro123 {
    String marca;
    int ano;

    public Carro123() {
        System.out.println("Carro criado");
    }

}
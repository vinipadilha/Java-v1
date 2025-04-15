public class Ex2 {

    public static void main(String[] args){
        Carro carro1 = new Carro();
        carro1.marca = "Mercedes";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.marca = "BWM";
        carro2.ano = 2015;

        Carro carro3 = new Carro();
        carro3.marca = "Fiat";
        carro3.ano = 2018;


        carro1.mostrarInfo();
        carro2.mostrarInfo();
        carro3.mostrarInfo();



    }

}

class Carro {
    int ano;
    String marca;


    public Carro(){
        System.out.println("Carro criado!");

    }

    public void mostrarInfo(){
        System.out.println("Marca: " + marca + " - Ano: " + ano);

    }
}

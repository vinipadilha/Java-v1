public class Ex6 {

    public static void main (String[] args){
        Produto produto1 = new Produto("Café", 10.0, 0);
        produto1.mostrarInfo();
        produto1.adicionarEstoque(30);
        produto1.removerEstoque(2);
        produto1.mostrarInfo();
    }

}

class Produto{
    private String nome;
    private double preco;
    private int quantidade;


    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade){
        if (this.quantidade - quantidade < 0){
            System.out.println("O estoque não pode ser igual ou menor que zero");
        } else{
            this.quantidade -= quantidade;
        }
    }

    public void mostrarInfo(){
        System.out.println("´Produto: " + nome);
        System.out.println("´Preço: R$" + preco);
        System.out.println("´Quantidade: " + quantidade);
        System.out.println("==============================");
    }
}



public class Ra1_Ex1 {

    public static void main(String[] args){
        calculadora conta1 = new calculadora(10, 7);

        conta1.somar();
        conta1.subtrair();
    }

}

class calculadora{
    private int valor1;
    private int valor2;
    private int resultado;


    public calculadora(int valor1, int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;

    }

    public void somar(){
        resultado = valor1 + valor2;
        System.out.println(valor1 + " + " + valor2 + " = " + resultado);
    }

    public void subtrair(){
        resultado = valor1 - valor2;
        System.out.println(valor1 + " - " + valor2 + " = " + resultado);
    }

}



public class Teste {
    public static void main(String[] args) {
        Motor motor = new Motor();
        System.out.println("Status do motor: "+motor.isLigado());
        System.out.println("Chamando método para ligar o motor");
        motor.ligar();
        System.out.println("Status do motor: "+motor.isLigado());
        System.out.println("Chamando método para desligar o motor");
        motor.desligar();
        System.out.println("Status do motor: "+motor.isLigado());
    }
}
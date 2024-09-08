public class Main {
    public static void main(String[] args) {

        Forma circulo = new Circulo(5.0); //criando circulo e quadrado
        Forma Quadrado = new Quadrado (4.0);

        System.out.println("área do cículo é: " + circulo.calcularArea());
        System.out.println("Área do Quadrado é: " + Quadrado.calcularArea());
    }
}
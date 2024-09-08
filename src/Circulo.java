class Circulo extends Forma {
    private double raio; // variável guarda o raio

    public Circulo(double raio) {
      this.raio = raio;
    }

    @Override
    public double calcularArea() {
         return  Math.PI * raio * raio; // π * r²
    }
}

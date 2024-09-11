import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Circulo(7));
        formas.add(new Quadrado(4));
        formas.add(new Quadrado(4));
        formas.add(new Quadrado(8));

        System.out.println("A somatória das áreas totais é: " + calcTotal(formas) );

    }

    public static double calcTotal(ArrayList<Forma> formas) {
        double areaTotal = 0;
      for (Forma forma: formas){
          System.out.println(forma);
          areaTotal += forma.calcularArea();
      }
      return areaTotal;
    }

}
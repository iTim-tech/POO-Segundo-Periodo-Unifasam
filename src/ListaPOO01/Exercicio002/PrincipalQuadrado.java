package ListaPOO01.Exercicio002;

public class PrincipalQuadrado {
  public static void main(String[] args) {

    Quadrado q1 = new Quadrado(2.0);

    Quadrado q2 = new Quadrado(4.0);

    Quadrado q3 = new Quadrado(5.0);

    System.out.println("Área e Perímetro dos quadrados:");
    System.out.println("Área q1: " + q1.getArea(q1.lado) + "\nPerímetro q1: " + q1.getPerimetro(q1.lado));
    System.out.println("\nArea q2: " + q2.getArea(q2.lado) + "\nPerimetro q2: " + q2.getPerimetro(q2.lado));
    System.out.println("\nArea q3: " + q3.getArea(q3.lado) + "\nPerimetro q3: " + q3.getPerimetro(q3.lado));

  }
}

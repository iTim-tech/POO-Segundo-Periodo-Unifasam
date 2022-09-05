package ListaEntradaSaida;

import java.util.Scanner;

public class Exercicio009 {
  /*
   * Faça um algoritmo que leia o RAIO (R) e calcule a ÁREA e o PERÍMETRO de uma
   * esfera. Area = πR² e Perimetro = 2πR. Considere π = Math.PI
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Este algoritmo irá clcular a área e o perímetro de uma esfera: ");
    System.out.println("Insira o raio: ");
    double r = scanner.nextDouble();

    double area = Math.PI * (r * r);
    double perimetro = (Math.PI * Math.PI) * r;

    System.out.println("Área: " + area + ". \nPerímetro: " + perimetro);

    scanner.close();
  }
}

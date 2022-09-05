package ListaEntradaSaida;

import java.util.Scanner;

public class Exercicio011 {
  /*
   * Dados os pontos A e B, cujas coordenadas reais A(x1, y1) e B(x2, y2) serão
   * informadas
   * via teclado, escreva um programa que calcule a distância euclidiana entre A e
   * B, onde:
   * 𝐷𝑖𝑠𝑡𝑎𝑛𝑐𝑖𝑎𝐸𝑢𝑐𝑙𝑖𝑑𝑖𝑎𝑛𝑎 = √(𝑦2 − 𝑦1)² + (𝑥2 − 𝑥1)²
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa irá calcular a distância euclidiana entre um ponto A e B: ");
    System.out.println("Informe o x1 da coordenada do ponto A: ");
    double x1 = scanner.nextDouble();

    System.out.println("Informe o y1 da coordenada do ponto A: ");
    double y1 = scanner.nextDouble();

    System.out.println("Informe o x2 da coordenada do ponto B: ");
    double x2 = scanner.nextDouble();

    System.out.println("Informe o y2 da coordenada do ponto B: ");
    double y2 = scanner.nextDouble();

    double yR = (y2 - y1);
    double yResolvido = yR * yR;

    double xR = (x2 - x1);
    double xResolvido = xR * xR;

    double equacaoEuclidiana = Math.sqrt(yResolvido + xResolvido);

    System.out.println("A distância euclidiana entre A e B é: " + equacaoEuclidiana);

    scanner.close();

  }
}

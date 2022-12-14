package ListaEntradaSaida;

import java.util.Scanner;

public class Exercicio011 {
  /*
   * Dados os pontos A e B, cujas coordenadas reais A(x1, y1) e B(x2, y2) serΓ£o
   * informadas
   * via teclado, escreva um programa que calcule a distΓ’ncia euclidiana entre A e
   * B, onde:
   * π·ππ π‘ππππππΈπ’ππππππππ = β(π¦2 β π¦1)Β² + (π₯2 β π₯1)Β²
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa irΓ‘ calcular a distΓ’ncia euclidiana entre um ponto A e B: ");
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

    System.out.println("A distΓ’ncia euclidiana entre A e B Γ©: " + equacaoEuclidiana);

    scanner.close();

  }
}

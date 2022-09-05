package ListaEntradaSaida;

import java.util.Scanner;

public class Exercicio010 {
  /*
   * Faça um algoritmo que leia x e y e resolva a equação abaixo:
   * 𝐸𝑞 = 2 ∗ √3𝑥 + 30 + (𝑦 − 32)↑4
   * 3
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Esse algoritmo vai resolver uma equação muito louca: ");
    System.out.println("Insira o valor de X: ");
    double X = scanner.nextDouble();

    System.out.println("Insira o valor de Y: ");
    double Y = scanner.nextDouble();

    double x1 = (3 * X + 30) / 3;
    double y1 = (Y - 32);
    double y2 = y1 * y1 * y1 * y1;
    double equacao = 2 * Math.sqrt(x1) + y2;

    System.out.println("A resolução é: " + equacao + ".");

    scanner.close();
  }
}

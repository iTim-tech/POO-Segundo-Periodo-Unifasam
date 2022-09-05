package Lista234;

import java.util.Scanner;

public class Exercicio009 {
  /*
   * Escreva um programa que receba dois números x e y e calcule x^y.
   * Sem utilizar a biblioteca Math.
   */

  public static void main(String[] args) {
    Double x, y, calculo;
    int i = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Este progama calcula x^y, só que mais difícil (pra quem tá escrevendo o código).");
    System.out.println("Digite o valor de x: ");
    x = scanner.nextDouble();

    System.out.println("Digite o valor de y: ");
    y = scanner.nextDouble();

    calculo = x;
    while (i < (y - 1)) {
      calculo = calculo * x;
      i++;
    }

    System.out.println("Resultado de " + x + "^" + y + " = " + calculo);

    scanner.close();
  }
}

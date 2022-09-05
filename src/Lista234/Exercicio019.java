package Lista234;

import java.util.Scanner;

public class Exercicio019 {
  /*
   * Altere o programa anterior para que dessa vez seja desenhado o triângulo
   * deitado para a direita.
   */

  public static void main(String[] args) {
    int j, i, k = 1;

    Scanner scanner = new Scanner(System.in);

    System.out.println(
        "Este programa desenha uma triângulo deitado para a direita: ");

    char[][] asterisco = new char[7][7];

    System.out.println("----------------------------");

    for (i = 0; i < 7; i++) {
      for (j = 0; j <= i; j++) {
        if (i <= 4) {
          asterisco[i][j] = '*';
          System.out.print(asterisco[i][j]);
        } else if (i > 4) {
          for (j = 0; j < i - k; j++) {
            asterisco[i][j] = '*';
            System.out.print(asterisco[i][j]);
          }
          System.out.print("\n");

          // a variável "k" estava criando uym loop infinito, então precisei determinar o
          // quanto ela iria incrementar.

          if (i == 5) {
            k++;
          }
          if (k == 5) {
            i = 6;
            j = 6;
          }
        }
      }
      System.out.print("\n");
    }

    scanner.close();
  }
}

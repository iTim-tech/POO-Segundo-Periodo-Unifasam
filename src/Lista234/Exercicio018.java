package Lista234;

import java.util.Scanner;

public class Exercicio018 {
  /*
   * Desenhe a seguinte pirâmide de asteriscos. O usuário deve determinar a
   * quantidade de
   * linhas.
   */

  public static void main(String[] args) {
    int linhas, colunas, j, i;

    Scanner scanner = new Scanner(System.in);

    System.out.println(
        "Este programa desenha uma triângulo retângulo, mas você determina a quantidade de linhas\nDigite quantas linhas deseja: ");
    linhas = scanner.nextInt();

    colunas = linhas;
    char[][] asterisco = new char[linhas][colunas];

    System.out.println("----------------------------");

    for (i = 0; i < linhas; i++) {
      for (j = 0; j <= i; j++) {
        asterisco[i][j] = '*';
        System.out.print(asterisco[i][j]);
      }
      System.out.print("\n");
    }

    scanner.close();
  }

}

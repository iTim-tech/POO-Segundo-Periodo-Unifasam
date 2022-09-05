package Lista234;

import java.util.Scanner;

public class Exercicio001 {
  /*
   * Crie um programa para determinar se um número inteiro A é divisível por
   * outro número B. Os valores devem ser fornecidos pelo usuário.
   */
  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A, B, restoDivisao;
    System.out.println("Este programa irá determinar se dois números são divisiveis entre si.");
    System.out.println("Insira o número (inteiro) A: ");
    A = scanner.nextInt();

    System.out.println("Insira o número (inteiro) B: ");
    B = scanner.nextInt();

    restoDivisao = A % B;
    /*
     * A verificação se um número é divisivel por outro se dá por:
     * se o resto for = 0, é divisivel
     * se não, não é divisivel;
     */

    if (restoDivisao == 0) {
      System.out.println(A + " é divisível por " + B + ".");
    } else {
      System.out.println(A + " não é divisível por 5" + B + ".");
    }

    scanner.close();
  }
}

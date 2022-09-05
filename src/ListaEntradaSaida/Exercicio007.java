package ListaEntradaSaida;

import java.util.Scanner;

public class Exercicio007 {
  /*
   * Uma Progressão Aritmética (P.A) é determinada pela sua razão (r) e pelo seu
   * primeiro
   * termo (a1). Escreva um programa que determine o n-ésimo termo de uma P.A
   * utilizando
   * a fórmula abaixo. Para tal, leia o primeiro termo, a razão e o valor de n que
   * representa o
   * índice do n-ésimo termo. Ao final, imprima o valor da P.A de n (an).
   * Fórmula: an = a1 + (n - 1) * r
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Esse programa irá determinar o n-ésimo termo de uma P.A. (Progressão Aritmética): ");
    System.out.println("Para isso, insira o primeiro termo: ");
    int a1 = scanner.nextInt();

    System.out.println("Insira o segundo termo: ");
    // Pedi o segundo termo para poder calcular a razão
    int a2 = scanner.nextInt();

    int r = a2 - a1;

    System.out.println("Insira o valor de n: ");
    int n = scanner.nextInt();

    int calculoPA = a1 + (n - 1) * r;

    System.out.println("A P.A. de n é: " + calculoPA);

    scanner.close();

  }

}

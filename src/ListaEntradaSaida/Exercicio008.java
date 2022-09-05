package ListaEntradaSaida;

import java.util.Scanner;

public class Exercicio008 {
  /*
   * Faça um programa que leia 2 números inteiros A e B. Em seguida realize a
   * troca dos
   * números, onde o valor da variável B seja colocado em A e vice-versa.
   * Apresente os
   * valores trocados.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa irá trocar o valor das variáveis A e B (números inteiros): ");
    System.out.println("Insira o valor de A: ");
    Integer A = scanner.nextInt();

    System.out.println("Insira o valor de B: ");
    Integer B = scanner.nextInt();

    Integer C = A;
    A = B;
    B = C;

    System.out.println("O valor de A agora é: " + A + ", e o valor de B é: " + B + ".");

    scanner.close();
  }
}

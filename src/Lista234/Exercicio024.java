package Lista234;

import java.util.Scanner;

public class Exercicio024 {
  /*
   * Faça um programa que leia um código inteiro e um vetor de 10 posições de
   * números reais.
   * Se o código for zero, termine o programa. Se for 1, mostre o vetor na ordem
   * direta. Se for
   * 2, mostre o vetor na ordem inversa.
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao, posicao = 1;
    double[] numeros = new double[10];

    System.out.println("Este programa faz umas parada com o vetor. \nInsira os valores do vetor:");
    for (int i = 0; i < 10; i++) {
      System.out.print("Posição (" + posicao + ")");
      numeros[i] = scanner.nextDouble();
      posicao++;
    }

    do {
      System.out.println(
          "\n\nDigite \"1\" para imprimir o vetor natural ou \"2\" para imprimir o vetor de maneira invertida!\nDigite \"0\" para finalizar.");
      opcao = scanner.nextInt();
      switch (opcao) {
        case 0:
          System.out.println("Programa finalizado!");
          break;
        case 1:
          System.out.println("Vetor natural:");
          for (int i = 0; i < 10; i++) {
            System.out.print("|" + numeros[i]);
          }
          break;
        case 2:
          System.out.println("Vetor invertido:");

          for (int i = 9; i >= 0; i--) {
            System.out.print("|" + numeros[i]);
          }
          break;
        default:
          System.out.println("Opçao invalida!");
      }

    } while (opcao != 0);

    scanner.close();
  }

}

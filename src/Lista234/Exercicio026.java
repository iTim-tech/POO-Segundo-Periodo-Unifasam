package Lista234;

import java.util.Scanner;

public class Exercicio026 {
  /*
   * Faça um programa que leia um vetor de inteiros de 10 posições e garanta que
   * todos os
   * elementos presentes no vetor sejam todos distintos entre si.
   */
  public static void main(String[] args) {
    int[] vetor = new int[10];
    int posicao = 1;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa garante a distinção dos números de um vetor.");
    System.out.println("Digite os valores do vetor: ");
    for (int i = 0; i < 10; i++) {
      System.out.println("Posição (" + posicao + "):");
      vetor[i] = scanner.nextInt();
      for (int j = 0; j < i; j++) {
        if (vetor[j] == vetor[i]) {
          while (vetor[j] == vetor[i]) {
            System.out.println("Valor existente!\nDigite um valor diferente:");
            vetor[i] = scanner.nextInt();
          }
        } else {
          continue;
        }
      }
      posicao++;
    }

    System.out.println("Vetor: ");

    for (int i = 0; i < 10; i++) {
      System.out.print("|" + vetor[i]);
    }

    scanner.close();
  }
}

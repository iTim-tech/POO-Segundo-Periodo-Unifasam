package Lista234;

import java.util.Scanner;

public class Exercicio020 {
  /*
   * Faça um programa que leia um vetor de inteiros, de 10 posições. A seguir,
   * encontre o
   * menor elemento (X) e o maior elemento (Y) do vetor. Imprima uma mensagem
   * mostrando: “O menor elemento do vetor é”, X, “e sua posição dentro do vetor
   * é: V[x]. Já
   * o maior elemento é “, Y,” e está na posição V[y]”. Assuma que os elementos
   * informados
   * no vetor são todos diferentes entre si.
   */

  public static void main(String[] args) {
    int[] vetorInt = new int[10];
    int maiorNumero = 0, menorNumero = 0, contador = 1, aux = 0, resposta;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Este programa analisa o maior e menor valor em um vetor.");
    System.out.println("Insira os (10) valores do vetor:");

    for (int i = 0; i < vetorInt.length; i++) {
      System.out.print("(" + contador + "): ");
      resposta = scanner.nextInt();
      vetorInt[i] = resposta;
      contador++;
    }

    for (int i = 0; i < vetorInt.length; i++) {
      aux = vetorInt[i];
      for (int j = 0; j < vetorInt.length; j++) {
        if (vetorInt[i] > vetorInt[j + 1]) {
          maiorNumero = vetorInt[i];
        } else {
          maiorNumero = aux;
        }
      }
    }
    System.out.println("O maior número no vetor é: "
        + maiorNumero + "\nO menor número no vetor é: " + menorNumero);

    scanner.close();
  }
}

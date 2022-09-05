package Lista234;

import java.util.Scanner;

public class Exercicio021 {
  /*
   * Escreva um programa que receba quinze números inteiros e armazene em um vetor
   * a raiz
   * quadrada de cada número. Caso o valor digitado seja menor do que zero, o
   * número -1
   * deve ser atribuído ao elemento do vetor. Após isso, imprima todos os valores
   * armazenados.
   */

  public static void main(String[] args) {
    int q = 5, contador = 1, resposta;
    double[] vetorDouble = new double[q];
    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa calcula a raiz quadrada de vários números. \nDigite os números:");

    System.out.println(Math.sqrt(2));

    for (int i = 0; i < vetorDouble.length; i++) {
      System.out.print("Posição (" + contador + "): ");
      resposta = scanner.nextInt();
      if (resposta < 0) {
        vetorDouble[i] = -1;
      } else if (resposta >= 0) {
        vetorDouble[i] = Math.sqrt(resposta);
      }
      contador++;
    }

    System.out.println("_________________________________");

    contador = 1;
    for (int i = 0; i < vetorDouble.length; i++) {
      System.out.println("Posição (" + contador + "): " + vetorDouble[i]);
      contador++;
    }

    scanner.close();
  }
}

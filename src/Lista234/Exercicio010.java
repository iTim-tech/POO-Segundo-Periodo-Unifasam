package Lista234;

import java.util.Scanner;

public class Exercicio010 {
  /*
   * Escreva um programa que calcule o fatorial de um número inteiro N fornecido
   * pelo usuário. Cuidado com valores inválidos!
   */
  public static void main(String[] args) {
    int n, calculo = 1, aux, i = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa calcula o fatoral de um número.\n"
        + "Digite um número inteiro para ser fatorado: ");
    n = scanner.nextInt();

    while (n < 0) {
      System.out.println("Número inválido!\n"
          + "Digite um número (inteiro) válido: ");
      n = scanner.nextInt();
    }

    calculo = n;
    aux = n;
    while (i < n - 1) {
      aux--;
      calculo = calculo * aux;
      i++;
    }

    System.out.println("O resultado da fatoração de " + n + "! = " + calculo);

    scanner.close();
  }
}

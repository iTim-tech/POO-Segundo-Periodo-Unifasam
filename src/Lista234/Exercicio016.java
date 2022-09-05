package Lista234;

import java.util.Scanner;

public class Exercicio016 {
  /*
   * Faça um programa que leia um numero inteiro N e mostre todos os números
   * primos entre
   * 1 e N. Número primo é aquele que é divisível apenas por 1 e ele mesmo.
   * Ex. 17 é um número primo, pois só é divisível por 1 e por ele mesmo.
   */

  public static void main(String[] args) {
    int numero, resto, aux;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa mostra os números primos entre 1 e N (número dado pelo usuário).");
    System.out.println("Digite um número: ");
    numero = scanner.nextInt();

    System.out.println("No intervalo de 1 a " + numero + ", são números primos: ");

    aux = numero;
    for (int i = 2; i <= numero; i++) {
      aux = i;
      for (int j = 2; j < aux; j++) {
        resto = aux % j;
        if (resto == 0) {
          System.out.println(aux + "False");
        }
        System.out.println(aux + "True");

      }
      /*
       * resto = i % i;
       * if (resto == 0) {
       * System.out.print(i + ", ");
       * }
       */
    }
    scanner.close();
  }
}

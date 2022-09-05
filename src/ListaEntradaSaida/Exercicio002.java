package ListaEntradaSaida;

import java.util.Scanner;

public class Exercicio002 {
  /*
   * Escreva um programa que leia dois números inteiros e imprima a seguinte
   * saída, com os
   * valores calculados, sabendo que o primeiro número informado será o dividendo
   * e o
   * segundo, o divisor:
   * Dividendo =
   * Divisor =
   * Quociente =
   * Resto =
   * Obs. Para obter o resto de uma divisão utilize o operador %.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Este programa funciona como uma calculadora que só divide: ");
    System.out.println("Insira um dividendo: ");
    double dividendo = scanner.nextDouble();

    System.out.println("Insira um divisor: ");
    double divisor = scanner.nextDouble();

    double quociente = dividendo / divisor;

    double resto = dividendo % divisor;

    System.out.println("Dividendo = " + dividendo);
    System.out.println("Divisor = " + divisor);
    System.out.println("Quociente = " + quociente);
    System.out.println("Resto = " + resto);

    scanner.close();

  }
}

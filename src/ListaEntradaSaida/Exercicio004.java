package ListaEntradaSaida;

import java.util.Scanner;

public class Exercicio004 {
  /*
   * Leia uma temperatura em graus Celsius e apresente-a convertida em graus
   * Fahrenheit. A
   * formula de conversão: F = C∗(9.0/5.0)+32.0, sendo F a temperatura em
   * Fahrenheit e C
   * a temperatura em Celsius.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa irá converter graus Celsius em Fahrenheit: ");
    System.out.println("Insira os graus em celsius: ");
    double celsius = scanner.nextDouble();

    double conversao = celsius * (9.0 / 5.0) + 32.0;

    System.out.println("A temperatura " + celsius + "° em Farenheit é: " + conversao + "°F.");

    scanner.close();
  }
}

package ListaEntradaSaida;

import java.util.Scanner;

public class Exercicio003 {
  /*
   * Escreva um programa que pergunte o nome e a idade de um indivíduo e imprima
   * (aproximadamente) quantos dias de vida ele possui. Considere que o ano tem
   * 365 dias.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Este programa irá prever o dia da sua morte: ");
    System.out.println("Insira seu nome: ");
    String nome = scanner.nextLine();

    System.out.println("Insira a sua idade: ");
    int idade = scanner.nextInt();

    // Variável pra armazenar a expectativa média de vida no Brasil
    int mediaBrasil = 76;
    int diasRestantes = (mediaBrasil - idade) * 365;

    System.out.println("Segundo o IBGE a expectativa média de vida no Brasil é de 76 anos \n"
        + nome + " você tem apropximadamente " + diasRestantes + " dias de vida restantes.");

    scanner.close();
  }
}

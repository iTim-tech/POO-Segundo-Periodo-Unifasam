package ListaEntradaSaida;

import java.util.Scanner;

public class Exercicio001 {
  /*
   * Faça um programa que leia o nome e sobrenome de duas pessoas (marido e
   * esposa) e um
   * ano (inteiro). E exiba a seguinte mensagem: “Fulano da Silva é casado com
   * Ciclana de
   * Souza há XX anos”. Considere o ano atual como 2018.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa calcula quanto tempo de casado um casal tem: ");

    System.out.println("Insira o nome e sobrenome do seu cônjuge: ");
    String nomeConjuge = scanner.nextLine();

    System.out.println("Insira o seu nome e sobrenome: ");
    String nome = scanner.nextLine();

    System.out.println("Insira o ano em que vocês se casaram: ");
    int ano = scanner.nextInt();

    int tempoDeCasamento = 2018 - ano;

    System.out.println(nomeConjuge + " é casado(a) com " + nome + " há " + tempoDeCasamento + " anos.");
    scanner.close();
  }

}

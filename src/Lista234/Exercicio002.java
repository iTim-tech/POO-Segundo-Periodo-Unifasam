package Lista234;

import java.util.Scanner;

public class Exercicio002 {
  /*
   * Crie um algoritmo que peça a idade do eleitor e o mesmo informe se o eleitor
   * é facultativo (entre 16 e 17 anos) ou obrigatório (entre 18 a 65)
   * ou dispensado (acima de 65).
   */
  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nomeUsuario;
    int idadeUsuario;

    System.out.println("Este programa analisa seu nível de responsabilidade eleitoral: ");
    System.out.println("Qual o seu nome?");
    nomeUsuario = scanner.nextLine();

    System.out.println(nomeUsuario + " qual é a sua idade?");
    idadeUsuario = scanner.nextInt();

    if (idadeUsuario <= 15) {
      System.out.println(nomeUsuario + ", você não tem idade suficiente para votar.");
    } else if (idadeUsuario >= 16 && idadeUsuario <= 17) {
      System.out.println(nomeUsuario + ", para você o voto é facultativo.");
    } else if (idadeUsuario >= 18 && idadeUsuario <= 65) {
      System.out.println(nomeUsuario + ", para você o voto é obrigatório.");
    } else if (idadeUsuario > 65) {
      System.out.println(nomeUsuario + ", para você o voto é opcional.");
    }

    scanner.close();
  }
}

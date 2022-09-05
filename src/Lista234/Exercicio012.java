package Lista234;

import java.util.Scanner;

public class Exercicio012 {
  /*
   * Faça um programa que Leia o Nome e duas notas de uma pessoa e ao final, o
   * programa
   * deve calcular a média aritmética entre as duas notas. O programa deve ser
   * capaz de validar
   * se a nota informada é válida (0.0 ≤ nota ≤ 10), caso contrário o sistema deve
   * informar ao
   * usuário o erro e pedir para ler novamente. Usar um laço Faça-Enquanto na
   * leitura das
   * notas, e gerar uma saída conforme o exemplo de tela de saída abaixo:
   */

  public static void main(String[] args) {
    double grauA, grauB, mediaAritmetica;
    String nomeAluno, resposta = "resposta";
    int opc = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa calcula a média aritmética entre duas notas do aluno.");

    do {
      System.out.println("Digite o nome do aluno:");
      nomeAluno = scanner.nextLine();

      System.out.println("Digite o grau A do aluno:");
      grauA = scanner.nextDouble();

      while (grauA < 0.0 || grauA > 10) {
        System.out.println("A nota inserida é inválida.\n"
            + "Digite uma nota válida (entre 0 e 10)");
        grauA = scanner.nextDouble();
      }

      System.out.println("Digite o grau B do aluno:");
      grauB = scanner.nextDouble();

      while (grauB < 0.0 || grauB > 10) {
        System.out.println("A nota inserida é inválida.\n"
            + "Digite uma nota válida (entre 0 e 10)");
        grauB = scanner.nextDouble();
      }
      mediaAritmetica = (grauA + grauB) / 2;

      System.out.println("O aluno " + nomeAluno + " tem média aritmética = " + mediaAritmetica);
      // + "\nContinuar (sim/nao)?");

      /*
       * while (resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("nao"))
       * {
       * System.out.println("Opção inválida, digite \"sim\" ou \"nao\":");
       * resposta = scanner.nextLine();
       * }
       */

      for (int i = 0; i == 0; i++) {
        System.out.println("Continuar (sim/nao)?");
        resposta = scanner.nextLine();
      }

      if (resposta.equalsIgnoreCase("sim")) {
        opc = 1;
      } else if (resposta.equalsIgnoreCase("nao")) {
        opc = 2;
      }

      // scanner.nextLine();

      /*
       * if (resposta.equalsIgnoreCase("sim")) {
       * opc = 1;
       * } else if (resposta.equalsIgnoreCase("nao")) {
       * opc = 0;
       * }
       */

    } while (opc == 1);

    scanner.close();
  }
}

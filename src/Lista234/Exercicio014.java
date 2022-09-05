package Lista234;

import java.util.Scanner;

public class Exercicio014 {
  /*
   * Faça um programa que receba 2 notas (valide as notas, onde 0.0 ≤ nota ≤ 10)
   * de um
   * número indeterminado de alunos. Calcule e mostre:
   * a. A média aritmética das 2 notas lidas;
   * b. Uma mensagem de acordo com as regras: Até 3 (Reprovado); Entre 3 e 7
   * (Exame); de 7 para cima (Aprovado);
   * c. O total de alunos;
   * d. Quantidade de alunos Aprovados, Reprovados e de Exame.
   * e. A Média da classe.
   * f. O nome e a média dos Alunos com a maior e menor média da classe.
   */
  public static void main(String[] args) {
    double n1, n2, mediaAritmetica;
    int opc = 1, contagemAlunos = 0, quantidadeReprovado = 0,
        quantidadeExame = 0, quantidadeAprovado = 0;
    String nomeAluno, situacaoAluno;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa faz o balanço de aprovação, média, quantidade de alunos e mais");

    do {
      System.out.println("Digite o nome do aluno:");
      nomeAluno = scanner.nextLine();

      System.out.println("Digite a n1 do aluno:");
      n1 = scanner.nextDouble();

      while (n1 < 0 || n1 > 10) {
        System.out.println("A nota " + n1 + " é inválida!\nDigite uma nota válida:");
        n1 = scanner.nextDouble();
      }

      System.out.println("Digite a n2 do aluno:");
      n2 = scanner.nextDouble();

      while (n2 < 0 || n2 > 10) {
        System.out.println("A nota " + n2 + " é inválida!\nDigite uma nota válida:");
        n2 = scanner.nextDouble();
      }

      mediaAritmetica = (n1 + n2) / 2;

      if (mediaAritmetica >= 0 && mediaAritmetica <= 3) {
        situacaoAluno = "Reprovado!";
        quantidadeReprovado++;
      } else if (mediaAritmetica > 3 && mediaAritmetica < 7) {
        situacaoAluno = "Exame!";
        quantidadeExame++;
      } else if (mediaAritmetica >= 7 && mediaAritmetica <= 10) {
        situacaoAluno = "Aprovado!";
        quantidadeAprovado++;
      }

      System.out.println("Deseja continuar (1 = sim / 2 = não)? ");
      opc = scanner.nextInt();

      while (opc < 1 || opc > 2) {
        System.out.println("Código inválido!\nDigite um código válido (1 = sim / 2 = não)");
        opc = scanner.nextInt();
      }

      contagemAlunos++;
    } while (opc == 1);

    System.out.println("Nome do aluno: " + nomeAluno +
        "\nQuantidade total de alunos: " + contagemAlunos);
    scanner.close();
  }
}

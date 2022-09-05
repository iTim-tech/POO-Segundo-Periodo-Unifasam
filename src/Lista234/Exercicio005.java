package Lista234;

import java.util.Scanner;

public class Exercicio005 {
  /*
   * Escrever um programa que leia o número de identificação, as 3 notas obtidas
   * por um aluno nas 3 verificações e a média dos exercícios que fazem parte
   * da avaliação. Valide para que todas as entradas sejam 0 ≤ nota ≤ 10.
   * Calcule a média de aproveitamento do aluno, usando a fórmula:
   * Média = (nota1 + nota2 ∗ 2 + nota3 ∗ 3 + media dos exercicios) / 7
   * 
   * O programa deve escrever o número do aluno, suas notas, a média dos
   * exercícios, a média de aproveitamento, o conceito correspondente e a
   * mensagem: APROVADO se o conceito for A, B ou C e REPROVADO, se o conceito
   * for D ou E.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numeroIdAluno;
    double n1, n2, n3, mediaExercicios, mediaAproveitamento;
    char conceito = 'n';
    String situacao = "string";

    System.out.println(
        "Este programa exibe a média dos exercícios, de aproveitamento do aluno e a situação (APROVADO ou REPORVADO):");
    System.out.println("Insira o numero de ID do aluno:");
    numeroIdAluno = scanner.nextInt();

    System.out.println("Insira a N1 do aluno:");
    n1 = scanner.nextDouble();
    while (n1 < 0 && n1 > 10) {
      System.out.println("A nota é inválida, insira uma nota válida:");
      n1 = scanner.nextDouble();
    }

    System.out.println("Insira a N2 do aluno:");
    n2 = scanner.nextDouble();
    while (n2 < 0 && n2 > 10) {
      System.out.println("A nota é inválida, insira uma nota válida:");
      n2 = scanner.nextDouble();
    }

    System.out.println("Insira a N3 do aluno:");
    n3 = scanner.nextDouble();
    while (n3 < 0 && n3 > 10) {
      System.out.println("A nota é inválida, insira uma nota válida:");
      n3 = scanner.nextDouble();
    }

    System.out.println("Insira a média de exercícios que fazem parte da avaliação:");
    mediaExercicios = scanner.nextDouble();

    mediaAproveitamento = (n1 + n2 * 2 + n3 * 3 + mediaExercicios) / 7;
    System.out.println(mediaAproveitamento);

    // Conceito:
    if (mediaAproveitamento >= 9.0 && mediaAproveitamento <= 10.0) {
      conceito = 'A';
    } else if (mediaAproveitamento >= 7.5 && mediaAproveitamento <= 9.0) {
      conceito = 'B';
    } else if (mediaAproveitamento >= 6.0 && mediaAproveitamento <= 7.5) {
      conceito = 'C';
    } else if (mediaAproveitamento >= 4.0 && mediaAproveitamento <= 6.0) {
      conceito = 'D';
    } else if (mediaAproveitamento < 4.0) {
      conceito = 'E';
    }

    if (mediaAproveitamento >= 6.0) {
      situacao = "APROVADO";
    } else {
      situacao = "REPROVADO";
    }

    System.out.println("\nNúmero do aluno: " + numeroIdAluno + "\nNotas do aluno:\nN1: "
        + n1 + ", N2: " + n2 + ", N3: " + n3 + "\nMédia de Exercícios: " + mediaExercicios
        + "\nMédia de Aproveitamento: "
        + mediaAproveitamento + "\nConceito: " + conceito + "\nSituação: " + situacao);
    scanner.close();
  }
}

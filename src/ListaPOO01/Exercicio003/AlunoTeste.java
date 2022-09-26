package ListaPOO01.Exercicio003;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import javax.management.monitor.GaugeMonitor;

public class AlunoTeste {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Aluno a1 = new Aluno();
    System.out.println("Digite a matrícula do aluno: ");
    a1.matricula = scanner.nextLine();

    System.out.println("Digite o nome do aluno: ");
    a1.nome = scanner.nextLine();

    System.out.println("Digite a N1:");
    a1.n1Prova = scanner.nextDouble();

    System.out.println("Digite a N2:");
    a1.n2Prova = scanner.nextDouble();

    System.out.println("Digite a nota de trabalho:");
    a1.notaTrabalho = scanner.nextDouble();

    Double media = a1.getMedia(a1.n1Prova, a1.n2Prova, a1.notaTrabalho);

    Double mediaFinal = a1.getFinal(media);

    System.out.println("Dados do aluno:");
    System.out.println("Matrícula: " + a1.matricula);
    System.out.println("Nome: " + a1.nome);
    System.out.println("Prova N1: " + a1.n1Prova);
    System.out.println("Prova N2: " + a1.n2Prova);
    System.out.println("Nota do Trabalho: " + a1.notaTrabalho);
    System.out.println("Média Final: " + media);
    if (mediaFinal == 0.0) {
      System.out.println("Para que a média do aluno seja pelo menos 5.0 ele precisará tirar 5.0 no Exame Final.");
    } else if (mediaFinal == 1.0) {
      System.out.println(" ");
    }

    scanner.close();
  }
}

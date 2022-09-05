package Lista234;

import java.util.Scanner;

public class Exercicio007 {
  /*
   * Faça um algoritmo que receba o salário e um código correspondente ao cargo de
   * um funcionário e imprima seu cargo, o salário, e o valor do aumento segundo o
   * percentual de aumento ao qual este funcionário tem direito segundo a tabela
   * a seguir e o valor do aumento baseado no salário. Ao final, mostre o
   * salário com o aumento.
   * 
   * Obs. O programa deverá informar ao usuário caso ele digite um código
   * inválido.
   */

  public static double funcaoPercentual(double percentual, double salarioFuncionario) {
    double calculo;
    calculo = (percentual * salarioFuncionario) + salarioFuncionario;
    return (calculo);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double salarioFuncionario, aumentoSalario = 0.0;
    int codigoCargo;
    String cargo = "cargo";
    String percentualEscrito = "%";

    System.out.println("Este programa analisa o percentual de aumento de salário conforme o cargo do funcionário.");
    System.out.println("Digite o código correspondente ao seu cargo:");
    codigoCargo = scanner.nextInt();

    while (codigoCargo <= 0 || codigoCargo >= 6) {
      System.out.println("Código inválido!");
      System.out.println("Digite um código válido (entre 1 e 5):");
      codigoCargo = scanner.nextInt();
    }

    System.out.println("Digite o seu salário: ");
    salarioFuncionario = scanner.nextDouble();

    if (codigoCargo == 1) {
      cargo = "Escrituário(a)";
      aumentoSalario = funcaoPercentual(0.5, salarioFuncionario);
      percentualEscrito = "50%";
    } else if (codigoCargo == 2) {
      cargo = "Secretário(a)";
      aumentoSalario = funcaoPercentual(0.35, salarioFuncionario);
      percentualEscrito = "35%";
    } else if (codigoCargo == 3) {
      cargo = "Caixa";
      aumentoSalario = funcaoPercentual(0.2, salarioFuncionario);
      percentualEscrito = "20%";
    } else if (codigoCargo == 4) {
      cargo = "Gerente";
      aumentoSalario = funcaoPercentual(0.1, salarioFuncionario);
      percentualEscrito = "10%";
    } else {
      cargo = "Diretor(a)";
      aumentoSalario = salarioFuncionario;
      percentualEscrito = "0%";
    }

    System.out.println("Código do cargo: " + codigoCargo
        + "\nCargo do funcionário: " + cargo + "\nPercentual do aumento de salário: "
        + percentualEscrito + "\nSalário antes da promoção: " + salarioFuncionario
        + "\nSalário depois da promoção: " + aumentoSalario);

    scanner.close();
  }
}

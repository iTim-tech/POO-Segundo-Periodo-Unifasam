package Lista234;

import java.util.Scanner;

public class Exercicio004 {
  /*
   * Desenvolver um programa que calcule o salário bruto e o salário líquido de um
   * funcionário.
   * • Dados de Entrada: Matrícula do funcionário (int); Quantidade de
   * horas-extras
   * trabalhadas.
   * • Constantes: Salário Mínimo = R$ 788.00; Valor da Hora-Extra = R$ 10.00.
   * Sabe-se:
   * • Salário hora-extra = horas-extras * Valor da Hora-Extra;
   * • Salário bruto = 3 * Salário Mínimo + Salário hora-extra;
   * • Desconto INSS = 12 % do salário bruto, se salário bruto for maior que R$
   * 1500,00;
   * • Desconto do Imposto de Renda = 20 % do Salário Bruto, se o mesmo for
   * maior que R$ 2000,00;
   * • Salário líquido = salário bruto – deduções.
   */
  public static final double salarioMinimo = 788.0;
  public static final double valorHoraExtra = 10.0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int matriculaFuncionario;
    double horasExtraTrabalhada, salarioHoraExtra, salarioBruto,
        descontoINSS = 0.0, impostoRenda = 0.0, deducoes = 0.0,
        salarioLiquido = 0.0;

    System.out.println("Este program calcula o seu salário bruto e líquido: ");
    System.out.println("Qual o seu nome?");
    String nome = scanner.nextLine();

    System.out.println(nome + " insira aqui sua matrícula: ");
    matriculaFuncionario = scanner.nextInt();

    System.out.println(nome + ", quantas horas extras você trabalhou?");
    horasExtraTrabalhada = scanner.nextDouble();

    salarioHoraExtra = horasExtraTrabalhada * valorHoraExtra;
    salarioBruto = 3 * salarioMinimo + salarioHoraExtra;

    if (salarioBruto > 1500.0) {
      // 12% do salário bruto
      descontoINSS = 0.12 * salarioBruto;
    }

    if (salarioBruto > 2000.0) {
      // 20% do salário bruto
      impostoRenda = 0.20 * salarioBruto;
    }
    deducoes = descontoINSS + impostoRenda;
    salarioLiquido = salarioBruto - deducoes;

    System.out.println("Número da matrícula: " + matriculaFuncionario
        + ".\nFuncionário: " + nome + ".\nHoras extras: " + horasExtraTrabalhada
        + "\nValor das horas extras: " + salarioHoraExtra + "\nSalário bruto: R$ "
        + salarioBruto + ".\nSalário Liquido: R$ " + salarioLiquido);

    scanner.close();
  }
}

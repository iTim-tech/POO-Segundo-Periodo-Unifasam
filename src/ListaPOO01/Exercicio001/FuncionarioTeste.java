package ListaPOO01.Exercicio001;

import java.util.Scanner;

public class FuncionarioTeste {
  /*
   * Declare uma classe com o nome Funcionario, está classe deverá ter um método
   * com o
   * nome calculaSalario, que recebe um parâmetro double salario. Este método
   * retornará o
   * valor do salario que o funcionário irá perceber, dado a restrição: $ 382,33+
   * 8,675% sobre
   * as vendas brutas se o valor da venda bruta for superior a $8.000,00, caso
   * contrário o
   * calculo do salario será: $177,12 + 3,87%. Após isso crie uma classe com o
   * nome
   * FuncionarioTeste que instancia a classe Funcionario e invoca o método
   * calculaSalario,
   * passando como parâmetro o valor das vendas do funcionário em questão.
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Funcionario f1 = new Funcionario();

    System.out.println(
        "Este programa calcula o salário de um vendedor de acordo com sua comissão.\nDigite o valor que o vendedor vendeu:");
    f1.salario = scanner.nextDouble();

    Double salarioVenda = f1.calculoSalario(f1.salario);

    System.out.println("Salário:" + salarioVenda);
    scanner.close();
  }
}

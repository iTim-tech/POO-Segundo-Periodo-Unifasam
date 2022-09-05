package ListaEntradaSaida;

import java.util.Scanner;

public class Exercicio005 {
  /*
   * Uma loja resolveu realizar uma promoção de seus produtos oferecendo um
   * desconto
   * variável em % informado pelo vendedor. Escreva um programa que leia o valor
   * original
   * do produto e o valor do desconto oferecido pelo vendedor e imprima o novo
   * valor do
   * produto.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bem vindo, esse programa te auxilia com o cálculo de descontos: ");
    System.out.println("Insira aqui o valor do produto: ");
    double valorProduto = scanner.nextDouble();

    System.out.println("Insira aqui o valor do desconto em porcentagem: ");
    double valorDesconto = scanner.nextDouble();

    double calculoPorcentagem = valorProduto - ((valorDesconto / 100) * valorProduto);

    System.out.println(
        valorDesconto + "% de desconto aplicados em R$" + valorProduto + " resulta em: R$ " + calculoPorcentagem + ".");

    scanner.close();

  }
}

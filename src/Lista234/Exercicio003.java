package Lista234;

import java.util.Scanner;

public class Exercicio003 {
  /*
   * Escreva um programa que leia o valor da compra e imprima o valor da venda de
   * acordo com a
   * tabela a seguir. Cuidado com valor inválido de compra:
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double valorCompra, valorVenda, lucro = 1.0;
    String percentual = "00%";

    System.out.println("Este programa imprime o valor da venda de um produto de acordo com uma tabela de lucro: ");
    System.out.println("Insira o valor da compra: ");
    valorCompra = scanner.nextDouble();

    while (valorCompra <= 0) {
      System.out.println("O valor inserido é inválido!");
      System.out.println("Insira o valor da compra: ");
      valorCompra = scanner.nextDouble();
    }

    if (valorCompra < 10.0) {
      // Lucro de 70%
      lucro = 0.7;
      percentual = "70%";
    } else if (valorCompra >= 10.0 && valorCompra < 30.0) {
      // Lucro de 50%
      lucro = 0.5;
      percentual = "50%";
    } else if (valorCompra >= 30.0 && valorCompra < 50.0) {
      // Lucro de 40%
      lucro = 0.4;
      percentual = "40%";
    } else if (valorCompra >= 50.0) {
      // Lucro de 30%
      lucro = 0.3;
      percentual = "30%";
    }

    valorVenda = lucro * valorCompra;

    System.out.println("O valor da venda com lucro de " + percentual + " aplicado é: R$ "
        + valorVenda + ".");

    scanner.close();
  }
}

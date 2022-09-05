package Lista234;

import java.util.Scanner;

public class Exercicio006 {
  /*
   * Escreva um algoritmo que leia o código de um determinado produto e mostre a
   * sua classificação de acordo com a tabela apresentada a seguir:
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int codigoProduto;

    System.out.println("Esse programa lê o código de um produto e analisa a situação do mesmo.");
    System.out.println("Digite o código do produto:");
    codigoProduto = scanner.nextInt();

    // 1 = Alimento não-perecível
    if (codigoProduto == 1) {
      System.out.println("Alimento não-perecível.");
    }
    // 2, 3 ou 4 = Alimento perecível
    else if (codigoProduto >= 2 && codigoProduto <= 4) {
      System.out.println("Alimento perecível.");
    }
    // 5 ou 6 = Vestuário
    else if (codigoProduto == 5 || codigoProduto == 6) {
      System.out.println("Vestuário");
    }
    // 7 = Higiene pessoal
    else if (codigoProduto == 7) {
      System.out.println("Higiene pessoal");
    }
    // 8 até 15 = Limpeza e utensílios domésticos
    else if (codigoProduto >= 8 && codigoProduto <= 15) {
      System.out.println("Limpeza e utensílios domésticos");
    } else {
      System.out.println("Inválido.");
    }

    scanner.close();
  }
}

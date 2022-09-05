package Lista234;

import java.util.Scanner;

public class Exercicio017 {
  /*
   * Faça um programa que leia o código dos produtos pedidos e as quantidades
   * desejadas;
   * calcule e mostre o valor a ser pago por produto (preço * quantidade) e o
   * total do pedido.
   * Considere que o cliente deve informar quando o pedido deve ser encerrado.
   */
  public static void main(String[] args) {
    int opc = 1, codigo, quantidade;
    double valorAPagar, valorTotalAPagar = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bem vindo ao Sun Dub's!\nFique a vontade para realizar o seu pedido:");

    do {
      System.out.println(
          "Digite: \n(1) para Cachorro quente (R$ 1.50)\n(2) para Hamburguer (R$ 2.00)\n(3) para Cheeseburger (R$ 2.50)\n(4) para Eggcheeseburger (R$ 3.00)\n(5) para Refrigerante (R$ 1.50)\nDigite \"0\" para terminar o pedido.");
      codigo = scanner.nextInt();

      switch (codigo) {
        case 1:
          System.out.println("Cachorro quente (R$ 1.50)\nDigite a quantidade: ");
          quantidade = scanner.nextInt();
          valorAPagar = quantidade * 1.50;
          valorTotalAPagar += valorAPagar;
          System.out.println(quantidade + " Cachoro(s) quente(s): R$ " + valorAPagar);
          break;

        case 2:
          System.out.println("Hamburguer (R$ 2.00)\nDigite a quantidade: ");
          quantidade = scanner.nextInt();
          valorAPagar = quantidade * 2.00;
          valorTotalAPagar += valorAPagar;
          System.out.println(quantidade + " Hamburguer(s): R$ " + valorAPagar);
          break;

        case 3:
          System.out.println("Cheeseburger (R$ 2.50)\nDigite a quantidade: ");
          quantidade = scanner.nextInt();
          valorAPagar = quantidade * 2.50;
          valorTotalAPagar += valorAPagar;
          System.out.println(quantidade + " Cheeseburger(s): R$ " + valorAPagar);
          break;

        case 4:
          System.out.println("Eggcheeseburger (R$ 3.00)\nDigite a quantidade: ");
          quantidade = scanner.nextInt();
          valorAPagar = quantidade * 3.00;
          valorTotalAPagar += valorAPagar;
          System.out.println(quantidade + " Eggcheeseburger(s): R$ " + valorAPagar);
          break;

        case 5:
          System.out.println("Refrigerante (R$ 1.50)\nDigite a quantidade: ");
          quantidade = scanner.nextInt();
          valorAPagar = quantidade * 1.50;
          valorTotalAPagar += valorAPagar;
          System.out.println(quantidade + " Refrigerante(s): R$ " + valorAPagar);
          break;

        case 0:
          opc = 0;
          break;
      }
    } while (opc == 1);

    System.out.println("O valor total do pedido é de: R$ " + valorTotalAPagar);
    scanner.close();
  }
}

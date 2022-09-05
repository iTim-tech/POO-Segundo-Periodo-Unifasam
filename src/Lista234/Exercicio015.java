package Lista234;

import java.util.Scanner;

public class Exercicio015 {
  /*
   * Escreva um programa que apresente quatro opções: (a) consulta saldo, (b)
   * saque e
   * (c)depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque ou
   * depósito o valor
   * do saldo deve ser atualizado.
   */

  public static void main(String[] args) {
    double saldo = 0.0, valorSaque, valorDeposito;
    String resposta;
    int opc = 1;

    Scanner scanner = new Scanner(System.in);

    System.out.println(
        "Bem vindo ao banco.\nEscolha uma das opções: \n(a) Consultar saldo \n(b) Saque \n(c) Depósito \n(d) Sair ");
    resposta = scanner.nextLine();

    do {
      switch (resposta) {
        case "a":
          System.out.println("Seu saldo: R$ " + saldo);
          System.out.println("Opões: \n(a) Consultar saldo \n(b) Saque \n(c) Depósito\n(d) Sair ");
          resposta = scanner.nextLine();
          break;
        case "b":
          System.out.println("Digite o valor a ser sacado: ");
          valorSaque = scanner.nextDouble();
          saldo -= valorSaque;
          System.out.println("Opões: \n(a) Consultar saldo \n(b) Saque \n(c) Depósito\n(d) Sair ");
          resposta = scanner.nextLine();
          break;
        case "c":
          System.out.println("Digite o valor do depósito: ");
          valorDeposito = scanner.nextDouble();
          saldo += valorDeposito;
          System.out.println("Opões: \n(a) Consultar saldo \n(b) Saque \n(c) Depósito\n(d) Sair ");
          resposta = scanner.nextLine();
          break;
        case "d":
          opc = 0;
      }
    } while (opc == 1);
    System.out.println("Obrigado por usar o nosso banco.\nAté a próxima!");

    scanner.close();
  }

}

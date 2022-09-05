package Lista234;

import java.util.Scanner;

public class Exercicio008 {
  /*
   * Faça um programa que leia um código, x e y e calcule f(x,y) de acordo com as
   * equações abaixo:
   */
  public static void main(String[] args) {
    int codigoEquacao, opcao = 0;
    Double x, y, resultadoEquacao = 0.0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa irá calcular o F(x,y) de acordo com o código inserido.");
    System.out.println("Digite um código (de 1 a 4)");
    codigoEquacao = scanner.nextInt();

    while (codigoEquacao <= 0 || codigoEquacao >= 5) {
      System.out.println("Código inválido!\nDigite um código válido (de 1 a 4)");
      codigoEquacao = scanner.nextInt();
    }

    System.out.println("Digite um valor para x: ");
    x = scanner.nextDouble();

    System.out.println("Digite um valor para y: ");
    y = scanner.nextDouble();

    switch (codigoEquacao) {
      // Com x = 3 e y = 3, o resultado é: 5.2599...
      case 1:
        resultadoEquacao = Math.sqrt(Math.pow(x, 3) + (x + (2 * y - x))
            / Math.pow(y, 2));
        opcao = 1;
        break;

      // Com x = 3 e y = 3, o resultado é: 2.44948...
      case 2:
        resultadoEquacao = Math.sqrt((((Math.pow(x, 3) + Math.pow(y, 3)) + (Math.pow(x, 3) - Math.pow(y, 3)))
            / (x * y)));
        opcao = 2;
        break;

      // Com x = 8 e y = 8, o resultado é: 24.0
      case 3:
        resultadoEquacao = 2 * x + Math.sqrt(x * y);
        opcao = 3;
        break;

      // Com x = 3 e y = 3, o resultado é: -0.8488...
      case 4:
        resultadoEquacao = Math.sin(x) + Math.cos(y);
        opcao = 4;
    }
    System.out.println("Resultado da opção " + opcao + ": " + resultadoEquacao);

    scanner.close();
  }
}

package Lista234;

import java.util.Scanner;

public class Exercicio011 {
  /*
   * Escrever um programa que calcule todos os números inteiros divisíveis por
   * um certo valor indicado pelo usuário, e compreendidos em um intervalo também
   * especificado pelo usuário. O usuário deve entrar com um primeiro valor
   * correspondente ao divisor e após ele vai fornecer o valor inicial do
   * intervalo,
   * seguido do valor final deste intervalo.
   * Exemplo: Valor do divisor: 3;
   * Inicio do Intervalo: 17;
   * Fim do Intervalo: 29;
   * Saída-> Números divisíveis por 3 no intervalo de 17 a 29: 18, 21, 24, 27.
   */

  public static void main(String[] args) {
    int multiplicacao, divisor, divisao, intervaloInicial, intervaloFinal;
    // quantidadeOperacoes;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa encontra todos os números inteiros divisiveis pelo número que você digitar.\n"
        + "Digite o valor do divisor: ");
    divisor = scanner.nextInt();

    System.out.println("Vamos basear a busca em um intervalo de números.\n"
        + "Digite o número correspondente ao intervalo inicial: ");
    intervaloInicial = scanner.nextInt();

    System.out.println("Digite o número correspondente ao segundo intervalo: ");
    intervaloFinal = scanner.nextInt();

    // quantidadeOperacoes = intervaloFinal - intervaloInicial;

    System.out.print("Números divisíveis por 3 no intervalo de "
        + intervaloInicial + " a " + intervaloFinal + ": ");

    for (int i = intervaloInicial - 1; i <= intervaloFinal;) {
      i += divisor;
      divisao = i / divisor;
      multiplicacao = divisao * divisor;
      System.out.print(multiplicacao);

      System.out.print(", ");

      /*
       * if (i != intervaloFinal) {
       * System.out.print(", ");
       * } else if (i == intervaloFinal - 1) {
       * System.out.print(".");
       * }
       */
    }

    /*
     * int numerosDivisiveis[] = new int[quantidadeOperacoes];
     * 
     * dividendo = intervaloInicial;
     * for (int i = 0; i <= quantidadeOperacoes; i++) {
     * restoDivisao = dividendo % divisor;
     * if (restoDivisao == 0) {
     * numerosDivisiveis[j] = dividendo;
     * }
     * dividendo++;
     * j++;
     * }
     * 
     * System.out.print("Valor do divisor: " + divisor
     * + ";\nInicio do Intervalo: " + intervaloInicial
     * + ";\nFim do Intervalo: " + intervaloFinal
     * + ";\nNúmeros divisíveis por 3 no intervalo de "
     * + intervaloInicial + " a " + intervaloFinal + ": ");
     * 
     * for (j = 0; j < quantidadeOperacoes; j++) {
     * if (numerosDivisiveis[j] != 0) {
     * System.out.print(numerosDivisiveis[j] + ", ");
     * }
     */
    scanner.close();
  }
}

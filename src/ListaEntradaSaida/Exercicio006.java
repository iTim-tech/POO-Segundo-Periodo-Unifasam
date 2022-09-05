package ListaEntradaSaida;

import java.util.Scanner;

public class Exercicio006 {
  /*
   * Faça um algoritmo que calcule a quantidade de litros de combustível gasta em
   * uma viagem, utilizando um automóvel que faz 12Km por litro. Para obter o
   * cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média
   * durante ela. Desta forma, será possível obter a distância percorrida com a
   * fórmula DISTANCIA = TEMPO *
   * VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade de litros
   * de combustível utilizada na viagem com a fórmula:
   * LITROS_USADOS = DISTANCIA /
   * AUTONOMIA. O programa deve apresentar os valores da velocidade média, tempo
   * gasto
   * na viagem, a distância percorrida e a quantidade de litros utilizada na
   * viagem.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println(
        "Bem vindo ao algoritmo que vai te ajudar a calcular a quantidade de combustível em litros gastos na sua última viagem: ");
    System.out.println("Quanto tempo em horas você gastou na viagem? ");
    double tempoGasto = scanner.nextDouble();

    System.out.println("Qual foi a velocidade média durante a viagem? ");
    double velocidadeMedia = scanner.nextDouble();

    double autonomia = 12.0;
    double distancia = tempoGasto * velocidadeMedia;
    double litrosUsados = distancia / autonomia;

    System.out.println("Com velocidade média de " + velocidadeMedia + "km/h, tempo gasto de " + tempoGasto +
        " horas e distância percorrida de " + distancia + "km, a quantidade de litros utilizados foi de " + litrosUsados
        + " litros.");

    scanner.close();

  }
}

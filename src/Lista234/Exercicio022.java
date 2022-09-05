package Lista234;

import java.util.Random;

public class Exercicio022 {
  /*
   * Faça um programa que preencha um vetor com 10 números inteiros. Calcule e
   * mostre a
   * quantidade de números superiores a 25 e suas respectivas posições. O programa
   * deverá
   * mostrar uma mensagem se não existir nenhum número nessa condição.
   */

  public static void main(String[] args) {
    int q = 10, numeroAleatorio, quantidadeSuperior = 0, checador1 = 0,
        checador2 = 0, contaPosicoes = 1;
    int[] vetorInt = new int[q];

    for (int i = 0; i < vetorInt.length; i++) {
      numeroAleatorio = sorteia(1, 50);
      for (int j = 0; j < vetorInt.length; j++) {
        if (numeroAleatorio == vetorInt[j] && j != i) {
          numeroAleatorio = sorteia(1, 50);
        } else {
          vetorInt[i] = numeroAleatorio;
        }
      }
      System.out.println("Posição (" + contaPosicoes + "):" + vetorInt[i]);
      contaPosicoes++;
    }

    contaPosicoes = 1;
    System.out.println("_____________________________\nAs posições: ");

    for (int i = 0; i < vetorInt.length; i++) {
      checador1 = 1;
      if (vetorInt[i] > 25) {
        quantidadeSuperior++;
        System.out.println("(" + contaPosicoes + "):" + vetorInt[i]);
        checador2 = 1;
      } else if (checador1 == 0 && checador2 == 0) {
        System.out.println("Nenhum número neste vetor é maior do que 25!");
      }
      contaPosicoes++;
    }

    System.out.println("Contém números maiores do que 25.\nTotal de números superiores a 25: " + quantidadeSuperior);

  }

  public static int sorteia(int limiteInferior, int limiteSuperior) {
    Random rd = new Random();
    return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
  }
}

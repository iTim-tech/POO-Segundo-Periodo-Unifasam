import java.util.Random;
import java.util.Scanner;

public class buscaVetor {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int[] vetorInt = new int[1000];
    int numeroAleatorio;

    for (int i = 0; i < vetorInt.length; i++) {
      numeroAleatorio = sorteia(1, 10000);
      for (int j = 0; j < vetorInt.length; j++) {
        if (numeroAleatorio == vetorInt[j] && j != i) {
          numeroAleatorio = sorteia(1, 10000);
        } else {
          vetorInt[i] = numeroAleatorio;
        }
      }
    }

    System.out.println(vetorInt[800]);
    System.out.println("Informe um numero a ser encontrado: ");
    int procurado = entrada.nextInt();

    int posEncontrado = encontraElementoVetor(vetorInt, procurado);
    if (posEncontrado != -1) {
      System.out.println(procurado + " está na posição: " + posEncontrado);
    } else {
      System.out.println(procurado + " não existe no vetor.");
    }
    System.out.println("VetorInt: ");
    imprimeVetor(vetorInt);
  }

  public static int sorteia(int limiteInferior, int limiteSuperior) {
    Random rd = new Random();
    return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
  }

  public static void imprimeVetor(int[] vetor) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("[" + i + "]: " + vetor[i]);
    }
  }

  public static int encontraElementoVetor(int[] vetor, int procurado) {
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == (procurado)) {
        return i;
      }
    }

    return -1;
  }

}

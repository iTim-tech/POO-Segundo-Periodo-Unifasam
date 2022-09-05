import java.util.Random;

public class numerosAleatorios {
  public static void main(String[] args) {

    int numero;
    int[] num = new int[6];
    Random r = new Random();

    for (int i = 0; i < num.length; i++) {
      numero = sorteia(1, 60);
      for (int j = 0; j < num.length; j++) {
        if (numero == num[j] && j != i) {
          numero = sorteia(1, 60);
        } else {
          num[i] = numero;
        }
      }
    }
    // Apresentar na tela o resultado
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + "  ");
    }
  }

  public static int sorteia(int limiteInferior, int limiteSuperior) {
    Random rd = new Random();
    return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
  }
}

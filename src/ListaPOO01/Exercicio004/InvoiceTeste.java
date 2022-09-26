package ListaPOO01.Exercicio004;

import java.util.Scanner;

public class InvoiceTeste {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Invoice i1 = new Invoice(1, "Playstation", 1.0, 500.00);

    System.out.println(i1.fatura());
    scanner.close();
  }
}

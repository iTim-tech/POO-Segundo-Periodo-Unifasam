package ListaPOO01.Exercicio004;

public class Invoice {

  int numeroItemFaturado;
  String descricaoItem;
  double quantidadeComprada;
  double precoUnitario;

  Invoice(int numeroItemFaturado, String descricaoItem, double quantidadeComprada, double precoUnitario) {
    this.numeroItemFaturado = numeroItemFaturado;
    this.descricaoItem = descricaoItem;
    this.quantidadeComprada = quantidadeComprada;
    this.precoUnitario = precoUnitario;
  }

  /*
   * public String setDescricaoItem(String descricaoItem) {
   * System.out.println();
   * }
   */

  public double getInvoiceAmount(double quantidadeComprada, double precoUnitario) {
    return quantidadeComprada * precoUnitario;
  }

  public String fatura() {
    return "Número do Item: " + this.numeroItemFaturado +
        "\nDescrição: " + this.descricaoItem + "\nQuantidade: " +
        this.quantidadeComprada + "\nPreço Unitário: "
        + this.precoUnitario + "\nValor Final: "
        + getInvoiceAmount(this.quantidadeComprada, this.precoUnitario);
  }
}

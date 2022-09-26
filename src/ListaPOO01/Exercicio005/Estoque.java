package ListaPOO01.Exercicio005;

public class Estoque {

  String nome;
  int qtdAtual;
  int qtdMinima;

  public Estoque() {
  }

  public Estoque(String nome, int qtdAtual, int qtdMinima) {
    this.nome = nome;
    this.qtdAtual = qtdAtual;
    this.qtdMinima = qtdMinima;
  }

  public void mudarNome(String nome) {
    this.nome = nome;
  }

  public void mudarQtdMinima(int qtdMinima) {
    this.qtdMinima = qtdMinima;
  }

  public void repor(int qtd) {
    this.qtdAtual += qtd;
  }

  public void darBaixa(int qtd) {
    this.qtdAtual -= qtd;
  }

  public String mostra() {
    return "Nome do Produto: " + this.nome + "\nQuantidade Atual: "
        + this.qtdAtual + "\nQuantidade Mínima: " + this.qtdMinima +
        "\n------------------------------";
  }

  public boolean precisaRepor() {
    if (qtdAtual <= qtdMinima) {
      return true;
    } else {
      return false;
    }
  }
}

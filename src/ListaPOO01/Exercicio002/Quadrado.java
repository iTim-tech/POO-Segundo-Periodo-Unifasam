package ListaPOO01.Exercicio002;

public class Quadrado {

  Double lado;

  Quadrado(Double lado) {
    this.lado = lado;
  }

  public Double getArea(Double lado) {
    Double area = lado * lado;
    return area;
  }

  public Double getPerimetro(Double lado) {
    Double perimetro = 4 * lado;
    return perimetro;
  }
}

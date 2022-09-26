package ListaPOO01.Exercicio003;

public class Aluno {

  String matricula;
  String nome;
  double n1Prova;
  double n2Prova;
  double notaTrabalho;

  public Double getMedia(double n1Prova, double n2Prova, double notaTrabalho) {
    double media = (n1Prova + n2Prova + notaTrabalho) / 3;
    return media;
  }

  public double getFinal(double media) {
    /*
     * supondo que o método usado para reucperação seja uma prova
     * que valerá pela nota da média final, para que a média do
     * aluno seja pelo menos 5.0 ele precisará tirar 5.0 no Exame Final.
     */
    double mensagem;
    if (media < 6.0) {
      mensagem = 0.0;
    } else {
      mensagem = 1.0;
    }
    return mensagem;
  }
}

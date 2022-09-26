package ListaPOO01.Exercicio001;

public class Funcionario {

  Double salario;

  public Double calculoSalario(double salario) {
    // se a venda bruta for acima de 8.000
    double salarioVenda;
    if (salario > 8000) {
      double calculoPorcentagem = (8.675 / 100) * salario;
      salarioVenda = 382.33 + calculoPorcentagem;
    } else {
      double calculoPorcentagem = (3.87 / 100) * salario;
      salarioVenda = 177.12 + calculoPorcentagem;
    }
    return salarioVenda;
  }

}
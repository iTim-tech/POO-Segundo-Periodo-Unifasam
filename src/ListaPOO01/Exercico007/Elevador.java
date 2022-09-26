package ListaPOO01.Exercico007;

import java.security.KeyStore.CallbackHandlerProtection;

/*Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de
andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas
pessoas estão presentes nele. A classe deve também disponibilizar os seguintes
métodos: */
public class Elevador {

  int andarAtual;
  int totalDeAndares;
  int capacidadeDoElevador;
  int pessoasABordo;

  public Elevador() {
  }

  public Elevador(int andarAtual, int totalDeAndares, int capacidadeDoElevador, int pessoasABordo) {
    this.andarAtual = andarAtual;
    this.totalDeAndares = totalDeAndares;
    this.capacidadeDoElevador = capacidadeDoElevador;
    this.pessoasABordo = pessoasABordo;

  }

  public int getAndarAtual() {
    return this.andarAtual;
  }

  public void setAndarAtual(int andarAtual) {
    this.andarAtual = andarAtual;
  }

  public int getTotalDeAndares() {
    return this.totalDeAndares;
  }

  public void setTotalDeAndares(int totalDeAndares) {
    this.totalDeAndares = totalDeAndares;
  }

  public int getCapacidadeDoElevador() {
    return this.capacidadeDoElevador;
  }

  public void setCapacidadeDoElevador(int capacidadeDoElevador) {
    this.capacidadeDoElevador = capacidadeDoElevador;
  }

  public int getPessoasABordo() {
    return this.pessoasABordo;
  }

  public void setPessoasABordo(int pessoasABordo) {
    this.pessoasABordo = pessoasABordo;
  }

  // a. Inicializa : que deve receber como parâmetros a capacidade do elevador e o
  // total de andares no prédio (os elevadores sempre começam no térreo e vazio);
  public void Inicializa() {
    this.andarAtual = 0;
    this.pessoasABordo = 0;
  }

  // b. Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se
  // ainda houver espaço);
  public int Entra(int pessoasABordo) {
    if (pessoasABordo <= this.capacidadeDoElevador) {
      return this.pessoasABordo++;
    } else {
      return this.pessoasABordo;
    }
  }

  // c. Sai : para remover uma pessoa do elevador (só deve remover se houver
  // alguém dentro dele);
  public int Sai(int pessoasABordo) {
    if (pessoasABordo > 0) {
      return this.pessoasABordo--;
    } else {
      return this.pessoasABordo;
    }
  }

  // d. Sobe : para subir um andar (não deve subir se já estiver no último andar);
  public int Sobe(int andarAtual) {
    if (andarAtual < this.totalDeAndares) {
      return this.andarAtual++;
    } else {
      return this.andarAtual;
    }
  }

  // e. Desce : para descer um andar (não deve descer se já estiver no térreo);
  public int Desce(int andarAtual) {
    if (andarAtual > 0) {
      return this.andarAtual--;
    } else {
      return this.andarAtual;
    }
  }
}

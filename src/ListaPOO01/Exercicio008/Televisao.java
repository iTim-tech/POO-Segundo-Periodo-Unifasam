package ListaPOO01.Exercicio008;

/*Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume
e trocar os canais da televisão. O controle de volume permite:
a. aumentar ou diminuir a potência do volume de som em uma unidade de
cada vez;
b. aumentar e diminuir o número do canal em uma unidade
c. trocar para um canal indicado;
d. consultar o valor do volume de som e o canal selecionado. */
public class Televisao {

  int volume;
  int canal;

  public Televisao(int volume, int canal) {
    this.volume = volume;
    this.canal = canal;
  }

  public int aumentarVolume() {
    return this.volume++;
  }

  public int diminuirVolume() {
    return this.volume--;
  }

  public int aumentarCanal() {
    return this.canal++;
  }

  public int diminuirCanal() {
    return this.canal--;
  }

  public int trocarCanal(int canal) {
    this.canal = canal;
    return this.canal;
  }

  public String consultarVolumeECanal() {
    return "Volume: " + this.volume + "\nCanal: " + this.canal;
  }

}

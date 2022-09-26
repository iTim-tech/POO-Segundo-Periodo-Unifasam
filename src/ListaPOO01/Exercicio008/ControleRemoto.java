package ListaPOO01.Exercicio008;

import javax.sql.rowset.spi.SyncResolver;

public class ControleRemoto {

  public static void main(String[] args) {

    Televisao controle1 = new Televisao(5, 2);

    System.out.println(controle1.aumentarVolume());

    System.out.println(controle1.aumentarCanal());

    System.out.println(controle1.consultarVolumeECanal());

  }
}

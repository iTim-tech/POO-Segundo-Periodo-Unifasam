package ListaPOO01.Exercico007;

import javax.sql.rowset.spi.SyncResolver;

public class ElevadorTeste {

  public static void main(String[] args) {

    Elevador elevador1 = new Elevador();

    elevador1.Inicializa();

    elevador1.setAndarAtual(4);
    elevador1.setCapacidadeDoElevador(6);
    elevador1.setPessoasABordo(4);
    elevador1.setTotalDeAndares(15);

    elevador1.Entra(elevador1.pessoasABordo);
    System.out.println("Entrou mais um, agora são: " + elevador1.pessoasABordo +
        " pessoas");

    elevador1.Sai(elevador1.pessoasABordo);
    System.out.println("Saiu um, agora são: " + elevador1.pessoasABordo +
        " pessoas");

    elevador1.Sobe(elevador1.andarAtual);
    System.out.println("Subiu! Andar: " + elevador1.andarAtual);

    elevador1.Desce(elevador1.andarAtual);
    System.out.println("Desceu! Andar: " + elevador1.andarAtual);

    System.out.println(elevador1.getAndarAtual());
    System.out.println(elevador1.getCapacidadeDoElevador());
    System.out.println(elevador1.getPessoasABordo());
    System.out.println(elevador1.getTotalDeAndares());

  }
}

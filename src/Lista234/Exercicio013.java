package Lista234;

import java.util.Scanner;

public class Exercicio013 {
  /*
   * Faça um programa que leia uma senha (número inteiro). Em seguida, pergunte ao
   * usuário
   * a senha informada, caso a senha esteja errada imprima “Senha incorreta, tente
   * novamente” e leia novamente a senha. Caso o usuário digite a senha correta,
   * imprima
   * “Senha correta! Bem-vindo ao sistema”.
   */

  public static void main(String[] args) {
    int senha, confirmaSenha;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa valida se a senha cadastrada está correta."
        + "\nDigite sua senha: ");
    senha = scanner.nextInt();

    System.out.println("Confirme sua senha: ");
    confirmaSenha = scanner.nextInt();

    while (senha != confirmaSenha) {
      System.out.println("Senha incorreta!\nTente novamente:");
      confirmaSenha = scanner.nextInt();
    }

    System.out.println("As senhas estão corretas:\n"
        + "Senha 1: " + senha + "\nSenha 2: " + confirmaSenha);

    scanner.close();
  }
}

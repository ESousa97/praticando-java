package io.github.enoquesousa.praticandojava.examples;

import io.github.enoquesousa.praticandojava.shared.AgeEligibilityFormatter;

public class PraticandoSwitchCase {
  public static void main(String[] args) {
    int idade1 = 28;
    int idade2 = 17;
    String nome = "enoque";
    String estadoCivil = "casado";

    printResult(nome, estadoCivil, idade1);
    printResult(nome, estadoCivil, idade2);
  }

  private static void printResult(String nome, String estadoCivil, int idade) {
    switch (idade) {
      case 18:
        System.out.println(AgeEligibilityFormatter.formatAdultOrMinor(nome, estadoCivil, idade));
        break;
      default:
        System.out.println(AgeEligibilityFormatter.formatAdultOrMinor(nome, estadoCivil, idade));
        break;
    }
  }
}

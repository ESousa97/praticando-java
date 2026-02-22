package io.github.enoquesousa.praticandojava.examples;

import io.github.enoquesousa.praticandojava.shared.AgeEligibilityFormatter;

public class PraticandoIfElse {
  public static void main(String[] args) {
    int idade1 = 28;
    int idade2 = 17;
    String nome = "enoque";
    String estadoCivil = "casado";

    System.out.println(AgeEligibilityFormatter.formatAdultOrMinor(nome, estadoCivil, idade1));
    System.out.println(AgeEligibilityFormatter.formatAdultOrMinor(nome, estadoCivil, idade2));
  }
}

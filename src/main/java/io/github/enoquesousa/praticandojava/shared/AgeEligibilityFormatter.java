package io.github.enoquesousa.praticandojava.shared;

public final class AgeEligibilityFormatter {
  private AgeEligibilityFormatter() {}

  public static String formatAdultOrMinor(String nome, String estadoCivil, int idade) {
    if (idade > 18) {
      return nome + " é " + estadoCivil + " e tem " + idade + " anos (maior de idade).";
    }

    if (idade == 18) {
      return nome + " é " + estadoCivil + " e tem " + idade + " anos (acabou de atingir a maioridade).";
    }

    return nome + " é menor de idade, tem apenas " + idade + " anos.";
  }
}

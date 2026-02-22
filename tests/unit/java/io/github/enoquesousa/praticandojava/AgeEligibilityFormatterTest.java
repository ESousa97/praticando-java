package io.github.enoquesousa.praticandojava;

import io.github.enoquesousa.praticandojava.shared.AgeEligibilityFormatter;

public final class AgeEligibilityFormatterTest {
  private AgeEligibilityFormatterTest() {}

  public static void runAll() {
    String nome = "enoque";
    String estadoCivil = "casado";

    String maior = AgeEligibilityFormatter.formatAdultOrMinor(nome, estadoCivil, 28);
    String igual = AgeEligibilityFormatter.formatAdultOrMinor(nome, estadoCivil, 18);
    String menor = AgeEligibilityFormatter.formatAdultOrMinor(nome, estadoCivil, 17);

    assertContains(maior, "maior de idade", "idade > 18");
    assertContains(igual, "acabou de atingir a maioridade", "idade == 18");
    assertContains(menor, "menor de idade", "idade < 18");
  }

  private static void assertContains(String value, String expected, String caseName) {
    if (!value.contains(expected)) {
      throw new AssertionError(caseName + " esperado conter='" + expected + "' atual='" + value + "'");
    }
  }
}

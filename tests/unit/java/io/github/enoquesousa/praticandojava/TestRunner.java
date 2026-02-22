package io.github.enoquesousa.praticandojava;

public class TestRunner {
  public static void main(String[] args) {
    int failures = 0;

    failures += run("StairClimberTest", StairClimberTest::runAll);
    failures += run("AgeEligibilityFormatterTest", AgeEligibilityFormatterTest::runAll);

    if (failures > 0) {
      throw new IllegalStateException("Falhas de teste: " + failures);
    }

    System.out.println("Todos os testes passaram.");
  }

  private static int run(String testName, Runnable testFn) {
    try {
      testFn.run();
      System.out.println("[PASS] " + testName);
      return 0;
    } catch (RuntimeException | Error ex) {
      System.out.println("[FAIL] " + testName + " -> " + ex.getMessage());
      return 1;
    }
  }
}

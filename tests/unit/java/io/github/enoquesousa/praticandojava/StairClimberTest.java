package io.github.enoquesousa.praticandojava;

import io.github.enoquesousa.praticandojava.algorithms.StairClimber;

public final class StairClimberTest {
  private StairClimberTest() {}

  public static void runAll() {
    assertEquals(0, StairClimber.climbStairs(0), "iterativo n=0");
    assertEquals(2, StairClimber.climbStairs(2), "iterativo n=2");
    assertEquals(3, StairClimber.climbStairs(3), "iterativo n=3");
    assertEquals(8, StairClimber.climbStairs(5), "iterativo n=5");

    assertEquals(0, StairClimber.climbStairsMemo(0), "memo n=0");
    assertEquals(2, StairClimber.climbStairsMemo(2), "memo n=2");
    assertEquals(3, StairClimber.climbStairsMemo(3), "memo n=3");
    assertEquals(8, StairClimber.climbStairsMemo(5), "memo n=5");

    assertEquals(StairClimber.climbStairs(10), StairClimber.climbStairsMemo(10), "consistência iterativo x memo n=10");
  }

  private static void assertEquals(int expected, int actual, String caseName) {
    if (expected != actual) {
      throw new AssertionError(caseName + " esperado=" + expected + " atual=" + actual);
    }
  }
}

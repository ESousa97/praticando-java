package io.github.enoquesousa.praticandojava.algorithms;

public class StairClimber {
  public static int climbStairs(int n) {
    if (n <= 0) {
      return 0;
    }
    if (n <= 2) {
      return n;
    }

    int a = 1;
    int b = 2;
    for (int i = 3; i <= n; i++) {
      int c = a + b;
      a = b;
      b = c;
    }
    return b;
  }

  public static int climbStairsMemo(int n) {
    if (n <= 0) {
      return 0;
    }

    Integer[] memo = new Integer[n + 1];
    return dfs(n, memo);
  }

  private static int dfs(int n, Integer[] memo) {
    if (n <= 2) {
      return n;
    }

    if (memo[n] != null) {
      return memo[n];
    }

    memo[n] = dfs(n - 1, memo) + dfs(n - 2, memo);
    return memo[n];
  }

  public static void main(String[] args) {
    int[] tests = {2, 3, 4, 5, 10};
    for (int n : tests) {
      System.out.printf("n=%d -> %d formas (iterativa)%n", n, climbStairs(n));
    }

    System.out.println("---");
    for (int n : tests) {
      System.out.printf("n=%d -> %d formas (memo)%n", n, climbStairsMemo(n));
    }
  }
}

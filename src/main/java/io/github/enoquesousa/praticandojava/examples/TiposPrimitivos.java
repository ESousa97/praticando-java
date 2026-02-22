package io.github.enoquesousa.praticandojava.examples;

public class TiposPrimitivos {
  private static final String DIVISOR = "----------------------------------------------------------------------------------------------------";

  public static void main(String[] args) {
    boolean a = false;
    boolean b = true;

    byte byteMin = -128;
    byte byteMax = 127;

    char caractere = '!';

    short shortMin = -32768;
    short shortMax = 32767;

    int intMin = -2147483648;
    int intMax = 2147483647;

    long longMin = -9223372036854775808L;
    long longMax = 9223372036854775807L;

    float preco = 19.99f;
    float piFloat = 3.1415927f;
    float grandeFloat = 1.2e10f;

    double precoD = 19.99;
    double piDouble = 3.141592653589793;
    double grandeDouble = 1.5e308;

    System.out.println("boolean: representa valores lógicos, podendo ser " + a + " ou " + b);
    printDivisor();
    System.out.println("byte: inteiro de 8 bits, faixa de valores: " + byteMin + " até " + byteMax);
    printDivisor();
    System.out.println("char: representa um caractere Unicode. Exemplo: '" + caractere + "'");
    printDivisor();
    System.out.println("short: inteiro de 16 bits, faixa de valores: " + shortMin + " até " + shortMax);
    printDivisor();
    System.out.println("int: inteiro de 32 bits, faixa de valores: " + intMin + " até " + intMax);
    printDivisor();
    System.out.println("long: inteiro de 64 bits, faixa de valores: " + longMin + " até " + longMax);
    printDivisor();
    System.out.println("float: número decimal de 32 bits (precisão simples). Exemplos: " + preco + ", " + piFloat + ", " + grandeFloat);
    printDivisor();
    System.out.println("double: número decimal de 64 bits (precisão dupla). Exemplos: " + precoD + ", " + piDouble + ", " + grandeDouble);
  }

  private static void printDivisor() {
    System.out.println(DIVISOR);
  }
}

public class TiposPrimitivos {
    public static void main(String[] args) {
        // boolean
        boolean a = false;
        boolean b = true;

        // byte
        byte byteMin = -128;
        byte byteMax = 127;

        // char
        char caractere = '!';

        // short
        short shortMin = -32768;
        short shortMax = 32767;

        // int
        int intMin = -2147483648;
        int intMax = 2147483647;

        // long
        long longMin = -9223372036854775808L;
        long longMax = 9223372036854775807L;

        // float
        float preco = 19.99f;
        float piFloat = 3.1415927f;
        float grandeFloat = 1.2e10f;

        // double
        double precoD = 19.99;
        double piDouble = 3.141592653589793;
        double grandeDouble = 1.5e308;

        // Impressões
        System.out.println("boolean: representa valores lógicos, podendo ser " + a + " ou " + b);
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("byte: inteiro de 8 bits, faixa de valores: " + byteMin + " até " + byteMax);
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("char: representa um caractere Unicode. Exemplo: '" + caractere + "'");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("short: inteiro de 16 bits, faixa de valores: " + shortMin + " até " + shortMax);
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("int: inteiro de 32 bits, faixa de valores: " + intMin + " até " + intMax);
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("long: inteiro de 64 bits, faixa de valores: " + longMin + " até " + longMax);
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("float: número decimal de 32 bits (precisão simples). Exemplos: " 
            + preco + ", " + piFloat + ", " + grandeFloat);
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("double: número decimal de 64 bits (precisão dupla). Exemplos: " 
            + precoD + ", " + piDouble + ", " + grandeDouble);
    }
}

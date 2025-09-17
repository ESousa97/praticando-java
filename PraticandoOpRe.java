public class PraticandoOpRe {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 30;

        boolean igual = (b == a);
        System.out.println("b == a: " + igual);
        boolean diferente = (a != c);
        System.out.println("a != c: " + diferente);
        boolean maior = (c > a);
        System.out.println("c > a: " + maior);
        boolean menor = (b <= a);
        System.out.println("b <= a: " + menor);
    }
}
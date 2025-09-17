public class OperadoresIncremento {
    public static void main(String[] args) {
        int num1 = 5;
        int resultado1 = ++num1;
        System.out.println("Num é incrementado para o 6 e depois atribuído.");
        System.out.println("Num1: " + num1);
        System.out.println("Resultado1: " + resultado1);

        int num2 = 5;
        int resultado2 = num2++;
        System.out.println("Num é atribuído primeiro a variável resultado.");
        System.out.println("Num2: " + num2);
        System.out.println("Resultado2: " + resultado2);
    }
}

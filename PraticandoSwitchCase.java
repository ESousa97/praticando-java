public class PraticandoSwitchCase {
    public static void main(String[] args) {
        int idade1 = 28;
        int idade2 = 17;
        String nome = "enoque";
        String estadoCivil = "casado";

        switch (idade1) {
            case 18:
                System.out.println(nome + " é " + estadoCivil + " e tem " + idade1 + " anos (acabou de atingir a maioridade).");
                break;
        
            default:
                if (idade1 > 18) {
                    System.out.println(nome + " é " + estadoCivil + " e tem " + idade1 + " anos (maior de idade).");
                } else {
                    System.out.println(nome + " é menor de idade, tem apenas " + idade1 + " anos.");
                }
                break;
        }

        switch (idade2) {
            case 18:
                System.out.println(nome + " é " + estadoCivil + " e tem " + idade2 + " anos (acabou de atingir a maioridade).");
                break;
        
            default:
                if (idade2 > 18) {
                    System.out.println(nome + " é " + estadoCivil + " e tem " + idade2 + " anos (maior de idade).");
                } else {
                    System.out.println(nome + " é menor de idade, tem apenas " + idade2 + " anos.");
                }
                break;
        }
    }
}

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        try{
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        }
        catch (InputMismatchException e){
            System.err.println("Os Campos idade e altura precisam ser númericos");
        }

    } 
}

/*código com loop pedindo ao usuario que insira uma informação válida
 
 * public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome = pedirNome(scanner);
        String sobrenome = pedirSobrenome(scanner);
        int idade = pedirIdade(scanner);
        double altura = pedirAltura(scanner);

        // imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }

    private static String pedirNome(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Digite seu nome");
                return scanner.next();
            } catch (Exception e) {
                System.err.println("Erro ao ler o nome. Tente novamente.");
            }
        }
    }

    private static String pedirSobrenome(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Digite seu sobrenome");
                return scanner.next();
            } catch (Exception e) {
                System.err.println("Erro ao ler o sobrenome. Tente novamente.");
            }
        }
    }

    private static int pedirIdade(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Digite sua idade");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Idade inválida. Por favor, insira um número.");
                scanner.next(); // limpar o buffer
            }
        }
    }

    private static double pedirAltura(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Digite sua altura");
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.err.println("Altura inválida. Por favor, insira um número.");
                scanner.next(); // limpar o buffer
            }
        }
    }
}
 */
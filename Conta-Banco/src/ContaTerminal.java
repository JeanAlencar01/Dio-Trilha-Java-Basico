import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o Usuário

        //Obter pelo Scanner os valores digitados no Terminal

        //Exibir Mensagem de Conta Criada

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, Digite o numero da Agencia: ");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, Digite o numero da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Por favor, Digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, Digite o saldo Inicial: ");
        double saldo = scanner.nextDouble();
        String mensagem = "Ola " + nomeCliente + ", obrigado por criar uma conta em nosso Banco, sua Agencia e " 
                + agencia + ", Conta " + numero + " e seu Saldo R$ " + saldo + " ja esta Disponivel para Saque.";
        System.out.println(mensagem);        

    }
}

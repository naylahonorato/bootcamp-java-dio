import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;
    
    
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,sua agência é "+ agencia +" , conta "+numero+ " e seu saldo "+saldo+
        " já está disponível para saque.");

    }
    
}

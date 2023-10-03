import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            int numero = 1021;
            double saldo = 237.48;

            System.out.println("Por favor, digite seu nome completo: ");
            String nomeCliente = scanner.next();


            System.out.println("Por favor, digite o número da Agência: ");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o valor do deposito inicial: ");
            saldo = scanner.nextDouble();
            
            System.out.println("Olá " + nomeCliente + ", ");
            System.out.println("obrigado por abrir uma conta em nosso banco, ");
            System.out.println("sua agência: " + agencia +" / conta n°: " + numero + " e ");
            System.out.println("seu saldo: R$ " + saldo + ", já está disponível para saque. ");
        }
        
    }
}

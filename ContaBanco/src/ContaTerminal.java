import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;
import java.util.InputMismatchException;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Calendar relogio = Calendar.getInstance();
        int hora = relogio.get(Calendar.HOUR_OF_DAY);

        if (hora > 6 && hora < 12) {
            System.out.println("Bom Dia");
        } else if (hora > 12 && hora < 18) {
            System.out.println("Boa Tarde");
        } else {
            System.out.println("Boa Noite");
        }

        System.out.println("Data/Hora atual: "+ relogio.getTime());

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            int numero = 1021;
            double saldo = 237.48;

            System.out.println("Por favor, digite seu nome completo: ");
            String nomeCliente = scanner.next();

            System.out.println("Por favor, digite o número da Agência: ");
            int agencia = scanner.nextInt();

            System.out.println("Por favor, digite o valor do deposito inicial: ");
            saldo = scanner.nextDouble();

            System.out.println("Olá " + nomeCliente + ", ");
            System.out.println("obrigado por abrir uma conta em nosso banco, ");
            System.out.println("sua agência: " + agencia + " / conta n°: " + numero + " e ");
            System.out.println("seu saldo: R$ " + saldo + ", já está disponível para saque. ");
      
        } catch(InputMismatchException e) {
           
            System.out.println("Digite os valores corretamente.");
        }

    }
}

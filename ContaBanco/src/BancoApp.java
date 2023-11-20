//import java.math.BigDecimal;
//import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do empréstimo: ");
        double valorInicial = scanner.nextDouble();
        
        System.out.println("Digite a taxa de juros: 0,00");
        double taxaJuros = scanner.nextDouble();
        
        System.out.println("Digite a duração em anos do empréstimo: ");
        int periodo = scanner.nextInt();
        
        System.out.println(String.format("%.2f",valorInicial));
        System.out.println(taxaJuros);

        double valorFinal = valorInicial;

        for ( int i = 1; i <= periodo; i++){
          valorFinal = valorFinal + valorFinal * taxaJuros;
        }
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        String valorFormatado = new DecimalFormat("#,##0.00").format(valorFinal);
        System.out.println("R$ " + valorFormatado);

        scanner.close();
    }
}

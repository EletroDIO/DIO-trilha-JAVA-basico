import java.util.Scanner;

public class DescontoImposto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do salário bruto:");
        float valorSalario = entrada.nextFloat();
        System.out.println("Digite o valor total dos beneficios:");
        float valorBeneficio = entrada.nextFloat();

        entrada.close();
        float valorImposto = 0;

        if (valorSalario > 0 && valorSalario <= 1100 ){
            valorImposto = 0.05F * valorSalario;
        } else if(valorSalario > 2500) {
            valorImposto = 0.15F * valorSalario;
        } else {
            valorImposto = 0.1F * valorSalario;
        }
           
        float salarioLiquido = valorSalario - valorImposto + valorBeneficio;
        System.out.println("Desconto Imposto de Renda: R$" + String.format("%.2f", valorImposto));
        System.out.println("Saldo salário: R$" + String.format("%.2f", salarioLiquido));

    }

}

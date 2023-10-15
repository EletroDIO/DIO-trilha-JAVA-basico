
//import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class PlanoOperadora {
    

    public static void criarConta() {

        String basic = "100 minutos de ligação";
        String midia = "";
        String turbo = "";
        String nomePlano = "";
        String plano = "";

        Scanner entrada = new Scanner(System.in);

        if (entrada.hasNextLine()) {
            plano = entrada.next();
        } else {
            System.out.println("ERRO!!!");
        }

        nomePlano = (Objects.equals(plano,"B")) ? "BASIC: "
               : (Objects.equals(plano,"M")) ? "MIDIA: " : (Objects.equals(plano, "T")) ? "TURBO: " : "Escolha B, M ou T.";
        System.out.println(nomePlano);

        switch (plano) {
            case "T": {
                nomePlano = "TURBO: ";
                break;
            }
            case "M": {
                nomePlano = "MIDIA ";
                break;
            }
            case "B": {
                nomePlano = "BASIC ";
                break;
            }
            default: {
                nomePlano = "Escolha B, M ou T.";
            }
        }

        switch (plano) {
            case "T": {
                turbo = " + 5Gb Youtube";
            }
            case "M": {
                midia = " + Whats e Intagram grátis";
            }
            case "B": {
                System.out.println(nomePlano + basic + midia + turbo + ".");
                entrada.close();
                break;
            }
            default: {
                System.out.println("Valor Inválido " + nomePlano);
                criarConta();
            }
        }

    }

    public static void main(String[] args) throws Exception {

        System.out.println("Digite B, M ou T e conheça um dos planos.");
        criarConta();
    }
}
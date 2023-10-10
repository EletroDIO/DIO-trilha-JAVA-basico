import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(4, 9);
        // gerando numero aleatorio
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(5) == 2;
        String resposta = atendeu ? " Agora sim.":" Ainda não, continue tentando.";
        System.out.println("Atendeu? " + resposta);
        // negando o ato de continuar tocando
        return !atendeu;
    }

    public static void main(String[] args) {

        double mesada = 50.0;
        Double total = 0.0;
        int contador = 0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;

            contador++;
            System.out.println(contador + "n° Doce de valor: " + valorDoce + " Adicionado no carrinho.");
            mesada = mesada - valorDoce;
            total = total + valorDoce;
            System.out.println("Mesada: " + mesada);
            System.out.println(" ");
        }
        System.out.println(contador + " doces total: " + total);
        System.out.println("Joãozinho gastou toda a sua mesada em doces.");

        /*
         * Não se preocupe quanto a formatação de valores
         * Iremos explorar os recursos de formatação em breve !!
         */
        System.out.println(" ");
        System.out.println("Discando...");

        do {
            // excutando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

        } while (tocando());

        System.out.println("Alô !!!");

        System.out.println(" ");
        int num = 5, count = 1, soma = 0;
        do {
            num += count;
            System.out.println(num);
            count++;
            soma = soma + num;
        } while (count <= 3);

            System.out.println("ToTal = " + soma);

    }
}

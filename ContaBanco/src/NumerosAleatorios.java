import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {

        Random gerador = new Random();
        double numero = 0;
        double aleatorio;

        int i = 1;
        while (i <= 10) {
            aleatorio = gerador.nextDouble(10, 99);
            if (numero != aleatorio) {
                numero = aleatorio * 100;

                System.out.println(Double.toString(numero).substring(0, 7));

                i++;
            }
        }

    }
}

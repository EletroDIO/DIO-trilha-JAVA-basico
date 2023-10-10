import java.util.Random;

public class ExemploFor {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("Aluno: " + alunos[x] + " Matricula: " + (x + 1000));
        }

        System.out.println("Turma com " + alunos.length + " alunos.");
        // Forma abreviada
        for (String aluno : alunos) {
            System.out.println(aluno);

        }

        System.out.println("Os 3 primeiros da lista:");
        for (int numero = 0; numero <= 3; numero++) {
            if (numero == 3)
                break;

            System.out.println(alunos[numero]);

        }
        int X = 2;
        System.out.println("Remove o terceiro da lista: " + alunos[X]);
        for (int numero = 0; numero < 4; numero++) {
            if (numero == X)
                continue;

            System.out.println(alunos[numero]);

        }

        System.out.println(" ");
        System.out.println("Discando...");

        boolean atendeu;
        do {

            System.out.println("Telefone tocando");
            atendeu = new Random().nextInt(5) == 2;
            String resposta = atendeu ? " Agora sim." : " Ainda não, continue tentando.";
            System.out.println("Atendeu? " + resposta);

        } while (!atendeu);

        System.out.println("Alô !!!");

        System.out.println(" ");
        for(int x=0; x<=10; x++){
            if(x % 2 == 0) //% operador que representa módulo de uma divisão
                System.out.print(x + " ");
        }

    }
}


import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OrdemAlfabetica {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList < String > ativos = new ArrayList < > ();

    //Entrada dos tipos de ativos
    System.out.println("Numero de letras: ");
    int quantidadeAtivos = scanner.nextInt();
    scanner.nextLine();

    // Entrada dos códigos dos ativos
    for (int i = 0; i < quantidadeAtivos; i++) {
      System.out.println("digite uma letra: ");
      String codigoAtivo = scanner.nextLine();
      ativos.add(codigoAtivo);
    }

    scanner.close();
    //TODO: Ordenar os ativos em ordem alfabética.

    Collections.sort(ativos);
    System.out.println(ativos);
    //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.

    for (String item : ativos) {
        System.out.println(item);
    }
  }
}

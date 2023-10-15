
public class FormatadorDeCep {
    public static void main(String[] args) {
           int indice;
        try {

            String cepFormatado = formatarCep("25807190");
            System.out.println(cepFormatado.substring(0, 2) + "." + cepFormatado.substring(2, 5) + "-"
                    + cepFormatado.substring(5));
             indice = 2;

        } catch (CepInvalidoException e) {
           // e.printStackTrace();
            System.out.print("Formato inválido! ");
            indice = 5;
        }

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[indice]);
          } catch (Exception e) {
            System.out.println("Numero não encontrado.");
          } finally {
            System.out.println("Obrigado.");
          }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        return cep;
    }

}

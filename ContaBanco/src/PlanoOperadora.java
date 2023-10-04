public class PlanoOperadora {
    public static void main(String[] args) throws Exception {

      String basic = "100 minutos de ligação";
      String midia = "";
      String turbo = "";

      String plano = "T"; // M / T
      String nomePlano = plano == "B" ? "BASIC: " : plano == "M" ? "MIDIA: " : plano == "T" ? "TURBO: " : "Escolha B, M ou T.";

		switch (plano) {
			case "T": {
				turbo = " + 5Gb Youtube";
			}
			case "M": {
				midia = " + Whats e Intagram grátis";
			}
			case "B": {
				System.out.println(nomePlano + basic + midia + turbo + ".");
                break;
			}
            default: {
                System.out.println("Plano Inválido " + nomePlano);
            }
		}

    }
}

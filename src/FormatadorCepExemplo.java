public class FormatadorCepExemplo {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("23.765-064");
    } catch (CepInvalidoException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  static String formatarCep(String  cep) throws CepInvalidoException {
    if (cep.length() != 8) {
      throw new CepInvalidoException(cep);

      return "23.765-064";
    }
  }
}

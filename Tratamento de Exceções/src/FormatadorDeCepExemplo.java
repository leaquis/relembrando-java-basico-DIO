public class FormatadorDeCepExemplo {
    public static void main(String[] args) {
        
        try {
            String CepFormatado = formatarCep("2376506");
            System.out.println(CepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP tem que ter 8 numeros");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8) {
            throw new CepInvalidoException();

            
        } return "23.765-064";
    }
}

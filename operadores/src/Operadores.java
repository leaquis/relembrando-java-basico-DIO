public class Operadores {
    public static void main(String[] args) throws Exception {
        //igualdade
        String nome = "Giovani";
        int idade = 26;
        double peso = 80.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        
        //Operações
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18% 3;
        double resultado = (10 * 7) + (20/4);

        //Concatenação
        String nomeCompleto = "Giovani " + "Ramos";

        //Operadores Unarios
        int numero = 5;
        numero = -numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);
    }
}

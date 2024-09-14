public class Operadores {
    public static void main(String[] args) throws Exception {
        //  igualdade
        String nome = "Giovani";
        int idade = 26;
        double peso = 80.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        
        //  Operações
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18% 3;
        double resultado = (10 * 7) + (20/4);

        //  Concatenação
        String nomeCompleto = "Giovani " + "Ramos";

        //  Operadores Unarios
        int numero = 5;
        numero = -numero;

        //System.out.println(numero);

        numero = numero * -1;

        //System.out.println(numero);


        //  x repetição

        int numero2 = 5;
        numero2++;
        //numero2 = numero2 + 1;

        //System.out.println(numero2);

        boolean variavel = true;

        System.out.println(!variavel);

        //  Operador Ternario

        //<Expressão Condicional> ? <Caso a condição seja true> : <Caso a condição seja false>
        int a, b;

        a = 5;
        b = 6;
        String resultado2 = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado2);

        //  Operadores Relacionais

        int variavel1 = 1;
        int variavel2 = 2;

        boolean simNao = variavel1 == variavel2;

        System.out.println("Variavel 1 é igual a Variavel 2? " + simNao);

        simNao = variavel1 != variavel2;

        System.out.println("Variavel 1 é diferente da Variavel 2? " + simNao);

        simNao = variavel1 > variavel2;

        System.out.println("Variavel 1 é maior que a Variavel 2? " + simNao);

        simNao = variavel1 < variavel2;

        System.out.println("Variavel 1 é menor que a Variavel 2? " + simNao);
    }
}

/**
 * <h1>Calculadora</h1>
     * A Calculadora realiza operações matemáticas entre números inteiros
     * <p>
     * <b>Note:</b> Leia atentamente a documentação desta classe
     * para desfrutar dos recursos oferecidos pelo autor
     * 
     * @author Giovani Ramos
     * @version 1.0
     * @since 22/09/2024
 */
public class Calculadora {
    /**
     * Este metodo é utilizado para somar dois números inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado desse método é a soma dos dois números.
     */

    public int somar(int numeroUm, int numeroDois){
        return numeroUm + numeroDois;
    }
    
    /*
     * Exemplo de metodo MAL DOCUMENTADO!!!
     */
    public int somaMultiplica(int n, int x, String m) {
        int r = 0; // r é igual ao resultado
        if (m == "M") { //M= multiplicação
            r = n * x;
        } else {
            //se não soma
            r = n + x;
        }
        return r;
    }
}

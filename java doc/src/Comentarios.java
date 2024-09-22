public class Comentarios {
    public static void main(String[] args) {
        // Olá, eu sou um comentário de linha única
        /*
         * Olá,
         * eu
         * sou
         * um
         * comentario
         * de
         * multiplas
         * linhas
         */
    }
    /**
     * Barra com dois estaristicos cria um comentário
     * 
     */
    public void metodo() {

    }

    //Era pro javadoc rodar e fazer a documentação dessa caraia mas não ta funcionando
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

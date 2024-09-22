public class SobreMim {
    public static void main(String[] args) throws Exception {
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, eu me chamo " + nome + " " + sobrenome);
        System.out.println("tenho " + idade + " anos de idade");
        System.out.println("Minha altura é " + altura + " cm");
    }
}

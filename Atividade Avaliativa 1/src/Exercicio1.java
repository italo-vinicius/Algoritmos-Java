public class Exercicio1 {
    public static int X(int a) {
        int soma = 0;
        for (int i = 1; i <= a; i++) {
            soma += i;
        }
        return soma;
    }

    public static void main(String[] arg) {
        System.out.println("O resultado será: " + X(8));
    }
}
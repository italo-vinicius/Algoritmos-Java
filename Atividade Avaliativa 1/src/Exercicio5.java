public class Exercicio5 {
    public static void main(String[] args) {
        int numero = 10;
        System.out.println("Número " + numero + " em binário: " + converterParaBinario(numero));
    }

    public static String converterParaBinario(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";

        return converterParaBinario(n / 2) + (n % 2);
    }
}

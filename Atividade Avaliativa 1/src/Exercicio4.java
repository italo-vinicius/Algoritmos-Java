public class Exercicio4 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("O " + n + "º número da sequência de Pell é: " + calcularSequenciaDepell(n));
    }

    public static int calcularSequenciaDepell(int n) {
        if (n == 0 || n == 1) return n;

        return 2 * calcularSequenciaDepell(n - 1) + calcularSequenciaDepell(n - 2);
    }
}

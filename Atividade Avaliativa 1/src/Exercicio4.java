public class Exercicio4 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("O " + n + "º número da sequência de Pell é: " + calcularSequenciaDePell(n));
    }

    public static int calcularSequenciaDePell(int n) {
        if (n == 0 || n == 1) return n;

        return 2 * calcularSequenciaDePell(n - 1) + calcularSequenciaDePell(n - 2);
    }
}

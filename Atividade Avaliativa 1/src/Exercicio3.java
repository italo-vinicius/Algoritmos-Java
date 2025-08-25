import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro N: ");

        int N = sc.nextInt();
        int resultado = calcularTribonacci(N);

        System.out.println("O " + N + "º número da sequência de Tribonacci é: " + resultado);
    }

    public static int calcularTribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 0;
        if (n == 2) return 1;

        return calcularTribonacci(n - 1) + calcularTribonacci(n - 2) + calcularTribonacci(n - 3);
    }
}

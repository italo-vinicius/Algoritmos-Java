import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo N: ");

        int N = sc.nextInt();
        double resultado = calculaInversao(N);

        System.out.printf("O resultado é: %.2f", resultado);
    }

    public static double calculaInversao(int n) {
        if (n == 0) {
            return 0;
        }

        return 1.0 / n + calculaInversao(n - 1);
    }
}

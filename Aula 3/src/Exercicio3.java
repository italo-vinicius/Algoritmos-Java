import java.util.Scanner;

public class Exercicio3 {
    /*
        Crie um método chamado encontrarPrimosIntervalo que aceita dois números inteiros (inicio e fim),
        como parâmetros e mostre na tela todos os números primos desse intervalo.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero inicial: ");
        int valorInicial = sc.nextInt();

        System.out.print("Digite o numero final: ");
        int valorFinal = sc.nextInt();

        encontrarPrimosIntervalo(valorInicial, valorFinal);
    }

    public static void encontrarPrimosIntervalo(int valorInicial, int valorFinal) {
        for (int i = valorInicial; i <= valorFinal; i++) {
            if (i <= 1) {
                continue;
            }

            boolean isPrimo = false;

            for (int j = 1; j <= i; j++) {
                if ((j == 1 || i == j) && i % j == 0) {
                    isPrimo = true;
                } else if (i % j == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                System.out.println(i);
            }
        }
    }
}
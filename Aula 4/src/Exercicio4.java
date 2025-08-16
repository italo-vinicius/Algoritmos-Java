import java.util.Scanner;

public class Exercicio4 {
    /*
       Criar uma função recursiva que calcule o n-ésimo número da sequência de Fibonacci.
       Sendo a sequência de fibonacci, o resultado da soma do elemento anterior e do atual
       resulta no valor do próximo elemento da sequência. A sequência inicia com os valores
       0 e 1(desconsiderar o inicio ‘0’). Exemplo:
        Número: 5
        Cálculo: 0 , 1 , 1 , 2 , 3 , 5
        Resultado: 5
    */
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        int resultado = calcularFibonacci(valor);
        System.out.println("Resultado: " + resultado);
    }

    public static int calcularFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
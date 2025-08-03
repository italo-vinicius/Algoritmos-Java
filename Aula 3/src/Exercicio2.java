import java.util.Scanner;

public class Exercicio2 {
    /*
        Crie um método chamado calcularFibonacci que aceita um número inteiro n como parâmetro e retorna o n-ésimo termo da sequência de Fibonacci.
        A sequência de Fibonacci começa com 0 e 1, e cada termo subsequente é a soma dos dois termos anteriores (0, 1, 1, 2, 3, 5, 8, ...).
        Chame esse método e informe para que o usuário informe o n-ésimo termo da sequência de Fibonacci e exiba o resultado.
    */
    public static void main(String[] args) {
        System.out.println("Informe o n-ésimo termo da sequência de Fibonacci desejado: ");
        Scanner sc = new Scanner(System.in);
        Integer valor = sc.nextInt();

        int resultado = calcularFibonacci(valor);
        System.out.println("O " + valor + "º termo da sequência de Fibonacci é: " + resultado);
    }

    public static int calcularFibonacci(int valor) {
        int primeiroTermoAnterior = 0;
        int segundoTermoAnterior = 1;

        if (valor <= 1) {
            return primeiroTermoAnterior;
        } else if (valor == 2) {
            return segundoTermoAnterior;
        }

        int somaTermos = 1;
        int contador = 2;

        while (contador < valor) {
            somaTermos = primeiroTermoAnterior + segundoTermoAnterior;

            primeiroTermoAnterior = segundoTermoAnterior;
            segundoTermoAnterior = somaTermos;

            contador++;
        }

        return somaTermos;
    }
}

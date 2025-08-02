import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        Integer valor = sc.nextInt();
        imprimirTabuada(valor);
    }

    /*
        Escreva um procedimento que imprima a tabuada de um número inteiro dado como entrada.
    */
    public static void imprimirTabuada(Integer valor) {
        for(Integer i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", valor, valor, valor * i );
        }
    }
}

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        Double valor = sc.nextDouble();

        Integer valorAbsoluto = retornarValorAbsoluto(valor);
        System.out.println("O numero é: " + valorAbsoluto);
    }

    /*
        Escreva uma função que retorne o valor absoluto de um número passado como parâmetro.
     */
    public static Integer retornarValorAbsoluto(Double valor) {
        return (int) Math.abs(valor);
    }
}

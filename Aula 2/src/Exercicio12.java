import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        Integer valor = sc.nextInt();

        String parOuImpar = parOuImpar(valor);
        System.out.println("O numero é: " + parOuImpar);
    }

    /*
        Escreva uma função que verifique se um número passado como parâmetro é par ou ímpar.
     */
    public static String parOuImpar(Integer valor) {
        return valor % 2 == 0 ? "Par" : "Impar";
    }
}

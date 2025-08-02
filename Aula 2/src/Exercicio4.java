import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        Integer valor = sc.nextInt();
        imprimirParOuImpar(valor);
    }

    /*
        Criar um procedimento que deve receber um valor inteiro positivo como parâmetro e exibir se
        o valor informado pelo usuário é par ou ímpar.
    */
    public static void imprimirParOuImpar(Integer valor) {
        if (valor % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}

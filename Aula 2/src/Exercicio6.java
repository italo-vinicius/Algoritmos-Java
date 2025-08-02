import java.util.Scanner;

public class Exercicio6 {
    /*
        Crie um programa que tenha um procedimento que imprima todos os números ímpares entre
        dois números inteiros dados como entrada e outro procedimento com valores pares.
    */
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        Integer valor = sc.nextInt();

        System.out.println("Digite outro numero: ");
        Integer valor2 = sc.nextInt();

        System.out.println("--------PARES----------");
        imprimirPares(valor, valor2);

        System.out.println("--------IMPARES----------");
        imprimirImpares(valor, valor2);
    }

    public static void imprimirPares(Integer valor, Integer valor2) {
        for (Integer i = valor; i <= valor2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void imprimirImpares(Integer valor, Integer valor2) {
        for (Integer i = valor; i <= valor2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

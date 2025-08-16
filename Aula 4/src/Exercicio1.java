import java.util.Scanner;

public class Exercicio1 {
    /*
       Criar uma função recursiva que o usuário informe um valor inteiro e realize a soma de todos os números naturais
       pares de 1 até o valor informado pelo usuário. Exemplo:
        Número: 9
        Resultado: 2+4+6+8 = 20
    */
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        System.out.println("O resultado da soma foi: " + somaRecursiva(valor));
    }

    public static int somaRecursiva(int valor) {
        if(valor % 2 != 0) {
            valor = valor - 1;
        }

        if (valor <= 0) {
            return valor;
        } else {
            return valor + somaRecursiva(valor - 2);
        }
    }
}
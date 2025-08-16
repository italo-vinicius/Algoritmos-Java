import java.util.Scanner;

public class Exercicio2 {
    /*
       Criar uma função recursiva que receba um array unidimensional de tamanho N de inteiros e retorne a soma de todos os seus elementos.
       Exemplo:
        Array: [4, 8, 1,7, 2, 0]
        Soma: 22
    */
    public static void main(String[] args) {
        int[] valor = {4, 8, 1, 7, 2, 0};
        int somaTotal = somaRecursivaVetor(valor, 0);
        System.out.println("O resultado da soma foi: " + somaTotal);
    }

    public static int somaRecursivaVetor(int[] valor, int posicaoInicial) {
        if (posicaoInicial == valor.length - 1) {
            return valor[posicaoInicial];
        } else {
            return valor[posicaoInicial] + somaRecursivaVetor(valor, posicaoInicial + 1);
        }
    }
}
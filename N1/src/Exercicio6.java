import java.util.Scanner;

public class Exercicio6 {
    /*
       Analise o código e explique o funcionamento da função recursiva baixo. Alem
        disso, baseado nas chamadas realizadas na função main, qual será o resultado de cada uma
        delas.
    */
    public static void main(String[] args) {
        int[] vetor = {1, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(exercicio06(vetor, 8, 0, vetor.length - 1));
        System.out.println(exercicio06(vetor, -3, 0, vetor.length - 1));
        System.out.println(exercicio06(vetor, 2, vetor.length - 1, 0));
        System.out.println(exercicio06(vetor, 7, 0, 0));
        System.out.println(exercicio06(vetor, 1, vetor.length - 1, 0));
    }

    public static int exercicio06(int[] arr, int alvo, int esquerda, int direito) {
        if (esquerda > direito) {
            return -1;
        }

        int mid = esquerda + (direito - esquerda) / 2;

        if (arr[mid] == alvo) {
            return mid;
        }

        if (arr[mid] > alvo) {
            return exercicio06(arr, alvo, esquerda, mid - 1);
        } else {
            return exercicio06(arr, alvo, mid + 1, direito);
        }
    }
}
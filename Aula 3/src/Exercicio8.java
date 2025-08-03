import java.util.Scanner;

public class Exercicio8 {
    /*
      Crie um método chamado imprimirVetor que recebe como parâmetro um vetor de tamanho qualquer.
      O método deverá imprimir todos os elementos desse vetor na tela.
    */
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }

        imprimirVetor(vetor);
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}
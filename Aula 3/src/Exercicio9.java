import java.util.Scanner;

public class Exercicio9 {
    /*
         Crie um método chamado imprimirMatriz que recebe como parâmetro uma matriz de tamanho qualquer.
         O método deverá imprimir todos os elementos dessa matriz na tela.
         (Tente utilizar a função do exercício 3 para complementar a implementação desse método).
    */
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
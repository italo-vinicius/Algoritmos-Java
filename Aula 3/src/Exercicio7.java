import java.util.Scanner;

public class Exercicio7 {
    /*
      Crie um método chamado preencherMatriz que recebe como parâmetro uma matriz de inteiro de tamanho qualquer.
      O método deverá retornar a matriz preenchido com valores aleatórios entre 1 e 100.
    */
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        preencherMatriz(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void preencherMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }
}
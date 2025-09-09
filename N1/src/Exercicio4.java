public class Exercicio4 {
    /*
        Complete o código abaixo com um método recursivo para percorrer um array
        bidimensional e mostre na tela todos os elementos desse array.
    */
    public static void main(String[] args) {
        int [][] matriz = { {1,1,1}, {2,2,2}, {3,3,3} };
        imprimir(matriz, 0, 0);
    }

    public static void imprimir(int[][] matriz, int linha, int coluna) {
        if (linha >= matriz.length) {
            return;
        }

        if (coluna >= matriz[linha].length) {
            System.out.println();
            imprimir(matriz, linha + 1, 0);
            return;
        }

        System.out.printf("%d ", matriz[linha][coluna]);
        imprimir(matriz, linha, coluna + 1);
    }
}
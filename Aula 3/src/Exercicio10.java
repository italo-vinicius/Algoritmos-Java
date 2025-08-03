public class Exercicio10 {

    /*
        Crie um método chamador verificarQuadradoMagico que recebe uma matriz e retorna true se for um quadrado mágico (somas de linhas, colunas e diagonais são iguais).
    */
    public static void main(String[] args) {
        int[][] matriz1 = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };

        int[][] matriz2 = {
                {16, 2, 3, 13},
                {5, 11, 10, 8},
                {9, 7, 6, 12},
                {4, 14, 15, 1}
        };

        int[][] matriz3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matriz4 = {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
        };

        testarMatriz(matriz1);
        testarMatriz(matriz2);
        testarMatriz(matriz3);
        testarMatriz(matriz4);
    }

    public static void testarMatriz(int[][] matriz) {
        if (verificarQuadradoMagico(matriz)) {
            System.out.println("É um quadrado mágico!");
        } else {
            System.out.println("Não é um quadrado mágico.");
        }
    }

    public static boolean verificarQuadradoMagico(int[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            if (matriz[i].length != n) {
                return false;
            }
        }

        int somaEsperada = 0;
        for (int j = 0; j < n; j++) {
            somaEsperada += matriz[0][j];
        }

        for (int i = 0; i < n; i++) {
            int somaLinha = 0;
            for (int j = 0; j < n; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha != somaEsperada) {
                return false;
            }
        }

        for (int j = 0; j < n; j++) {
            int somaColuna = 0;
            for (int i = 0; i < n; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna != somaEsperada) {
                return false;
            }
        }

        int somaDiagonal1 = 0;
        for (int i = 0; i < n; i++) {
            somaDiagonal1 += matriz[i][i];
        }
        if (somaDiagonal1 != somaEsperada) {
            return false;
        }

        int somaDiagonal2 = 0;
        for (int i = 0; i < n; i++) {
            somaDiagonal2 += matriz[i][n - 1 - i];
        }
        if (somaDiagonal2 != somaEsperada) {
            return false;
        }

        return true;
    }
}

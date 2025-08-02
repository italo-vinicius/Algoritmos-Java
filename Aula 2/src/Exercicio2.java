public class Exercicio2 {
    public static void main(String[] args) {
        imprimirParesZeroAteCem();
    }

    /* Escreva um procedimento que imprima todos os números pares de 0 a 100. */
    private static void imprimirParesZeroAteCem() {
        for(Integer i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

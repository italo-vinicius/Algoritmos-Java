public class Exercicio3 {
    public static void main(String[] strings) {
        imprimirTabuadaDoCinco();
    }

    /* Escreva um procedimento que mostre na tela toda a tabuada do 5. Exemplo:
        5 x 1 = 5
        5 x 2 = 10
        5 x 3 = 15
        …
        5 x 10 = 50
    */
    private static void imprimirTabuadaDoCinco() {
        for(Integer i = 1; i <= 10; i++) {
            System.out.printf("5 x %d = %d\n", i, 5 * i );
        }
    }
}

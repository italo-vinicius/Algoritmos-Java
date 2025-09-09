import java.util.Scanner;

public class Triangulo {
    /*
        Crie uma classe chamada Triangulo que contenha um método recursivo
        chamado imprimirTriangulo. Esse método deverá imprimir um triângulo, baseado nos
        valores informados como parâmetro.Valor: 5
        String: #
        Resultado:
        # # # # #
        # # # #
        # # #
        # #
        #
    */
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        System.out.println("Digite a String: ");
        String str = sc.next();

        imprimirTriangulo(valor, str);
    }

    public static void imprimirTriangulo(int valor, String str) {
        if (valor <= 0) {
            return;
        }

        for (int i = 0; i < valor; i++) {
            System.out.printf("%s ", str);
        }
        System.out.println();
        imprimirTriangulo(valor - 1, str);
    }
}
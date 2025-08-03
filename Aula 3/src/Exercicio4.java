import java.util.Scanner;

public class Exercicio4 {
    /*
       Crie um método chamado calcularPotencia que aceita dois números inteiros, base e expoente,
       como parâmetros e retorna a potência de base elevada a expoente.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = sc.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();

        int resultado = calcularPotencia(base, expoente);
        System.out.printf("A base %d elevada ao expoente %d tem como resultado %d", base, expoente, resultado);
    }

    public static int calcularPotencia(int base, int expoente) {
        return (int) Math.pow(base, expoente);
    }
}
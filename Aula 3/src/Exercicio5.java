import java.util.Scanner;

public class Exercicio5 {
    /*
      Crie um método que calcule a tetração de um número. O método deverá receber dois valores como argumentos do tipo inteiro,
      sendo eles base(entre 1 e 7) e altura(entre 2 e 4). A tetração é dada da seguinte forma:	ab , onde b é a base e a sendo a altura.
	  Exemplos:
        ³2 = 2²² = 2 elevado a 4 = 16
        ³3 = 3³³ = 3 elevado a 27 = 7.625.597.484.987

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base (Entre 1 e 7): ");
        int base = sc.nextInt();

        System.out.print("Digite a altura (Entre 2 e 4: ");
        int altura = sc.nextInt();

        if ((base < 1 || base > 7) || (altura < 2 || altura > 4)) {
            System.out.println("Foram informados valores invalidos!!!");
            return;
        }

        long resultado = calcularTetracaoNumero(base, altura);
        System.out.printf("O resultado foi de %d", resultado);
    }

    public static long calcularTetracaoNumero(int base, int altura) {
        long expoente = calcularExpoente(base, altura - 1);

        return (long) Math.pow(base, expoente);
    }

    public static long calcularExpoente(int base, int altura) {
        if (altura == 1) {
            return base;
        } else {
            return (long) Math.pow(base, calcularExpoente(base, altura - 1));
        }
    }
}
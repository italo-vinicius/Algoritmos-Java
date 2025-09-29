import java.util.Scanner;

public class Exercicio2 {
    /*
         Crie uma classe Calculadora que tenha três métodos chamados somar. O primeiro deve somar dois números inteiros,
         o segundo dois números de ponto flutuante, e o terceiro deve somar três números inteiros.
         Após isso crie uma classe chamada PrincipalCalculadora para testar os três métodos, exibindo os resultados no console.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Digite dois inteiros para somar: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Soma de dois inteiros: " + calc.somar(n1, n2));

        System.out.print("Digite dois números decimais para somar: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Soma de dois doubles: " + calc.somar(d1, d2));

        System.out.print("Digite três inteiros para somar: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("Soma de três inteiros: " + calc.somar(x, y, z));

        sc.close();
    }
}

class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}
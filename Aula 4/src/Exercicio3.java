import java.util.Scanner;

public class Exercicio3 {
    /*
    Criar uma função recursiva para calcular a potência de um número.
    O usuário deverá informar os valores da base e do expoente. Exemplo:
    Base: 3, expoente: 2    =>    3²    =>    9
	Base: 2, expoente: 3    =>    2³    =>    8
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = sc.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();

        System.out.println("O resultado foi: " + calcularPotencia(base, expoente));
    }

    public static int calcularPotencia(int base, int expoente) {
        if (expoente <= 1) {
            return base * expoente;
        } else {
            return base * calcularPotencia(base, expoente - 1);
        }
    }
}
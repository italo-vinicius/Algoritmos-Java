import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        Integer valor = sc.nextInt();

        if (valor <= 0) {
            System.out.println("O número não é positivo...");
            return;
        }

        Integer fatorial = calcularFatorial(valor);
        System.out.println("Fatorial de " + fatorial);
    }

    /*
        Criar uma função que receberá um valor inteiro positivo. A função deverá calcular o número
        fatorial dele ou 0 caso o valor informado for negativo ou zero.
     */
    public static Integer calcularFatorial(Integer valor) {
        if (valor <= 0) {
            return 1;
        } else {
            return valor * calcularFatorial(valor - 1);
        }
    }
}

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        Integer valor = sc.nextInt();

        Integer dobro = calcularDobro(valor);
        System.out.println("Dobro: " + dobro);
    }

    /*
        Escreva uma função que retorne o dobro de um número passado como parâmetro.
     */
    public static Integer calcularDobro(Integer valor) {
        return valor * 2;
    }
}

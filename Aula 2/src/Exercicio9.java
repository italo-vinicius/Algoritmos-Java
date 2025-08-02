import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        Integer valor = sc.nextInt();
        System.out.printf("Multiplo de 3? %s", isMultiploDe3(valor) ? "True" : "False");
    }

    /*
        Escreva uma função que retornará true caso o valor seja múltiplo de 3 ou false, caso contrário
    */
    public static Boolean isMultiploDe3(Integer valor) {
        return valor % 3 == 0;
    }

}

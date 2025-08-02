import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        Integer valor = sc.nextInt();
        System.out.printf("O %d ao quadrado é %d", valor, retornarQuadradoNumero(valor));
    }

    /*
        Escreva uma função que retorne o quadrado de um número inteiro qualquer Exemplo:
            5 = 25
            7 = 49
    */
    public static Integer retornarQuadradoNumero(Integer valor) {
        return valor * valor;
    }

}

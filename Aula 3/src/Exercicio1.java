import java.util.Scanner;

public class Exercicio1 {
    /*
        Crie um método chamado verificarPalindromo que aceita uma string como parâmetro e retorna true se
        a string for um palíndromo (ou seja, pode ser lida da mesma forma da esquerda para a direita e vice-versa),
        e false caso contrário.
    */
    public static void main(String[] args) {
        System.out.println("Digite a string: ");
        Scanner sc = new Scanner(System.in);
        String valor = sc.next();

        System.out.println(verificarPalindromo(valor));
    }

    public static boolean verificarPalindromo(String valor) {
        String valorReverso = new StringBuilder(valor.toLowerCase()).reverse().toString();
        return valor.toLowerCase().equals(valorReverso);
    }
}
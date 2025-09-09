import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        printNumbers(4);
//        printNumbers(-3);
    }

    public static void printNumbers(int n) {
        if (n >= 0) {
            System.out.print(n);
            printNumbers(n - 1);
            System.out.print(n + 1);
        }
    }
}
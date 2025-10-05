package Exercicio2;

public class TesteIngresso {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50);
        System.out.println(ingresso.exibirIngresso());

        IngressoVIP ingressoVIP = new IngressoVIP(50, 30);
        System.out.println(ingressoVIP.exibirIngresso());
    }
}
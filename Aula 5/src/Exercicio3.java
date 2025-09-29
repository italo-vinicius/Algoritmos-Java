import java.util.Scanner;

public class Exercicio3 {
    /*
        Escreva uma classe Retangulo que representa um retângulo com altura(double),
        largura(double) e área(double). Forneça métodos para calcular a área do retângulo e para
        alterar e consultar os valores da altura e largura. O construtor deve estar vazio. O usuário deve
        informar os valores de altura e largura e após isso, exibir o valor da área na tela. (Fórmula da
        área é altura x largura)
     */
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a altura do retângulo: ");
        double altura = scanner.nextDouble();

        System.out.print("Informe a largura do retângulo: ");
        double largura = scanner.nextDouble();

        retangulo1.setAltura(altura);
        retangulo1.setLargura(largura);

        retangulo1.exibirAreaRetangulo();
    }
}

class Retangulo {
    private double altura;
    private double largura;
    private double area;

    public void exibirAreaRetangulo() {
        double area = this.altura * this.largura;

        System.out.printf("\nA área do retângulo é: %.2f", area);
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

}
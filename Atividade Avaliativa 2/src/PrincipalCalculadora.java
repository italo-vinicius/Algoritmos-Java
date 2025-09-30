public class PrincipalCalculadora {
    /*
        Crie uma classe Calculadora com atributos privados valor1(double) e valor2(double) e métodos para realizar operações básicas como soma, subtração, multiplicação e divisão.
        Adicione um construtor nesta classe que receba dois valores inteiros. Crie uma classe chamada PrincipalCalculadora que tenha um objeto do tipo Calculadora.
        Utilize os métodos somar, subtração, multiplicação e divisão com os valores informados no construtor e mostre na tela o resultado de cada um dos cálculos.
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10, 5);

        System.out.println("Soma: " + calc.somar());
        System.out.println("Subtração: " + calc.subtrair());
        System.out.println("Multiplicação: " + calc.multiplicar());
        System.out.println("Divisão: " + calc.dividir());
    }
}

class Calculadora {
    private double valor1;
    private double valor2;

    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double somar() {
        return valor1 + valor2;
    }

    public double subtrair() {
        return valor1 - valor2;
    }

    public double multiplicar() {
        return valor1 * valor2;
    }

    public double dividir() {
        return valor2 != 0 ? valor1 / valor2 : 0;
    }
}
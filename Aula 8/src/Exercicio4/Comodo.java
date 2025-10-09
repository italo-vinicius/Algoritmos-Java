package Exercicio4;

public class Comodo {
    public String nome;
    public String moveis;
    public int qntPortas;
    public int qntJanelas;
    public double largura;
    public double comprimento;

    public Comodo(String nome, String moveis, int qntPortas, int qntJanelas, double largura, double comprimento) {
        this.nome = nome;
        this.moveis = moveis;
        this.qntPortas = qntPortas;
        this.qntJanelas = qntJanelas;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double calcularArea() {
        return largura * comprimento;
    }

    public String imprimirComodo() {
        return "Comodo: " + nome + "\nMoveis: " + moveis + "\nQuantidade de Portas: " + qntPortas +
               "\nQuantidade de Janelas: " + qntJanelas + "\nLargura: " + largura + "m" +
               "\nComprimento: " + comprimento + "m" + "\nArea: " + calcularArea() + "m²";
    }
}

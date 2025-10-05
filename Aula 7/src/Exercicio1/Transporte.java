package Exercicio1;

public class Transporte {
    protected int capacidade;
    protected double velocidadeMax;

    public Transporte(int capacidade, double velocidadeMax) {
        this.capacidade = capacidade;
        this.velocidadeMax = velocidadeMax;
    }

    public Transporte() {
        this.capacidade = 0;
        this.velocidadeMax = 0.0;
    }

    public void acelerar() {
        System.out.println("Acelerando o transporte até " + velocidadeMax + " km/h");
    }
}

package Exercicio1;

public class Aereo extends Transporte {
    protected String configuracao;

    public Aereo(int capacidade, double velocidadeMax, String configuracao) {
        super(capacidade, velocidadeMax);
        this.configuracao = configuracao;
    }

    public Aereo() {
        super();
        this.configuracao = "";
    }

    public void estabilizar() {
        System.out.println("Estabilizando o transporte aéreo...");
    }
}
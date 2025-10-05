package Exercicio1;

public class Aviao extends Aereo {
    public Aviao(int capacidade, double velocidadeMax, String configuracao) {
        super(capacidade, velocidadeMax, configuracao);
    }

    public Aviao() {
        super();
    }

    public void decolar() {
        System.out.println("Avião decolando...");
    }
}


package Exercicio1;

public class Automovel extends Terrestre {
    private int numeroPortas;

    public Automovel(int capacidade, double velocidadeMax, String cor, String placa, int numeroPortas) {
        super(capacidade, velocidadeMax, cor, placa);
        this.numeroPortas = numeroPortas;
    }

    public Automovel() {
        super();
        this.numeroPortas = 0;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }
}


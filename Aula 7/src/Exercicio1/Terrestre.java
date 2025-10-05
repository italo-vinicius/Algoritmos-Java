package Exercicio1;

public class Terrestre extends Transporte {
    protected String cor;
    protected String placa;

    public Terrestre(int capacidade, double velocidadeMax, String cor, String placa) {
        super(capacidade, velocidadeMax);
        this.cor = cor;
        this.placa = placa;
    }

    public Terrestre() {
        super();
        this.cor = "";
        this.placa = "";
    }

    public void freiar() {
        System.out.println("Freiando o veículo terrestre...");
    }
}

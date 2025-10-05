package Exercicio1;

public class Aquatico extends Transporte {
    protected String tipoMotor;
    protected int tamanho;

    public Aquatico(int capacidade, double velocidadeMax, String tipoMotor, int tamanho) {
        super(capacidade, velocidadeMax);
        this.tipoMotor = tipoMotor;
        this.tamanho = tamanho;
    }

    public Aquatico() {
        super();
        this.tipoMotor = "";
        this.tamanho = 0;
    }

    public void ligarSirene() {
        System.out.println("Ligando sirene do transporte aquático...");
    }

    public void deslizarLateral() {
        System.out.println("Deslizando lateralmente na água...");
    }
}

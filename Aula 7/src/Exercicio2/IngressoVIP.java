package Exercicio2;

public class IngressoVIP extends Ingresso {
    private float valorAdicional;

    public IngressoVIP() {
    }

    public IngressoVIP(float valor, float valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String exibirIngresso() {
        return "Valor do ingresso VIP: R$ " + (getValor() + valorAdicional);
    }
}
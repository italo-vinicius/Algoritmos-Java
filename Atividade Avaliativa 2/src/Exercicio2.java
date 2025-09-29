public class Exercicio2 {
    /*
        Crie uma classe ContaCorrente com atributos privados: saldo, número da conta e nome titular.
        Crie um construtor para preencher cada um dos atributos dessa classe e também implemente métodos para depositar(double valor), sacar(double valor) e verificarSaldo().
        Crie uma classe chamada PrincipalContaCorrente e crie um objeto do tipo ContaCorrente. Simule cada uma das operações (sacar, depositar e verificar saldo).
     */
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("12345-6", "Ítalo", 1000.0);

        conta.verificarSaldo();
        conta.depositar(500);
        conta.sacar(300);
        conta.verificarSaldo();
    }
}

class ContaCorrente {
    private double saldo;
    private String numeroConta;
    private String nomeTitular;

    public ContaCorrente(String numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
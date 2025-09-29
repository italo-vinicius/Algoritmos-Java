import java.util.Scanner;

public class Exercicio1 {
    /*
         Crie uma classe ContaCorrente com atributos privados: saldo, número da conta e nome titular.
         Crie um construtor para preencher cada um dos atributos dessa classe e também implemente métodos
         para depositar(double valor), sacar(double valor) e verificarSaldo().
         Crie uma classe chamada PrincipalContaCorrente e crie um objeto do tipo ContaCorrente.
         Simule cada uma das operações (sacar, depositar e verificar saldo).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaCorrente conta = new ContaCorrente("12345-6", "Ítalo", 1000.0);

        conta.verificarSaldo();

        System.out.print("Digite o valor para depositar: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);

        System.out.print("Digite o valor para sacar: ");
        double saque = sc.nextDouble();
        conta.sacar(saque);

        conta.verificarSaldo();

        sc.close();
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
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado: R$ " + valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado: R$ " + valor);
        } else {
            System.out.println("Saque inválido ou saldo insuficiente.");
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
package Exercicio3;

public class PrincipalPessoa {
    void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João Silva", 30, "12.345.678-9", "123.456.789-00", "Rua A, 123");
        Pessoa pessoa2 = new Pessoa("Maria Oliveira", 25, "98.765.432-1", "987.654.321-00", "Avenida B, 456");
        Pessoa pessoa3 = new Pessoa("Carlos Souza", 40, "11.222.333-4", "111.222.333-44", "Travessa C, 789");

        System.out.println("Informações da Pessoa 1:");
        Pessoa.exibirInformacoes(pessoa1);
        System.out.println();

        System.out.println("Informações da Pessoa 2:");
        Pessoa.exibirInformacoes(pessoa2);
        System.out.println();

        System.out.println("Informações da Pessoa 3:");
        Pessoa.exibirInformacoes(pessoa3);
    }
}

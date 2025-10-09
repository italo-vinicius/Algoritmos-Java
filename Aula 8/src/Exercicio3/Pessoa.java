package Exercicio3;

public class Pessoa {
    private String nome;
    private int idade;
    private String rg;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, int idade, String rg, String cpf, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public static void exibirInformacoes(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("RG: " + pessoa.rg);
        System.out.println("CPF: " + pessoa.cpf);
        System.out.println("Endereço: " + pessoa.endereco);
    }
}
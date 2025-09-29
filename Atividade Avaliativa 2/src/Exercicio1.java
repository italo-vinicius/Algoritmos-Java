public class Exercicio1 {
    /*
       Crie uma classe Pessoa com atributos privados: nome, idade e altura. Adicione métodos para realizar a manipulação desses atributos (exibição(get) e definição(set)).
       Crie uma classe chamada PrincipalPessoa, e nesta classe crie pelo menos duas instâncias da classe Pessoa. Defina valores para essas instâncias e mostre suas informações na tela.
    */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ítalo", 22, 1.80);
        Pessoa p2 = new Pessoa("Ana", 19, 1.65);

        System.out.println("Pessoa 1: " + p1.getNome() + ", idade: " + p1.getIdade() + ", altura: " + p1.getAltura());
        System.out.println("Pessoa 2: " + p2.getNome() + ", idade: " + p2.getIdade() + ", altura: " + p2.getAltura());
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
import java.util.Scanner;

public class Exercicio2 {
    /*
        Escreva uma classe Animal que representa um animal com nome e espécie. Forneça métodos
        para alterar e consultar os dados do animal. O construtor dessa classe deve estar vazio. Após o
        usuário informar os dados, deve-se exibi-los na tela.
     */
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do animal: ");
        String nome = scanner.next();

        System.out.print("Informe a espécie do animal: ");
        String especie = scanner.next();

        animal1.setNome(nome);
        animal1.setEspecie(especie);

        animal1.exibirAnimal();
    }
}

class Animal {
    private String nome;
    private String especie;

    public void exibirAnimal() {
        System.out.printf("\nAnimal: %s \nEspécie: %s \n\n", getNome(), getEspecie());
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

}